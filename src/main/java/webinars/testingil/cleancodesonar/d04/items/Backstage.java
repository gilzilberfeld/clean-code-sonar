package webinars.testingil.cleancodesonar.d04.items;

import webinars.testingil.cleancodesonar.d04.Item;
import webinars.testingil.cleancodesonar.d04.StoredItem;

public class Backstage extends StoredItem {
    public Backstage(Item item) {
        super(item);
    }

    public void update() {
        if (item.quality < 50) {
            increase_quality();
            if (item.quality < 50) {
                if (item.sellIn < 11) {
                    increase_quality();
                }
                if (item.sellIn < 6) {
                    increase_quality();
                }
            }
        }
        decrease_sell_in();
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}