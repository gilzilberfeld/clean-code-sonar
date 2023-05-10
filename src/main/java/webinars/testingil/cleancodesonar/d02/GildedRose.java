package webinars.testingil.cleancodesonar.d02;


public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    public void updateItem(Item item) {
        if (item.name.equals("Aged Brie")) {
            if (item.quality < 50) {
                increaseQuality(item);
            }
            decreaseSellin(item);
            if (item.quality < 50) {
                if (item.sellIn < 0) {
                    increaseQuality(item);
                }
            }
            return;
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality < 50) {
                increaseQuality(item);
                if (item.quality < 50) {
                    if (item.sellIn < 11) {
                        increaseQuality(item);
                    }
                    if (item.sellIn < 6) {
                        increaseQuality(item);
                    }
                }
            }
            decreaseSellin(item);
            if (item.sellIn < 0) {
                item.quality=0;
            }
            return;
        }
        if (item.name.equals("+5 Dexterity Vest") || item.name.equals("Elixir of the Mongoose")) {
            if (item.quality > 0) {
                decreaseQuality(item);
            }
            decreaseSellin(item);
            if (item.quality > 0) {
                if (item.sellIn < 0) {
                    decreaseQuality(item);
                }
            }
        }
    }


    public void decreaseSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    public void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    public void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }


}