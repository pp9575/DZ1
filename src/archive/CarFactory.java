package archive;

public class CarFactory {
     static Cars createLada() {
        return new Lada();
    }
    static Cars createToyota() {
        return new Toyota();
    }
}
