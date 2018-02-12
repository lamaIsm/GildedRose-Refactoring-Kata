package myGildedRose;

import com.gildedrose.Item;

public class ItemUpdateVisitor implements IUpdateVisitor {

	@Override
	public void update(CheeseItem item) {
		if(item.sellIn < 0) {
			incrementQuality(item);
		}
		
		incrementQuality(item);
		decrementSellIn(item);

	}

	@Override
	public void update(TicketItem item) {
		if (item.sellIn <= 0) {
			item.quality = 0;
		
		} else {
			incrementQualityOfTicketNearExpiry(item);
		}

		decrementSellIn(item);
	}

	@Override
	public void update(RegularItem item) {
		decrementQuality(item);
		decrementSellIn(item);
	
	}

	@Override
	public void update(ConjuredItem item) {
		decrementQuality(item);
		decrementQuality(item);
		decrementSellIn(item);
	}



	public void incrementQuality(Item item) {
		if (item.quality < 50) {
			item.quality++;
		}
	}
	
	
	public void decrementQuality(Item item) {
		if(item.quality > 0) {
			item.quality--;
		}
		if(item.sellIn < 0 && item.quality > 0) {
			item.quality--;
		}
	}

	public void decrementSellIn(Item item) {
		item.sellIn--;
	}
	
	public void incrementQualityOfTicketNearExpiry(Item item) {
		if (item.sellIn < 11) {
			incrementQuality(item);
		}
		if (item.sellIn < 6) {
			incrementQuality(item);
		}
		incrementQuality(item);
	}

}
