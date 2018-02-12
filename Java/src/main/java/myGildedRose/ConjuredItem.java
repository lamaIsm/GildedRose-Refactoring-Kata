package myGildedRose;

import com.gildedrose.Item;

public class ConjuredItem extends AbstractItem{

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	
	}

	@Override
	void updateItem(IUpdateVisitor visitor) {
		visitor.update(this);
	}


//
//
//	@Override
//	public void updateQuality(Item item) {
//		decrementQualityTwice(item);
//		decrementSellIn(item);
//	}
//
//	
//	public void decrementQualityTwice(Item item) {
//		decrementQuality(item);
//		decrementQuality(item);
//	}
}
