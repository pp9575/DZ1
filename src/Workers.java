public class Workers {
    String name;
    String warehouse;
    int liftPower;
    int spoiledVodka;

    public void spoilVodka() {
        spoiledVodka += liftPower;
        WarehouseKolpino.Vodka -= liftPower;
        System.out.println(name + ": Ура! Я испортил " + liftPower + " водки!");
    }

    public Workers(String name, String warehouse, int liftPower, int spoiledVodka) {
        this.name = name;
        this.warehouse = warehouse;
        this.liftPower = liftPower;
        this.spoiledVodka = spoiledVodka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getLiftPower() {
        return liftPower;
    }

    public void setLiftPower(int liftPower) {
        this.liftPower = liftPower;
    }

    public int getSpoiledVodka() {
        return spoiledVodka;
    }

    public void setSpoiledVodka(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }
}
