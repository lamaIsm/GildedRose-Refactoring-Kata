package myGildedRose;

import com.gildedrose.Item;

public class ItemsFactory {

//		
//		public ItemsFactory(String name, int sellIn, int quality) {
//			super(name, sellIn, quality);
//		}

		public  AbstractItem getItemType(String name, int sellIn, int qualtiy) {
			if(name.equals("Aged Brie")) {
				return new CheeseItem(name , sellIn, qualtiy);
			}
			 if(name.startsWith("Conjured")) {
				return new ConjuredItem(name , sellIn, qualtiy);
			}
			if(name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				return new TicketItem(name , sellIn, qualtiy);
			}
			if(name.equals("Sulfuras, Hand of Ragnaros")) {
				return new LegendaryItem(name , sellIn, qualtiy);
			}
			
			return new RegularItem(name , sellIn, qualtiy);
		}
}
