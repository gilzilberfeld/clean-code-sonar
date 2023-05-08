package webinars.testingil.cleancodesonar.d04.items;

import webinars.testingil.cleancodesonar.d04.StoredItem;
import webinars.testingil.cleancodesonar.d04.Item;

public class AgedBrie extends StoredItem {
    public AgedBrie(Item item) {
        super(item);
    }

    public void update() {
        if (item.quality < 50) {
            increase_quality();
        }
        decrease_sell_in();
        if (item.quality < 50) {
            if (item.sellIn < 0) {
                increase_quality();
            }
        }
    }
}
