package myGildedRose;

public class RegularItem extends DecreasingQuality {

	public RegularItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	
	@Override
	public void updateQuality() {
		decrementQuality();
		decrementSellIn();
	}
}
