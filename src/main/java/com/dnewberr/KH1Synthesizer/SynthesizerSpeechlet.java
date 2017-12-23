package com.dnewberr.KH1Synthesizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.slu.Slot;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;

public class SynthesizerSpeechlet implements Speechlet {
    private static final Logger log = LoggerFactory.getLogger(SynthesizerSpeechlet.class);

	private static final String ITEM_SLOT = "Item";
	private static final String HEARTLESS_SLOT = "Heartless";
	private static final String ITEM_INTENT = "ItemIntent";
	private static final String LOCATION_INTENT = "LocationIntent";
	private static final String HELP_INTENT = "AMAZON.HelpIntent";
	private static final String STOP_INTENT = "AMAZON.StopIntent";
	private static final String CANCEL_INTENT = "AMAZON.CancelIntent";
	
	public static String GAME = "KH1";
	
	public SpeechletResponse onLaunch(LaunchRequest arg0, Session arg1) throws SpeechletException {
		log.info("onLaunch requestId={}, sessionId={}", arg0.getRequestId(), arg1.getSessionId());
		
		String speechOutput = "Welcome to the Kingdom Hearts Synthesizer Lookup. You can ask a question like, "
				+ "how do I get a blaze shard? ... Now, what can I help you with?";
		String repromptText = "For instructions on what you can say, please say help me.";
		
		return newAskResponse(speechOutput, repromptText);
	}

	public SpeechletResponse onIntent(IntentRequest arg0, Session arg1) throws SpeechletException {
		Intent intent = arg0.getIntent();
		String intentName = (intent != null) ? intent.getName() : null;
	
		log.info("onIntent requestId={}, sessionId={}, intentName={}", arg0.getRequestId(), arg1.getSessionId(), intentName);

		switch (intentName) {
			case ITEM_INTENT: return getDrop(intent);
			case LOCATION_INTENT: return getLocation(intent);
			case HELP_INTENT: return getHelp();
			case STOP_INTENT: return goodbye();
			case CANCEL_INTENT: return goodbye();
			default: String errorSpeech = "This is unsupported.  Please try something else.";
				return newAskResponse(errorSpeech, errorSpeech);
		}
	}

	public void onSessionStarted(SessionStartedRequest arg0, Session arg1) throws SpeechletException {
		log.info("onSessionStarted requestId={}, sessionId={}", arg0.getRequestId(), arg1.getSessionId());
	}

	public void onSessionEnded(SessionEndedRequest arg0, Session arg1) throws SpeechletException {
		log.info("onSessionEnded requestId={}, sessionId={}", arg0.getRequestId(), arg1.getSessionId());
	}
	
	private SpeechletResponse getDrop(Intent intent) {
		Slot itemSlot = intent.getSlot(ITEM_SLOT);
		if (itemSlot != null && itemSlot.getValue() != null) {
			String itemName = itemSlot.getValue();
			String drop = HeartlessItems.get(itemName);

			if (drop != null) {
				return newAskResponse(drop, "What else can I help you with?");
			} else {
				return errorResponse("how to get the item, " + itemName);
			}
		} else {
			return getHelp();
		}
	}

	private SpeechletResponse getLocation(Intent intent) {
		Slot heartlessSlot = intent.getSlot(HEARTLESS_SLOT);
		if (heartlessSlot != null && heartlessSlot.getValue() != null) {
			String heartlessName = heartlessSlot.getValue();
			String location = HeartlessLocations.get(heartlessName);

			if (location != null) {
				return newAskResponse(location, "What else can I help you with?");
			} else {
				return errorResponse("where to find the heartless called " + heartlessName);
			}
		} else {
			return getHelp();
		}
	}

	private SpeechletResponse getHelp() {
		String speechOutput = "You can ask where items are located, such as: how do I "
				+ "get a Blaze Shard. You can also ask where a heartless is, like, how do I find a White Mushroom, or, you can say exit... "
				+ "Now, what can I help you with?";
		String repromptText = "You can ask what heartless drop synthesis items, such as: who drops "
				+ "a Blaze Shard. You can also ask where a heartless is, like, how do I find a White Mushroom, or, you can say exit... "
				+ "Now, what can I help you with?";
		return newAskResponse(speechOutput, repromptText);
	}
	
	private SpeechletResponse goodbye() {
		PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
		outputSpeech.setText("Thanks for trying the Kingdom Hearts Synthesizer Lookup. Goodbye.");
		return SpeechletResponse.newTellResponse(outputSpeech);
	}

	private SpeechletResponse errorResponse(String message) {
		String speechOutput = "I'm sorry, I don't know " + message + ". What else can I help with?";
		String repromptSpeech = "What else can I help with?";
		return newAskResponse(speechOutput, repromptSpeech);
	}
	
	private SpeechletResponse newAskResponse(String stringOutput, String repromptText) {
		PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
		outputSpeech.setText(stringOutput);

		PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
		repromptOutputSpeech.setText(repromptText);
		Reprompt reprompt = new Reprompt();
		reprompt.setOutputSpeech(repromptOutputSpeech);

		return SpeechletResponse.newAskResponse(outputSpeech, reprompt);
	}
}
