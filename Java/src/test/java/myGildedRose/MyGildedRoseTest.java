package myGildedRose;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;


public class MyGildedRoseTest {

	
	private AbstractItem [] items;
	
	
	@Before
	public void init() {
		 items  = new AbstractItem[] {
	               new RegularItem("+5 Dexterity Vest", 10, 20), //0
	               new CheeseItem(2, 0), //1
	               new RegularItem("Elixir of the Mongoose", 5, 7), //2
	               new LegendaryItem(), //3
	               new TicketItem( 15, 20),//4
	               new TicketItem(10, 49),//5
	               new TicketItem( 5, 49),//6
	               new RegularItem("Elixir of the Mongoose",-1,0),  //7
	               new RegularItem("Elixir of the Mongoose",-1,10),//8
	               new CheeseItem (-1, 20),//9
	               new TicketItem(-1, 20),//10
	               new ConjuredItem("Conjured Mana Cake", 3, 6),
	               new ConjuredItem("Conjured", -1, 6)}; //11};
		 
		 	MyGildedRose gildedRose = new MyGildedRose(items);
		 	gildedRose.updateInventory();

	}
	
	
    
    @Test
    public void shouldReturn80GivenLegendaryItem() {
    	assertEquals(80,items[3].quality);
    }
    
    @Test
    public void shouldReturn19GivenRegularItemWithQuality20() {
    	assertEquals(19,items[0].quality);
 
    }
   
    
    @Test
    public void shouldReturn1GivenCheeseItemWithQuality0() {
    	assertEquals(1,items[1].quality);
    	
    }
    
    @Test
    public void shouldReturn21GivenTicketItemWithQuality20() {
    	assertEquals(21,items[4].quality);
    
    }
    
    @Test
    public void shouldReturn50GivenTicketItemWithQuality49WhenSellInLessThan11() {
    	assertEquals(50,items[5].quality);
    
    }
    
    
    @Test
    public void  shouldReturn50GivenTicketItemWithQuality49WhenSellInLessThan6() {
    	assertEquals(50,items[6].quality);
    
    }
    
    @Test
    public void shouldReturn0GivenExpiredRegularItemWithQuality0() {
    	assertEquals(0,items[7].quality);
    }
    
    @Test
    public void shouldReturn8GivenExpiredRegularItemwithQuality9() {
    	assertEquals(8,items[8].quality);
    }
    
  
    
    @Test
    public void shouldReturn22GivenExpiredCheeseItemWithQuality20() {
    	assertEquals(22,items[9].quality);
    }

    
    @Test
    public void shouldReturn0GivenExpiredTicketItemWithQuality20() {
    	assertEquals(0,items[10].quality);
    }
    
    @Test
    public void shouldReturn4GivenExpiredConjuredItemWithQuality6() {
    	assertEquals(4,items[11].quality);
    }
   
    @Test
    public void shouldReturn2GivenExpiredConjuredItemWithQuality6() {
    	assertEquals(2,items[12].quality);
    }

	
}
