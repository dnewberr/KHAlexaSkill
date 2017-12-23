package com.dnewberr.KH1Synthesizer;


public class HeartlessItems {
	private static final CaseInsensitiveHashMap kh1Drops = new CaseInsensitiveHashMap();
	private static final CaseInsensitiveHashMap kh2Drops = new CaseInsensitiveHashMap();
	
	static {
		kh1Drops.put("Blaze Gem", "Blaze Gem is dropped by 4 heartless: Bandit at a rate of 4%, Fat Bandit at a rate of 8%, White Mushroom at a rate of 10% when you use Fire the third time, and White Mushroom at a rate of 40% when you use Fire all three times.");
		kh1Drops.put("Blaze Shard", "Blaze Shard is dropped by 2 heartless: Red Nocturne at a rate of 6%, and White Mushroom at a rate of 100% when you use Fire the third time.");
		kh1Drops.put("Blaze Stone", "Blaze Stone is dropped by 1 heartless: Chimera.");
		kh1Drops.put("Bright Crystal", "Bright Crystal is dropped by 1 heartless: Defender at a rate of 2%.");
		kh1Drops.put("Bright Gem", "Bright Gem is dropped by 3 heartless: Search Ghost at a rate of 4%, White Mushroom at a rate of 10% when you use Cure the third time, and White Mushroom at a rate of 40% when you use Cure all three times.");
		kh1Drops.put("Bright Shard", "Bright Shard is dropped by 2 heartless: Green Requiem at a rate of 10%, and White Mushroom at a rate of 100% when you use Cure the third time.");
		kh1Drops.put("Dark Matter", "Dark Matter can only obtained through chests, item synthesis, & prizes for mini-games.");
		kh1Drops.put("Dazzling Stone", "Dazzling Stone is dropped by 1 heartless: Jet Balloon.");
		kh1Drops.put("Energy Stone", "Energy Stone is dropped by 1 heartless: Stealth Soldier at a rate of 35%.");
		kh1Drops.put("Frost Gem", "Frost Gem is dropped by 4 heartless: Sea Neon at a rate of 4%, Sheltering Zone at a rate of 8%, White Mushroom at a rate of 10% when you use Blizzard the third time, and White Mushroom at a rate of 40% when you use Blizzard all three times.");
		kh1Drops.put("Frost Shard", "Frost Shard is dropped by 2 heartless: Blue Rhapsody at a rate of 12%, and White Mushroom at a rate of 100% when you use Blizzard the third time.");
		kh1Drops.put("Frost Stone", "Frost Stone is dropped by 1 heartless: Grand Ghost.");
		kh1Drops.put("Fury Stone", "Fury Stone is dropped by 1 heartless: Gigant Shadow.");
		kh1Drops.put("Gale", "Gale is dropped by 2 heartless: Angel Star at a rate of 6%, and Invisible at a rate of 6%.");
		kh1Drops.put("Gale Stone", "Gale Stone is dropped by 1 heartless: Neoshadow.");
		kh1Drops.put("Lightning Stone", "Lightning Stone is dropped by 1 heartless: Black Ball.");
		kh1Drops.put("Lucid Crystal", "Lucid Crystal is dropped by 1 heartless: Darkball at a rate of 1%.");
		kh1Drops.put("Lucid Gem", "Lucid Gem is dropped by 4 heartless: Gargoyle at a rate of 4%, Wight Knight at a rate of 4%, White Mushroom at a rate of 10% when you use Gravity the third time, and White Mushroom at a rate of 40% when you use Gravity all three times.");
		kh1Drops.put("Lucid Shard", "Lucid Shard is dropped by 3 heartless: Shadow at a rate of 6%, White Mushroom at a rate of 100% when you use Gravity the third time, and Gigant Shadow.");
		kh1Drops.put("Mystery Goo", "Mystery Goo is dropped by 5 heartless: Rare Truffle at a rate of 10% when you juggle it 10 times, Rare Truffle at a rate of 40% when you juggle it 50 times, Rare Truffle at a rate of 100% when you juggle it 100 times, White Mushroom at a rate of 10 to 20%, and Black Fungus at a rate of 20%.");
		kh1Drops.put("Mystery Power", "Mystery Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		kh1Drops.put("Mythril", "Mythril is dropped by 2 heartless: Angel Star at a rate of 1%, and Behemoth at a rate of 20%.");
		kh1Drops.put("Mythril Shard", "Mythril Shard is dropped by 3 heartless: Barrel Spider at a rate of 1%, Behemoth at a rate of 20%, and Pot Spider at a rate of 1%.");
		kh1Drops.put("Mythril Stone", "Mythril Stone is dropped by 1 heartless: Pot Scorpion.");
		kh1Drops.put("Orichalcum", "Orichalcum can be obtained through chests, and can be purchased in the Item shop for 5000 Munny.");
		kh1Drops.put("Power Crystal", "Power Crystal is dropped by 1 heartless: Wyvern at a rate of 2%.");
		kh1Drops.put("Power Gem", "Power Gem is dropped by 5 heartless: Air Pirate at a rate of 4%, Battleship at a rate of 8 to 16%, Pirate at a rate of 4%, White Mushroom at a rate of 10% when you use Stop the third time, and White Mushroom at a rate of 40% when you use Stop all three times.");
		kh1Drops.put("Power Shard", "Power Shard is dropped by 3 heartless: Bouncywild at a rate of 12 to 25%, Powerwild at a rate of 8 to 16%, and White Mushroom at a rate of 100% when you use Stop the third time.");
		kh1Drops.put("Power Stone", "Power Stone is dropped by 1 heartless: Sniperwild.");
		kh1Drops.put("Serenity Power", "Serenity Power is dropped by 3 heartless: Pink Agaricus at a rate of 10% when you hit it 40 times, Pink Agaricus at a rate of 20% when you hit it 70 times, and Pink Agaricus at a rate of 100% when you hit it 100 times.");
		kh1Drops.put("Shiny Crystal", "Shiny Crystal is dropped by 1 heartless: Wizard at a rate of 2%.");
		kh1Drops.put("Shiny Stone", "Shiny Stone is dropped by 1 heartless: Jet Balloon.");
		kh1Drops.put("Spirit Gem", "Spirit Gem is dropped by 3 heartless: Air Soldier at a rate of 4%, White Mushroom at a rate of 10% when you use Aero the third time, and White Mushroom at a rate of 40% when you use Aero all three times.");
		kh1Drops.put("Spirit Shard", "Spirit Shard is dropped by 3 heartless: Large Body at a rate of 12%, Soldier at a rate of 8%, and White Mushroom at a rate of 100% when you use Aero the third time.");
		kh1Drops.put("Spirit Stone", "Spirit Stone is dropped by 1 heartless: Gigant Shadow.");
		kh1Drops.put("Stormy Stone", "Stormy Stone is dropped by 1 heartless: Neoshadow.");
		kh1Drops.put("Thunder Gem", "Thunder Gem is dropped by 4 heartless: Aquatank at a rate of 8%, Screwdiver at a rate of 4%, White Mushroom at a rate of 10% when you use Thunder the third time, and White Mushroom at a rate of 40% when you use Thunder all three times.");
		kh1Drops.put("Thunder Shard", "Thunder Shard is dropped by 2 heartless: Yellow Opera at a rate of 8%, and White Mushroom at a rate of 100% when you use Thunder the third time.");
		kh1Drops.put("Thunder Stone", "Thunder Stone is dropped by 1 heartless: Black Ball.");

		kh2Drops.put("Blazing Crystal", "Blazing Crystal is dropped by 2 heartless or nobodies: Crescendo at a rate of 6%, and Crimson Jazz at a rate of 12%.");
		kh2Drops.put("Blazing Gem", "Blazing Gem is dropped by 2 heartless or nobodies: Fat Bandit at a rate of 12%, and Fiery Globe at a rate of 4%.");
		kh2Drops.put("Blazing Shard", "Blazing Shard is dropped by 2 heartless or nobodies: Hammer Frame at a rate of 10%, and Minute Bomb at a rate of 6%.");
		kh2Drops.put("Blazing Stone", "Blazing Stone is dropped by 2 heartless or nobodies: Cannon Gun at a rate of 6%, and Tornado Step at a rate of 8%.");
		kh2Drops.put("Bright Crystal", "Bright Crystal is dropped by 5 heartless or nobodies: Bulky Vendor at a rate of 100% when you use the Prime Capsule Reaction, Air Pirate at a rate of 4%, Crescendo at a rate of 3%, Neoshadow at a rate of 4%, and Strafer at a rate of 4%.");
		kh2Drops.put("Bright Gem", "Bright Gem is dropped by 4 heartless or nobodies: Bulky Vendor at a rate of 100% when you use the Limited Capsule Reaction, Aerial Knocker at a rate of 4%, Magnum Loader at a rate of 4%, and Surveillance Robot at a rate of 3%.");
		kh2Drops.put("Bright Shard", "Bright Shard is dropped by 5 heartless or nobodies: Bulky Vendor at a rate of 100% when you use the Capsule Prize Reaction, Creeper Plant at a rate of 4%, Hook Bat at a rate of 3%, Minute Bomb at a rate of 3%, and Rabid Dog at a rate of 3%.");
		kh2Drops.put("Bright Stone", "Bright Stone is dropped by 5 heartless or nobodies: Bulky Vendor at a rate of 100% when you use the Rare Capsule Reaction, Aeroplane at a rate of 4%, Cannon Gun at a rate of 3%, Driller Mole at a rate of 4%, and Luna Bandit at a rate of 4%.");
		kh2Drops.put("Dark Crystal", "Dark Crystal is dropped by 1 heartless or nobody: Air Pirate at a rate of 8%.");
		kh2Drops.put("Dark Gem", "Dark Gem is dropped by 2 heartless or nobodies: Gargoyle Knight at a rate of 10%, and Gargoyle Warrior at a rate of 10%.");
		kh2Drops.put("Dark Shard", "Dark Shard is dropped by 2 heartless or nobodies: Shadow at a rate of 4%, and Soldier at a rate of 8%.");
		kh2Drops.put("Dark Stone", "Dark Stone is dropped by 2 heartless or nobodies: Assault Rider at a rate of 12%, and Nightwalker at a rate of 10%.");
		kh2Drops.put("Dense Crystal", "Dense Crystal is dropped by 1 heartless or nobody: Berserker at a rate of 12%.");
		kh2Drops.put("Dense Gem", "Dense Gem is dropped by 1 heartless or nobody: Samurai at a rate of 12%.");
		kh2Drops.put("Dense Shard", "Dense Shard is dropped by 2 heartless or nobodies: Creeper at a rate of 8%, and Dragoon at a rate of 12%.");
		kh2Drops.put("Dense Stone", "Dense Stone is dropped by 1 heartless or nobody: Sniper at a rate of 12%.");
		kh2Drops.put("Energy Crystal", "Energy Crystal is dropped by 2 heartless or nobodies: Bookmaster at a rate of 4%, and Shaman at a rate of 4%.");
		kh2Drops.put("Energy Gem", "Energy Gem is dropped by 2 heartless or nobodies: Emerald Blues at a rate of 4%, and Fortuneteller at a rate of 4%.");
		kh2Drops.put("Energy Shard", "Energy Shard is dropped by 4 heartless or nobodies: Bolt Tower at a rate of 4%, Gargoyle Knight at a rate of 4%, Gargoyle Warrior at a rate of 4%, and Nightwalker at a rate of 4%.");
		kh2Drops.put("Energy Stone", "Energy Stone is dropped by 3 heartless or nobodies: Hammer Frame at a rate of 4%, Lance Soldier at a rate of 4%, and Trick Ghost at a rate of 4%.");
		kh2Drops.put("Frost Crystal", "Frost Crystal is dropped by 1 heartless or nobody: Living Bone at a rate of 12%.");
		kh2Drops.put("Frost Gem", "Frost Gem is dropped by 2 heartless or nobodies: Fortuneteller at a rate of 8%, and Icy Cube at a rate of 4%.");
		kh2Drops.put("Frost Shard", "Frost Shard is dropped by 2 heartless or nobodies: Hook Bat at a rate of 6%, and Lance Soldier at a rate of 10%.");
		kh2Drops.put("Frost Stone", "Frost Stone is dropped by 2 heartless or nobodies: Aeroplane at a rate of 8%, and Hot Rod at a rate of 12%.");
		kh2Drops.put("Lightning Crystal", "Lightning Crystal is dropped by 2 heartless or nobodies: Devastator at a rate of 4%, and Strafer at a rate of 6%.");
		kh2Drops.put("Lightning Gem", "Lightning Gem is dropped by 2 heartless or nobodies: Armored Knight at a rate of 12%, and Surveillance Robot at a rate of 8%.");
		kh2Drops.put("Lightning Shard", "Lightning Shard is dropped by 2 heartless or nobodies: Bolt Tower at a rate of 10%, and Rapid Thruster at a rate of 4%.");
		kh2Drops.put("Lightning Stone", "Lightning Stone is dropped by 2 heartless or nobodies: Driller Mole at a rate of 6%, and Emerald Blues at a rate of 10%.");
		kh2Drops.put("Lost Illusion", "Lost Illusion is dropped by 1 heartless or nobody: Absent silhouette.");
		kh2Drops.put("Lucid Crystal", "Lucid Crystal is dropped by 1 heartless or nobody: Neoshadow at a rate of 8%.");
		kh2Drops.put("Lucid Gem", "Lucid Gem is dropped by 2 heartless or nobodies: Bookmaster at a rate of 10%, and Magnum Loader at a rate of 8%.");
		kh2Drops.put("Lucid Shard", "Lucid Shard is dropped by 2 heartless or nobodies: Rabid Dog at a rate of 6%, and Trick Ghost at a rate of 10%.");
		kh2Drops.put("Lucid Stone", "Lucid Stone is dropped by 3 heartless or nobodies: Graveyard at a rate of 12%, Toy Soldier at a rate of 12%, and Wight Knight at a rate of 8%.");
		kh2Drops.put("Manifest Illusion", "Manifest Illusion is dropped by 1 heartless or nobody: Lingering Sentiment.");
		kh2Drops.put("Mythril Crystal", "Mythril Crystal can only be obtained through item synthesis and chests");
		kh2Drops.put("Mythril Gem", "Mythril Gem can only be obtained through item synthesis and chests");
		kh2Drops.put("Mythril Shard", "Mythril Shard can only be obtained through item synthesis and chests");
		kh2Drops.put("Mythril Stone", "Mythril Stone can only be obtained through item synthesis and chests");
		kh2Drops.put("Orichalcum", "Orichalcum is dropped by 4 heartless or nobodies: Bulky Vendor at a rate of 10% when you use the Capsule Prize Reaction, Bulky Vendor at a rate of 12% when you use the Rare Capsule Reaction, Bulky Vendor at a rate of 16% when you use the Limited Capsule Reaction, and Bulky Vendor at a rate of 18% when you use the Prime Capsule Reaction.");
		kh2Drops.put("Orichalcum Plus", "Orichalcum+ can only be found through chests and events.");
		kh2Drops.put("Power Crystal", "Power Crystal is dropped by 1 heartless or nobody: Morning Star at a rate of 12%.");
		kh2Drops.put("Power Gem", "Power Gem is dropped by 2 heartless or nobodies: Aerial Knocker at a rate of 8%, and Shaman at a rate of 10%.");
		kh2Drops.put("Power Shard", "Power Shard is dropped by 2 heartless or nobodies: Creeper Plant at a rate of 8%, and Large Body at a rate of 12%.");
		kh2Drops.put("Power Stone", "Power Stone is dropped by 2 heartless or nobodies: Luna Bandit at a rate of 8%, and Silver Rock at a rate of 6%.");
		kh2Drops.put("Remembrance Crystal", "Remembrance Crystal is dropped by 2 heartless or nobodies: Reckless at a rate of 12%, and at the Cavern of Remembrance: Engine Chamber.");
		kh2Drops.put("Remembrance Gem", "Remembrance Gem is dropped by 3 heartless or nobodies: Spring Metal at a rate of 10%, Runemaster at a rate of 10%, and Mad Bumper at a rate of 12%.");
		kh2Drops.put("Remembrance Shard", "Remembrance Shard is dropped by 3 heartless or nobodies: Perplex at a rate of 6%, Iron Hammer at a rate of 10%, and Silent Launcher at a rate of 6%.");
		kh2Drops.put("Remembrance Stone", "Remembrance Stone is dropped by 4 heartless or nobodies: Air Viking at a rate of 6%, Magic Phantom at a rate of 10%, Lance Warrior at a rate of 10%, and Necromancer at a rate of 10%.");
		kh2Drops.put("Serenity Crystal", "Serenity Crystal is dropped by 5 heartless or nobodies: Bulky Vendor at a rate of 100% when you use the Prime Capsule Reaction, Assassin at a rate of 4%, Berserker at a rate of 4%, Samurai at a rate of 4%, and Sorcerer at a rate of 4%.");
		kh2Drops.put("Serenity Gem", "Serenity Gem is dropped by 4 heartless or nobodies: Dancer at a rate of 4%, Dragoon at a rate of 4%, Gambler at a rate of 4%, and Sniper at a rate of 4%.");
		kh2Drops.put("Serenity Shard", "Serenity Shard is dropped by 5 heartless or nobodies: Assault Rider at a rate of 4%, Creeper at a rate of 2%, Fat Bandit at a rate of 4%, Graveyard at a rate of 4%, and Hot Rod at a rate of 4%.");
		kh2Drops.put("Serenity Stone", "Serenity Stone is dropped by 5 heartless or nobodies: Crimson Jazz at a rate of 4%, Devastator at a rate of 4%, Dusk at a rate of 2%, Living Bone at a rate of 4%, and Morning Star at a rate of 4%.");
		kh2Drops.put("Tranquil Crystal", "Tranquil Crystal is dropped by 1 heartless or nobody: Mushroom Thirteen.");
		kh2Drops.put("Tranquil Gem", "Tranquil Gem is dropped by 1 heartless or nobody: Mushroom Thirteen.");
		kh2Drops.put("Tranquil Shard", "Tranquil Shard is dropped by 1 heartless or nobody: Mushroom Thirteen.");
		kh2Drops.put("Tranquil Stone", "Tranquil Stone is dropped by 1 heartless or nobody: Mushroom Thirteen.");
		kh2Drops.put("Twilight Crystal", "Twilight Crystal is dropped by 1 heartless or nobody: Sorcerer at a rate of 12%.");
		kh2Drops.put("Twilight Gem", "Twilight Gem is dropped by 1 heartless or nobody: Assassin at a rate of 12%.");
		kh2Drops.put("Twilight Shard", "Twilight Shard is dropped by 2 heartless or nobodies: Dusk at a rate of 10%, and Gambler at a rate of 12%.");
		kh2Drops.put("Twilight Stone", "Twilight Stone is dropped by 1 heartless or nobody: Dancer at a rate of 12%.");
	}

	public static String get(String item) {
		switch(SynthesizerSpeechlet.GAME) {
			case "KH1": return kh1Drops.get(item);
			case "KH2": return kh2Drops.get(item);
			default: return null;
		}
	}
}
