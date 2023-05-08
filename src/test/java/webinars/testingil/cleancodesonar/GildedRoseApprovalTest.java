package webinars.testingil.cleancodesonar;

import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;
import webinars.testingil.cleancodesonar.d04.GildedRose;
import webinars.testingil.cleancodesonar.d04.Item;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.String.valueOf;
import static org.approvaltests.Approvals.verify;

@UseReporter(DiffReporter.class)
public class GildedRoseApprovalTest {
    String log = "";
    String itemLog;

    Item[] items = new Item[]{
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)
    };

    @Test
    public void gilded_rose_30_days() {


        var shop = new GildedRose(items);

        IntStream.range(1, 30).forEach(day -> {
                    log += "Day " + valueOf(day) + "\n";
                    log += printItems();
                    shop.updateQuality();
                    log += "\n";
                }
        );


        verify(log);
    }
    public String printItems() {
        itemLog = "name, sellIn, quality\n";
        Arrays.asList(items).forEach(item -> {
            itemLog += (item.toString() + "\n");
        });
        itemLog += "\n";

        return itemLog;
    }


}