package myGildedRose;

import com.gildedrose.*;
// TODO - increment/decrement what?
// TODO - Given/When/Then tests
// TODO - separate packages
public abstract class AbstractItem extends Item {

	public AbstractItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public abstract void updateQuality() ;
	
	public void decrementSellIn() {
		sellIn--;
	}
}
