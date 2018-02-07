package myGildedRose;



public  abstract class  DecreasingQuality extends AbstractItem {

	public DecreasingQuality(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	public void decrementQuality() {
		if(quality > 0) {
			quality--;
		}
		if(sellIn < 0 && quality > 0) {
			quality--;
		}
	}
	
	

}
