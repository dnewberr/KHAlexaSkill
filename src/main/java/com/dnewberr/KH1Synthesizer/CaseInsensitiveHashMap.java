package com.dnewberr.KH1Synthesizer;

import java.util.HashMap;

public class CaseInsensitiveHashMap extends HashMap<String, String> {
	private static final long serialVersionUID = 1L;

	@Override
    public String put(String key, String value) {
       return super.put(key.trim().toLowerCase(), value);
    }

    // not @Override because that would require the key parameter to be of type Object
    public String get(String key) {
       return super.get(key.trim().toLowerCase());
    }
}
