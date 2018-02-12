package myGildedRose;

import java.util.List;

import com.gildedrose.Item;

public class MyGildedRose {

		List< AbstractItem> itemsList;

		public MyGildedRose(List<AbstractItem> itemsList) {
			this.itemsList = itemsList;
		}
		
		public void updateInventory(IUpdateVisitor visitor) {
			AbstractItem item;
			for (AbstractItem abstractItem : itemsList) {
				
				
//				item = abstractItem.getItemType(abstractItem.name, abstractItem.sellIn, abstractItem.quality);
//				item.updateItem(visitor);
//				abstractItem.quality = item.quality;
//				abstractItem.sellIn = item.sellIn;
				
				abstractItem.updateItem(visitor);
			}
		}

}
