package com.gildedrose;

class GildedRoseOriginal {
    Item[] items;

    public GildedRoseOriginal(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
        
        	// items whose quality decrease by 1 (i.e not brie or concert)
        	if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                // quality can't be negative
        		if (items[i].quality > 0) {
        			// make sure item in not a legend (quality of legend item remains constant)
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1; // decrement quality
                    }
                }
            } 
        	
        
        	
        	
        	else { // brie and concert
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1; // increment quality 

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }
        	///////////////////////////////////////////////////////////////
        	//// all items other than legendary items (legendary items are not sold)
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1; // decrement sell in date 
            }
            ////////////////////////////////////////////////////////////////
            //// sellIn days passed
            if (items[i].sellIn < 0) {
            	///////////////////Not Brie////////////////////////////////
                if (!items[i].name.equals("Aged Brie")) {
                	/////////////// not backstage passes////////////////////
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    	if (items[i].quality > 0) {
                    		///////////// not legendary////////////////////
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;  //////// sell in date passed -> decrement quality
                            }
                        }
                    } else { //// backstage
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {/// brie///////
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;  // increment quality even if sell date passed.
                    }
                }
            }
            /////////////////sell in days passed//////////////
        }
    }
}