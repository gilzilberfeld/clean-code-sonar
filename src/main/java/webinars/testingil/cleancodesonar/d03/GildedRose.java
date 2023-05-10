package webinars.testingil.cleancodesonar.d03;

import webinars.testingil.cleancodesonar.d03.items.AgedBrie;
import webinars.testingil.cleancodesonar.d03.items.Backstage;
import webinars.testingil.cleancodesonar.d03.items.DexterityOrElixir;

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

    private void updateItem(Item item) {

        switch (item.name) {
            case "Aged Brie":
                new AgedBrie(item).update();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new Backstage(item).update();
                break;
            case "+5 Dexterity Vest", "Elixir of the Mongoose":
                new DexterityOrElixir(item).update();
                break;
        }
    }
}