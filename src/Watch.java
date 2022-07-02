public class Watch {
    private boolean broken;
    void tik() {
        if (!broken) {
            System.out.println("часы тикают");}
            else try {
                throw new WatchBrokenError();
            } catch (WatchBrokenError e) {
                System.out.println("Ошибка: часы сломаны");
            }
        }


    public Watch(boolean broken) {
        this.broken = broken;
    }
}
