package myGildedRose;

import com.gildedrose.Item;

public class TicketItem extends AbstractItem {

	public TicketItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);

	}

	@Override
	void updateItem(IUpdateVisitor visitor) {
		visitor.update(this);
		
	}



//
//	@Override
//	public void updateQuality(Item item) {
//
//		if (item.sellIn <= 0) {
//			item.quality = 0;
//		
//		} else {
//			incrementQualityOfTicketNearExpiry(item);
//		}
//
//		decrementSellIn(item);
//	}
//

	
		
}