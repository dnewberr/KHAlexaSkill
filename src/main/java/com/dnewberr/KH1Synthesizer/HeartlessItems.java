package com.dnewberr.KH1Synthesizer;


public class HeartlessItems {
	private static final CaseInsensitiveHashMap drops = new CaseInsensitiveHashMap();
	static {
		drops.put("Blaze Shard",
				"Blaze Shard is dropped by 2 heartless: Red Nocturne at a rate of 6%, and White Mushroom at a rate of 100% when you use Fire the third time.");
		drops.put("Blaze Stone", "Blaze Stone is dropped by 1 heartless: Chimera.");
		drops.put(
				"Blaze Gem",
				"Blaze Gem is dropped by 4 heartless: Bandit at a rate of 4%, Fat Bandit at a rate of 8%, White Mushroom at a rate of 10% when you use Fire the third time, and White Mushroom at a rate of 40% when you use Fire all three times.");
		drops.put("Frost Shard",
				"Frost Shard is dropped by 2 heartless: Blue Rhapsody at a rate of 12%, and White Mushroom at a rate of 100% when you use Blizzard the third time.");
		drops.put("Frost Stone", "Frost Stone is dropped by 1 heartless: Grand Ghost.");
		drops.put(
				"Frost Gem",
				"Frost Gem is dropped by 4 heartless: Sea Neon at a rate of 4%, Sheltering Zone at a rate of 8%, White Mushroom at a rate of 10% when you use Blizzard the third time, and White Mushroom at a rate of 40% when you use Blizzard all three times.");
		drops.put("Thunder Shard",
				"Thunder Shard is dropped by 2 heartless: Yellow Opera at a rate of 8%, and White Mushroom at a rate of 100% when you use Thunder the third time.");
		drops.put("Thunder Stone", "Thunder Stone is dropped by 1 heartless: Black Ball.");
		drops.put("Lightning Stone", "Lightning Stone is dropped by 1 heartless: Black Ball.");
		drops.put(
				"Thunder Gem",
				"Thunder Gem is dropped by 4 heartless: Aquatank at a rate of 8%, Screwdiver at a rate of 4%, White Mushroom at a rate of 10% when you use Thunder the third time, and White Mushroom at a rate of 40% when you use Thunder all three times.");
		drops.put("Lucid Shard",
				"Lucid Shard is dropped by 3 heartless: Shadow at a rate of 6%, White Mushroom at a rate of 100% when you use Gravity the third time, and Gigant Shadow.");
		drops.put(
				"Lucid Gem",
				"Lucid Gem is dropped by 4 heartless: Gargoyle at a rate of 4%, Wight Knight at a rate of 4%, White Mushroom at a rate of 10% when you use Gravity the third time, and White Mushroom at a rate of 40% when you use Gravity all three times.");
		drops.put("Lucid Crystal", "Lucid Crystal is dropped by 1 heartless: Darkball at a rate of 1%.");
		drops.put(
				"Power Shard",
				"Power Shard is dropped by 3 heartless: Bouncywild at a rate of 12 to 25%, Powerwild at a rate of 8 to 16%, and White Mushroom at a rate of 100% when you use Stop the third time.");
		drops.put("Power Stone", "Power Stone is dropped by 1 heartless: Sniperwild.");
		drops.put(
				"Power Gem",
				"Power Gem is dropped by 5 heartless: Air Pirate at a rate of 4%, Battleship at a rate of 8 to 16%, Pirate at a rate of 4%, White Mushroom at a rate of 10% when you use Stop the third time, and White Mushroom at a rate of 40% when you use Stop all three times.");
		drops.put("Energy Stone", "Energy Stone is dropped by 1 heartless: Stealth Soldier at a rate of 35%.");
		drops.put("Power Crystal", "Power Crystal is dropped by 1 heartless: Wyvern at a rate of 2%.");
		drops.put(
				"Spirit Shard",
				"Spirit Shard is dropped by 3 heartless: Large Body at a rate of 12%, Soldier at a rate of 8%, and White Mushroom at a rate of 100% when you use Aero the third time.");
		drops.put("Spirit Stone", "Spirit Stone is dropped by 1 heartless: Gigant Shadow.");
		drops.put("Fury Stone", "Fury Stone is dropped by 1 heartless: Gigant Shadow.");
		drops.put(
				"Spirit Gem",
				"Spirit Gem is dropped by 3 heartless: Air Soldier at a rate of 4%, White Mushroom at a rate of 10% when you use Aero the third time, and White Mushroom at a rate of 40% when you use Aero all three times.");
		drops.put("Bright Shard",
				"Bright Shard is dropped by 2 heartless: Green Requiem at a rate of 10%, and White Mushroom at a rate of 100% when you use Cure the third time.");
		drops.put(
				"Bright Gem",
				"Bright Gem is dropped by 3 heartless: Search Ghost at a rate of 4%, White Mushroom at a rate of 10% when you use Cure the third time, and White Mushroom at a rate of 40% when you use Cure all three times.");
		drops.put("Bright Crystal", "Bright Crystal is dropped by 1 heartless: Defender at a rate of 2%.");
		drops.put("Shiny Stone", "Shiny Stone is dropped by 1 heartless: Jet Balloon.");
		drops.put("Dazzling Stone", "Dazzling Stone is dropped by 1 heartless: Jet Balloon.");
		drops.put("Shiny Crystal", "Shiny Crystal is dropped by 1 heartless: Wizard at a rate of 2%.");
		drops.put("Mythril Shard",
				"Mythril Shard is dropped by 3 heartless: Barrel Spider at a rate of 1%, Behemoth at a rate of 20%, and Pot Spider at a rate of 1%.");
		drops.put("Mythril", "Mythril is dropped by 2 heartless: Angel Star at a rate of 1%, and Behemoth at a rate of 20%.");
		drops.put("Mythril Stone", "Mythril Stone is dropped by 1 heartless: Pot Scorpion.");
		drops.put(
				"Mystery Goo",
				"Mystery Goo is dropped by 5 heartless: Rare Truffle at a rate of 10% when you juggle it 10 times, Rare Truffle at a rate of 40% when you juggle it 50 times, Rare Truffle at a rate of 100% when you juggle it 100 times, White Mushroom at a rate of 10 to 20%, and Black Fungus at a rate of 20%.");
		drops.put(
				"Mystery Power",
				"Mystery Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		drops.put(
				"Serenity Power",
				"Serenity Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		drops.put("Gale", "Gale is dropped by 2 heartless: Angel Star at a rate of 6%, and Invisible at a rate of 6%.");
		drops.put("Gale Stone", "Gale Stone is dropped by 1 heartless: Neoshadow.");
		drops.put("Stormy Stone", "Stormy Stone is dropped by 1 heartless: Neoshadow.");
		drops.put("Orichalcum", "Orichalcum can be obtained through chests, and can be purchased in the Item shop for 5000 Munny.");
		drops.put("Dark Matter", "Dark Matter can only obtained through chests, item synthesis, & prizes for mini-games.");
	}

	public static String get(String item) {
		return drops.get(item);
	}
}
