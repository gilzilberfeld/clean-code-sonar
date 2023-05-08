package webinars.testingil.cleancodesonar.d03;

public abstract class StoredItem {

    protected final Item item;

    public StoredItem (Item item){
        this.item = item;
    }
    public abstract void update();
    public void decrease_sell_in(){
        item.sellIn = item.sellIn- 1;
    }

    public void increase_quality(){
        item.quality = item.quality+ 1;
    }

    public void decrease_quality(){
        item.quality = item.quality-  1;
    }
}
