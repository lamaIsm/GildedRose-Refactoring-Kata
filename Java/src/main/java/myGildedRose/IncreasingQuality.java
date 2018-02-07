package myGildedRose;


public abstract class IncreasingQuality extends AbstractItem {

	public IncreasingQuality(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void incrementQuality() {
		if (quality < 50) {
			quality++;
		}

	}

}
