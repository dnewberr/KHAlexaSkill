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
import com.amazon.speech.ui.SimpleCard;

public class SynthesizerSpeechlet implements Speechlet {
    private static final Logger log = LoggerFactory.getLogger(SynthesizerSpeechlet.class);

	private static final String ITEM_SLOT = "Item";
	private static final String HEARTLESS_SLOT = "Heartless";

	public SpeechletResponse onLaunch(LaunchRequest arg0, Session arg1) throws SpeechletException {
		log.info("onLaunch requestId={}, sessionId={}", arg0.getRequestId(), arg1.getSessionId());
		
		String speechOutput = "Welcome to the Kingdom Hearts Synthesizer Lookup. You can ask a question like, "
				+ "where can I find a blaze shard? ... Now, what can I help you with?";
		// If the user either does not reply to the welcome message or says
		// something that is not understood, they will be prompted again with
		// this text.
		String repromptText = "For instructions on what you can say, please say help me.";

		// Here we are prompting the user for input
		return newAskResponse(speechOutput, repromptText);
	}

	public SpeechletResponse onIntent(IntentRequest arg0, Session arg1) throws SpeechletException {
		log.info("onIntent requestId={}, sessionId={}", arg0.getRequestId(), arg1.getSessionId());

		Intent intent = arg0.getIntent();
		String intentName = (intent != null) ? intent.getName() : null;

		if ("ItemIntent".equals(intentName)) {
			return getDrop(intent);
		} else if ("LocationIntent".equals(intentName)) {
			return getLocation(intent);
		} else if ("AMAZON.HelpIntent".equals(intentName)) {
			return getHelp();
		} else if ("AMAZON.StopIntent".equals(intentName)) {
			PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
			outputSpeech.setText("Goodbye");
			return SpeechletResponse.newTellResponse(outputSpeech);
		} else if ("AMAZON.CancelIntent".equals(intentName)) {
			PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
			outputSpeech.setText("Goodbye");
			return SpeechletResponse.newTellResponse(outputSpeech);
		} else {
			String errorSpeech = "This is unsupported.  Please try something else.";
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

			// Get the recipe for the item
			String drop = HeartlessItems.get(itemName);

			if (drop != null) {
				// If we have the drop, return it to the user.
				PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
				outputSpeech.setText(drop);

				SimpleCard card = new SimpleCard();
				card.setTitle("How to get " + itemName);
				card.setContent(drop);

				return SpeechletResponse.newTellResponse(outputSpeech, card);
			} else {
				String speechOutput = "I'm sorry, I don't know what how to get the item, " + itemName + ". What else can I help with?";
				String repromptSpeech = "What else can I help with?";
				return newAskResponse(speechOutput, repromptSpeech);
			}
		} else {
			// There was no item in the intent so return the help prompt.
			return getHelp();
		}
	}

	private SpeechletResponse getLocation(Intent intent) {
		Slot heartlessSlot = intent.getSlot(HEARTLESS_SLOT);
		if (heartlessSlot != null && heartlessSlot.getValue() != null) {
			String heartlessName = heartlessSlot.getValue();

			// Get the location for the item
			String location = HeartlessLocations.get(heartlessName);

			if (location != null) {
				// If we have the recipe, return it to the user.
				PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
				outputSpeech.setText(location);

				SimpleCard card = new SimpleCard();
				card.setTitle("How to get " + heartlessName);
				card.setContent(location);

				return SpeechletResponse.newTellResponse(outputSpeech, card);
			} else {
				String speechOutput = "I'm sorry, I don't know where to find the heartless called " + heartlessName + ". What else can I help with?";
				String repromptSpeech = "What else can I help with?";
				return newAskResponse(speechOutput, repromptSpeech);
			}
		} else {
			// There was no item in the intent so return the help prompt.
			return getHelp();
		}
	}

	private SpeechletResponse getHelp() {
		String speechOutput = "You can ask where items are located, such as: how do I "
				+ "get a Blaze Shard. You can also ask where a hearless is, like, how do I find a White Mushroom, or, you can say exit... "
				+ "Now, what can I help you with?";
		String repromptText = "You can ask what heartless drop synthesis items, such as: who drops "
				+ "a Blaze Shard. You can also ask where a hearless is, like, how do I find a White Mushroom, or, you can say exit... "
				+ "Now, what can I help you with?";
		return newAskResponse(speechOutput, repromptText);
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
