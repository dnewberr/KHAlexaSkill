package com.dnewberr.KH1Synthesizer;


public class HeartlessLocations {
	private static final CaseInsensitiveHashMap locations = new CaseInsensitiveHashMap();

	public HeartlessLocations() {
	}

	static {
		locations.put("Air Pirate", "Air Pirate can be found in Neverland, and Monstro.");
		locations.put("Air Soldier", "Air Soldier can be found in Traverse Town, Agrabah, Monstro, Hollow Bastion, and Wonderland.");
		locations.put("Angel Star", "Angel Star can be found at the End of the World.");
		locations.put("Aquatank", "Aquatank can be found in Atlantica .");
		locations.put("Bandit", "Bandit can be found in Agrabah, and Monstro.");
		locations.put("Barrel Spider", "Barrel Spider can be found in Monstro, and Neverland.");
		locations.put("Battleship", "Battleship can be found in Neverland.");
		locations.put("Behemoth", "Behemoth can be found in Hollow Bastion , and the End of the World.");
		locations.put("Black Ballade", "Black Ballade can be found in Deep Jungle.");
		locations.put("Black Fungus", "Black Fungus can be found in Agrabah, Halloween Town, Hollow Bastion, and the End of the World.");
		locations.put("Blue Rhapsody", "Blue Rhapsody can be found in Traverse Town, Wonderland, Monstro, and Hollow Bastion.");
		locations.put("Bouncywild", "Bouncywild can be found in Deep Jungle , and Monstro.");
		locations.put("Chimera", "Chimera can be found in Halloween Town.");
		locations.put("Darkball",
						"Darkball can be found in Hollow Bastion, Traverse Town, Wonderland, Deep Jungle, Agrabah, Monstro, Atlantica, Halloween Town, Neverland, and the End of the World.");
		locations.put("Defender", "Defender can be found in Hollow Bastion, Traverse Town, and Wonderland.");
		locations.put("Fat Bandit", "Fat Bandit can be found in Agrabah, and Monstro.");
		locations.put("Gargoyle", "Gargoyle can be found in Halloween Town.");
		locations.put("Gigant Shadow", "Gigant Shadow can be found in Wonderland.");
		locations.put("Grand Ghost", "Grand Ghost can be found in Monstro .");
		locations.put("Green Requiem", "Green Requiem can be found in Traverse Town, Agrabah, Monstro, Deep Jungle, and Hollow Bastion.");
		locations.put("Invisible", "Invisible can be found at the End of the World.");
		locations.put("Jet Balloon", "Jet Balloon can be found in Neverland.");
		locations.put("Large Body", "Large Body can be found in Wonderland, Agrabah, Monstro, and Hollow Bastion.");
		locations.put("Neoshadow", "Neoshadow can be found at the End of the World.");
		locations.put("Pink Agaricus", "Pink Agaricus can be found in Deep Jungle, and Atlantica.");
		locations.put("Pirate", "Pirate can be found in Neverland.");
		locations.put("Pot Scorpion", "Pot Scorpion can be found in Agrabah.");
		locations.put("Pot Spider", "Pot Spider can be found in Agrabah.");
		locations.put("Powerwild", "Powerwild can be found in Deep Jungle.");
		locations.put("Rare Truffle", "Rare Truffle can be found in Monstro, Halloween Town, Neverland, and the End of the World.");
		locations.put("Red Nocturne", "Red Nocturne can be found in Traverse Town, Wonderland, Agrabah, and Hollow Bastion.");
		locations.put("Screwdiver", "Screwdiver can be found in Atlantica .");
		locations.put("Sea Neon", "Sea Neon can be found in Atlantica .");
		locations.put("Search Ghost", "Search Ghost can be found in Halloween Town, Monstro, Atlantica, and Traverse Town.");
		locations.put("Shadow", "Shadow can be found in every world.");
		locations.put("Sheltering Zone", "Sheltering Zone can be found in Atlantica .");
		locations.put("Sniperwild", "Sniperwild can be found in Traverse Town.");
		locations.put("Soldier", "Soldier can be found in Traverse Town, Wonderland, Agrabah, Monstro, Hollow Bastion.");
		locations.put("Stealth Soldier", "Stealth Soldier can be found in Hollow Bastion.");
		locations.put("White Mushroom",
				"White Mushroom can be found in Traverse Town, Wonderland, Deep Jungle, Agrabah, Atlantica, Halloween Town, and the End of the World.");
		locations.put("Wight Knight", "Wight Knight can be found in Halloween Town.");
		locations.put("Wizard", "Wizard can be found in Hollow Bastion, Traverse Town, Wonderland, Deep Jungle, Agrabah, Halloween Town.");
		locations.put("Wyvern", "Wyvern can be found in Hollow Bastion, Traverse Town, Deep Jungle, Agrabah.");
		locations.put("Yellow Opera", "Yellow Opera can be found in Traverse Town, Agrabah, Monstro, Hollow Bastion, Neverland, and Wonderland.");
	}

	public static String get(String heartless) {
		return locations.get(heartless);
	}
}
