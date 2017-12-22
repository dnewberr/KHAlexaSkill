package com.dnewberr.KH1Synthesizer;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class SynthesizerSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();

	static {
		supportedApplicationIds.add("amzn1.ask.skill.d2283a44-6391-4d6b-82f7-8d136d1ab5c3");
	}

	public SynthesizerSpeechletRequestStreamHandler() {
		super(new SynthesizerSpeechlet(), supportedApplicationIds);
	}
}
