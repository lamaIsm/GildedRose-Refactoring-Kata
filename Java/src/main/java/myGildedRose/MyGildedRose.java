package myGildedRose;


public class MyGildedRose {

		AbstractItem [] items;
		
		public MyGildedRose(AbstractItem [] items) {
			this.items = items;
		}
	
		public void updateInventory() {
			for (AbstractItem item : items) {
				item.updateQuality();
			}
		}
		

}
