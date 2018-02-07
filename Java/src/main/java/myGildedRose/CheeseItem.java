package myGildedRose;

public class CheeseItem extends IncreasingQuality {

	
	
	

public CheeseItem(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}


	@Override
	public void updateQuality() {
		
		if(sellIn < 0) {
			incrementQuality();
		}
		
		incrementQuality();
		decrementSellIn();
		
	}
	
	


}
