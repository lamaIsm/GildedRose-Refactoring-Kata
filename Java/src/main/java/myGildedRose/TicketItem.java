package myGildedRose;

public class TicketItem extends IncreasingQuality {

	public TicketItem(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	public void updateQuality() {

		if (sellIn <= 0) {
			quality = 0;
		
		} else {
			incrementQualityOfTicketNearExpiry();
		}

		decrementSellIn();
	}


	public void incrementQualityOfTicketNearExpiry() {
		if (sellIn < 11) {
			incrementQuality();
		}
		if (sellIn < 6) {
			incrementQuality();
		}
		incrementQuality();
	}
	
		
}