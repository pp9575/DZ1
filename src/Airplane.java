public class Airplane implements Flyable {
    private int countPassangers;

    public Airplane(int countPassangers) {
        this.countPassangers = countPassangers;
    }

    public int getCountPassangers() {
        return countPassangers;
    }

    public void setCountPassangers(int countPassangers) {
        this.countPassangers = countPassangers;
    }

    public void fly() {
        if (countPassangers >= 0) {
            System.out.println("самолет летит");
        } else {
            try {
                throw new FlyException();
            } catch (FlyException e) {
                System.out.println("Ошибка: пассажиров меньше 0");
            }
        }
    }
}