package webinars.testingil.cleancodesonar.d03.items;

import webinars.testingil.cleancodesonar.d03.Item;
import webinars.testingil.cleancodesonar.d03.StoredItem;

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
