package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {

	private Item [] items;
	
	private static Item item  = new Item("+5 Dexterity Vest", 10, 20);
	@Before
	public void init() {
		 items  = new Item[] {
	               new Item("+5 Dexterity Vest", 10, 20), 
	               new Item("Aged Brie", 2, 0), 
	               new Item("Elixir of the Mongoose", 5, 7), 
	               new Item("Sulfuras, Hand of Ragnaros", 0, 80), 
	               new Item("Sulfuras, Hand of Ragnaros", -1, 80),
	               new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
	                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
	                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
	                new Item("Elixir of the Mongoose",-1,0),  
	                new Item("Elixir of the Mongoose",-1,10),
	                new Item("Aged Brie", -1, 20),
	                new Item("Aged Brie", -1, 51),
	                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20),
	                
	                // this conjured item does not work properly yet
	                new Item("Conjured Mana Cake", 3, 6) };
		 
		 	GildedRoseOriginal gildedRose = new GildedRoseOriginal(items);
		 	gildedRose.updateQuality();

	}
	
	
    @Test
    public void testItemName() {
       
        assertEquals("+5 Dexterity Vest", item.name);
    }
    
    
    @Test
    public void testConstantQualityLegend() {
    	assertEquals(80,new Item("Sulfuras, Hand of Ragnaros", 0, 80).quality);
    }
    
    @Test
    public void testRegularItem() {
    	assertEquals(19,item.quality);
    	assertEquals(9,item.sellIn);
    }
   
    
    @Test
    public void testBrieItem() {
    	assertEquals(1,items[1].quality);
    	
    }
    
    @Test
    public void testTicketItem() {
    	assertEquals(21,items[5].quality);
    
    }
    
    @Test
    public void testTicketItemSellInLessThan11() {
    	assertEquals(50,items[6].quality);
    
    }
    
    
    @Test
    public void testTicketItemSellInLessThan6() {
    	assertEquals(50,items[7].quality);
    
    }
    
    @Test
    public void testRegularExpired() {
    	assertEquals(8,items[9].quality);
    }
    
    @Test
    public void testRegularExpiredQualityZero() {
    	assertEquals(0,items[8].quality);
    }
    
    @Test
    public void testBrieExpired() {
    	assertEquals(22,items[10].quality);
    }
    
    @Test
    public void testQualityGreaterThan50() {
    	assertEquals(51,items[11].quality);
    }
    
    @Test
    public void testTicketExpired() {
    	assertEquals(0,items[12].quality);
    }
    
    @Test
    public void testConjuredItem() {
    	assertEquals(4,items[13].quality);
    }
   
	
}
