public class Duck implements Flyable{
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public void fly() {
        if (isInjured) {
            try {
                throw new FlyException();
            } catch (FlyException e) {
                System.out.println("Ошибка: утка ранена");
            }
        } else {
            System.out.println("Утка летит");
        }
    }
}
