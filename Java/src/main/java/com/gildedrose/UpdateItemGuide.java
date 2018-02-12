package com.gildedrose;

public class UpdateItemGuide {

		private Item item;
		
		public UpdateItemGuide(Item item) {
			this.item = item;
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
		
		
		public void updateQuality(Item item) {
			decrementQuality(item);
			decrementSellIn(item);
		}
		
}
