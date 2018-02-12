package myGildedRose;

import com.gildedrose.Item;

public class CheeseItem extends AbstractItem {


	

//	@Override
//	public void updateQuality(Item item) {
//		
//		if(item.sellIn < 0) {
//			incrementQuality(item);
//		}
//		
//		incrementQuality(item);
//		decrementSellIn(item);
//
//		
//	}

	public CheeseItem(String name, int sellIn, int qualtiy) {
		super(name, sellIn, qualtiy);
	}

	@Override
	void updateItem(IUpdateVisitor visitor) {
		visitor.update(this);
		
	}
	
	


}
