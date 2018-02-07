package myGildedRose;

public class ConjuredItem extends DecreasingQuality {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);

	}

	@Override
	public void updateQuality() {
		decrementQualityTwice();
		decrementSellIn();
	}

	
	public void decrementQualityTwice() {
		decrementQuality();
		decrementQuality();
	}
}
