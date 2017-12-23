package com.dnewberr.KH1Synthesizer;


public class HeartlessLocations {
	private static final CaseInsensitiveHashMap kh1Locations = new CaseInsensitiveHashMap();
	private static final CaseInsensitiveHashMap kh2Locations = new CaseInsensitiveHashMap();

	static {
		kh1Locations.put("Air Pirate", "Air Pirate can be found in Neverland, and Monstro.");
		kh1Locations.put("Air Soldier", "Air Soldier can be found in Traverse Town, Agrabah, Monstro, Hollow Bastion, and Wonderland.");
		kh1Locations.put("Angel Star", "Angel Star can be found at the End of the World.");
		kh1Locations.put("Aquatank", "Aquatank can be found in Atlantica .");
		kh1Locations.put("Bandit", "Bandit can be found in Agrabah, and Monstro.");
		kh1Locations.put("Barrel Spider", "Barrel Spider can be found in Monstro, and Neverland.");
		kh1Locations.put("Battleship", "Battleship can be found in Neverland.");
		kh1Locations.put("Behemoth", "Behemoth can be found in Hollow Bastion , and the End of the World.");
		kh1Locations.put("Black Ballade", "Black Ballade can be found in Deep Jungle.");
		kh1Locations.put("Black Fungus", "Black Fungus can be found in Agrabah, Halloween Town, Hollow Bastion, and the End of the World.");
		kh1Locations.put("Blue Rhapsody", "Blue Rhapsody can be found in Traverse Town, Wonderland, Monstro, and Hollow Bastion.");
		kh1Locations.put("Bouncywild", "Bouncywild can be found in Deep Jungle , and Monstro.");
		kh1Locations.put("Chimera", "Chimera can be found in Halloween Town.");
		kh1Locations.put("Darkball",
						"Darkball can be found in Hollow Bastion, Traverse Town, Wonderland, Deep Jungle, Agrabah, Monstro, Atlantica, Halloween Town, Neverland, and the End of the World.");
		kh1Locations.put("Defender", "Defender can be found in Hollow Bastion, Traverse Town, and Wonderland.");
		kh1Locations.put("Fat Bandit", "Fat Bandit can be found in Agrabah, and Monstro.");
		kh1Locations.put("Gargoyle", "Gargoyle can be found in Halloween Town.");
		kh1Locations.put("Gigant Shadow", "Gigant Shadow can be found in Wonderland.");
		kh1Locations.put("Grand Ghost", "Grand Ghost can be found in Monstro .");
		kh1Locations.put("Green Requiem", "Green Requiem can be found in Traverse Town, Agrabah, Monstro, Deep Jungle, and Hollow Bastion.");
		kh1Locations.put("Invisible", "Invisible can be found at the End of the World.");
		kh1Locations.put("Jet Balloon", "Jet Balloon can be found in Neverland.");
		kh1Locations.put("Large Body", "Large Body can be found in Wonderland, Agrabah, Monstro, and Hollow Bastion.");
		kh1Locations.put("Neoshadow", "Neoshadow can be found at the End of the World.");
		kh1Locations.put("Pink Agaricus", "Pink Agaricus can be found in Deep Jungle, and Atlantica.");
		kh1Locations.put("Pirate", "Pirate can be found in Neverland.");
		kh1Locations.put("Pot Scorpion", "Pot Scorpion can be found in Agrabah.");
		kh1Locations.put("Pot Spider", "Pot Spider can be found in Agrabah.");
		kh1Locations.put("Powerwild", "Powerwild can be found in Deep Jungle.");
		kh1Locations.put("Rare Truffle", "Rare Truffle can be found in Monstro, Halloween Town, Neverland, and the End of the World.");
		kh1Locations.put("Red Nocturne", "Red Nocturne can be found in Traverse Town, Wonderland, Agrabah, and Hollow Bastion.");
		kh1Locations.put("Screwdiver", "Screwdiver can be found in Atlantica .");
		kh1Locations.put("Sea Neon", "Sea Neon can be found in Atlantica .");
		kh1Locations.put("Search Ghost", "Search Ghost can be found in Halloween Town, Monstro, Atlantica, and Traverse Town.");
		kh1Locations.put("Shadow", "Shadow can be found in every world.");
		kh1Locations.put("Sheltering Zone", "Sheltering Zone can be found in Atlantica .");
		kh1Locations.put("Sniperwild", "Sniperwild can be found in Traverse Town.");
		kh1Locations.put("Soldier", "Soldier can be found in Traverse Town, Wonderland, Agrabah, Monstro, Hollow Bastion.");
		kh1Locations.put("Stealth Soldier", "Stealth Soldier can be found in Hollow Bastion.");
		kh1Locations.put("White Mushroom",
				"White Mushroom can be found in Traverse Town, Wonderland, Deep Jungle, Agrabah, Atlantica, Halloween Town, and the End of the World.");
		kh1Locations.put("Wight Knight", "Wight Knight can be found in Halloween Town.");
		kh1Locations.put("Wizard", "Wizard can be found in Hollow Bastion, Traverse Town, Wonderland, Deep Jungle, Agrabah, Halloween Town.");
		kh1Locations.put("Wyvern", "Wyvern can be found in Hollow Bastion, Traverse Town, Deep Jungle, Agrabah.");
		kh1Locations.put("Yellow Opera", "Yellow Opera can be found in Traverse Town, Agrabah, Monstro, Hollow Bastion, Neverland, and Wonderland.");
	}

	public static String get(String heartless) {
		switch(SynthesizerSpeechlet.GAME) {
			case "KH1": return kh1Locations.get(heartless);
			case "KH2": return kh2Locations.get(heartless);
			default: return null;
		}
	}
}
