package webinars.testingil.cleancodesonar.d03.items;

import webinars.testingil.cleancodesonar.d03.Item;
import webinars.testingil.cleancodesonar.d03.StoredItem;

public class DexterityOrElixir extends StoredItem {
    public DexterityOrElixir(Item item) {
        super(item);
    }

    public void update() {
        if (item.quality > 0) {
            decrease_quality();
        }
        this.decrease_sell_in();
        if (item.quality > 0) {
            if (item.sellIn < 0) {
                decrease_quality();
            }
        }
    }
}
