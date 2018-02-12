package myGildedRose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;


public class MyGildedRoseTest {

	
	

	private ItemsFactory factory;
	private List< AbstractItem> itemsList;
	
	
	@Before
	public void init() {

		factory = new ItemsFactory();
		itemsList = new ArrayList<>();
		itemsList.add(factory.getItemType("+5 Dexterity Vest", 10, 20));
		itemsList.add(factory.getItemType("Aged Brie",2, 0));
		itemsList.add(factory.getItemType("Elixir of the Mongoose", 5, 7));
		itemsList.add(factory.getItemType("Sulfuras, Hand of Ragnaros", 0, 80));
		itemsList.add(factory.getItemType("Sulfuras, Hand of Ragnaros", -1, 80));
		itemsList.add(factory.getItemType("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		itemsList.add(factory.getItemType("Backstage passes to a TAFKAL80ETC concert", 10, 49));
		itemsList.add(factory.getItemType("Backstage passes to a TAFKAL80ETC concert", 5, 49));
		itemsList.add(factory.getItemType("Elixir of the Mongoose",-1,0));
		itemsList.add(factory.getItemType("Elixir of the Mongoose",-1,10));
		itemsList.add(factory.getItemType("Aged Brie", -1, 20));
		itemsList.add(factory.getItemType("Backstage passes to a TAFKAL80ETC concert", -1, 20));
		itemsList.add(factory.getItemType("Conjured Mana Cake", 3, 6));
		


		
		MyGildedRose gildedRose = new MyGildedRose(itemsList);
		 gildedRose.updateInventory(new ItemUpdateVisitor());
		
	}
	 
	    @Test
	    public void testRegularItem() {
	    	
	    	assertEquals(19,itemsList.get(0).quality);
	    	assertEquals(9,itemsList.get(0).sellIn);
	    }
	   
	    
	    @Test
	    public void testBrieItem() {
	    	assertEquals(1,itemsList.get(1).quality);
	    	
	    }
	    
	    @Test
	    public void testTicketItem() {
	    	assertEquals(21,itemsList.get(5).quality);
	    
	    }
	    
	    @Test
	    public void testTicketItemSellInLessThan11() {
	    	assertEquals(50,itemsList.get(6).quality);
	    
	    }
	    
	    
	    @Test
	    public void testTicketItemSellInLessThan6() {
	    	assertEquals(50,itemsList.get(7).quality);
	    
	    }
	    
	    @Test
	    public void testRegularExpired() {
	    	assertEquals(8,itemsList.get(9).quality);
	    }
	    
	    @Test
	    public void testRegularExpiredQualityZero() {
	    	assertEquals(0,itemsList.get(8).quality);
	    }
	    
	    @Test
	    public void testBrieExpired() {
	    	assertEquals(22,itemsList.get(10).quality);
	    }
	  
	    
	    @Test
	    public void testTicketExpired() {
	    	assertEquals(0,itemsList.get(11).quality);
	    }
	    
	    @Test
	    public void testConjuredItem() {
	    	assertEquals(4,itemsList.get(12).quality);
	    }
	   
	
 

}
