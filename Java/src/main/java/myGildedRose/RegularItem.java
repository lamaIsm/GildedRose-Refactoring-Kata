package myGildedRose;

import com.gildedrose.Item;

public class RegularItem extends AbstractItem {

	public RegularItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	void updateItem(IUpdateVisitor visitor) {
		visitor.update(this);
		
	}


	
}
