package com.dnewberr.KH1Synthesizer;


public class HeartlessItems {
	private static final CaseInsensitiveHashMap kh1Drops = new CaseInsensitiveHashMap();
	private static final CaseInsensitiveHashMap kh2Drops = new CaseInsensitiveHashMap();
	
	static {
		kh1Drops.put("Blaze Shard",
				"Blaze Shard is dropped by 2 heartless: Red Nocturne at a rate of 6%, and White Mushroom at a rate of 100% when you use Fire the third time.");
		kh1Drops.put("Blaze Stone", "Blaze Stone is dropped by 1 heartless: Chimera.");
		kh1Drops.put(
				"Blaze Gem",
				"Blaze Gem is dropped by 4 heartless: Bandit at a rate of 4%, Fat Bandit at a rate of 8%, White Mushroom at a rate of 10% when you use Fire the third time, and White Mushroom at a rate of 40% when you use Fire all three times.");
		kh1Drops.put("Frost Shard",
				"Frost Shard is dropped by 2 heartless: Blue Rhapsody at a rate of 12%, and White Mushroom at a rate of 100% when you use Blizzard the third time.");
		kh1Drops.put("Frost Stone", "Frost Stone is dropped by 1 heartless: Grand Ghost.");
		kh1Drops.put(
				"Frost Gem",
				"Frost Gem is dropped by 4 heartless: Sea Neon at a rate of 4%, Sheltering Zone at a rate of 8%, White Mushroom at a rate of 10% when you use Blizzard the third time, and White Mushroom at a rate of 40% when you use Blizzard all three times.");
		kh1Drops.put("Thunder Shard",
				"Thunder Shard is dropped by 2 heartless: Yellow Opera at a rate of 8%, and White Mushroom at a rate of 100% when you use Thunder the third time.");
		kh1Drops.put("Thunder Stone", "Thunder Stone is dropped by 1 heartless: Black Ball.");
		kh1Drops.put("Lightning Stone", "Lightning Stone is dropped by 1 heartless: Black Ball.");
		kh1Drops.put(
				"Thunder Gem",
				"Thunder Gem is dropped by 4 heartless: Aquatank at a rate of 8%, Screwdiver at a rate of 4%, White Mushroom at a rate of 10% when you use Thunder the third time, and White Mushroom at a rate of 40% when you use Thunder all three times.");
		kh1Drops.put("Lucid Shard",
				"Lucid Shard is dropped by 3 heartless: Shadow at a rate of 6%, White Mushroom at a rate of 100% when you use Gravity the third time, and Gigant Shadow.");
		kh1Drops.put(
				"Lucid Gem",
				"Lucid Gem is dropped by 4 heartless: Gargoyle at a rate of 4%, Wight Knight at a rate of 4%, White Mushroom at a rate of 10% when you use Gravity the third time, and White Mushroom at a rate of 40% when you use Gravity all three times.");
		kh1Drops.put("Lucid Crystal", "Lucid Crystal is dropped by 1 heartless: Darkball at a rate of 1%.");
		kh1Drops.put(
				"Power Shard",
				"Power Shard is dropped by 3 heartless: Bouncywild at a rate of 12 to 25%, Powerwild at a rate of 8 to 16%, and White Mushroom at a rate of 100% when you use Stop the third time.");
		kh1Drops.put("Power Stone", "Power Stone is dropped by 1 heartless: Sniperwild.");
		kh1Drops.put(
				"Power Gem",
				"Power Gem is dropped by 5 heartless: Air Pirate at a rate of 4%, Battleship at a rate of 8 to 16%, Pirate at a rate of 4%, White Mushroom at a rate of 10% when you use Stop the third time, and White Mushroom at a rate of 40% when you use Stop all three times.");
		kh1Drops.put("Energy Stone", "Energy Stone is dropped by 1 heartless: Stealth Soldier at a rate of 35%.");
		kh1Drops.put("Power Crystal", "Power Crystal is dropped by 1 heartless: Wyvern at a rate of 2%.");
		kh1Drops.put(
				"Spirit Shard",
				"Spirit Shard is dropped by 3 heartless: Large Body at a rate of 12%, Soldier at a rate of 8%, and White Mushroom at a rate of 100% when you use Aero the third time.");
		kh1Drops.put("Spirit Stone", "Spirit Stone is dropped by 1 heartless: Gigant Shadow.");
		kh1Drops.put("Fury Stone", "Fury Stone is dropped by 1 heartless: Gigant Shadow.");
		kh1Drops.put(
				"Spirit Gem",
				"Spirit Gem is dropped by 3 heartless: Air Soldier at a rate of 4%, White Mushroom at a rate of 10% when you use Aero the third time, and White Mushroom at a rate of 40% when you use Aero all three times.");
		kh1Drops.put("Bright Shard",
				"Bright Shard is dropped by 2 heartless: Green Requiem at a rate of 10%, and White Mushroom at a rate of 100% when you use Cure the third time.");
		kh1Drops.put(
				"Bright Gem",
				"Bright Gem is dropped by 3 heartless: Search Ghost at a rate of 4%, White Mushroom at a rate of 10% when you use Cure the third time, and White Mushroom at a rate of 40% when you use Cure all three times.");
		kh1Drops.put("Bright Crystal", "Bright Crystal is dropped by 1 heartless: Defender at a rate of 2%.");
		kh1Drops.put("Shiny Stone", "Shiny Stone is dropped by 1 heartless: Jet Balloon.");
		kh1Drops.put("Dazzling Stone", "Dazzling Stone is dropped by 1 heartless: Jet Balloon.");
		kh1Drops.put("Shiny Crystal", "Shiny Crystal is dropped by 1 heartless: Wizard at a rate of 2%.");
		kh1Drops.put("Mythril Shard",
				"Mythril Shard is dropped by 3 heartless: Barrel Spider at a rate of 1%, Behemoth at a rate of 20%, and Pot Spider at a rate of 1%.");
		kh1Drops.put("Mythril", "Mythril is dropped by 2 heartless: Angel Star at a rate of 1%, and Behemoth at a rate of 20%.");
		kh1Drops.put("Mythril Stone", "Mythril Stone is dropped by 1 heartless: Pot Scorpion.");
		kh1Drops.put(
				"Mystery Goo",
				"Mystery Goo is dropped by 5 heartless: Rare Truffle at a rate of 10% when you juggle it 10 times, Rare Truffle at a rate of 40% when you juggle it 50 times, Rare Truffle at a rate of 100% when you juggle it 100 times, White Mushroom at a rate of 10 to 20%, and Black Fungus at a rate of 20%.");
		kh1Drops.put(
				"Mystery Power",
				"Mystery Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		kh1Drops.put(
				"Serenity Power",
				"Serenity Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		kh1Drops.put("Gale", "Gale is dropped by 2 heartless: Angel Star at a rate of 6%, and Invisible at a rate of 6%.");
		kh1Drops.put("Gale Stone", "Gale Stone is dropped by 1 heartless: Neoshadow.");
		kh1Drops.put("Stormy Stone", "Stormy Stone is dropped by 1 heartless: Neoshadow.");
		kh1Drops.put("Orichalcum", "Orichalcum can be obtained through chests, and can be purchased in the Item shop for 5000 Munny.");
		kh1Drops.put("Dark Matter", "Dark Matter can only obtained through chests, item synthesis, & prizes for mini-games.");
	}

	public static String get(String item) {
		switch(SynthesizerSpeechlet.GAME) {
			case "KH1": return kh1Drops.get(item);
			case "KH2": return kh2Drops.get(item);
			default: return null;
		}
	}
}
