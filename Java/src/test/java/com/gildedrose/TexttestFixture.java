package com.gildedrose;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) throws FileNotFoundException {
       

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0), 
                new Item("Elixir of the Mongoose", 5, 7), 
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), 
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Elixir of the Mongoose",-1,0),  // sell in date passed and quality < 0
                new Item("Elixir of the Mongoose",-1,10),
                new Item("Aged Brie", -1, 20), // quality of brie increases even after sell in date
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20),
                
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRoseOriginal app = new GildedRoseOriginal(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        //PrintStream output = new PrintStream("./GoldenMaster.txt");
        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
               //output.println(item);
            	System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
