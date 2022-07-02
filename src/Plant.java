public class Plant {
    public static class Rose extends Plant implements Smellable, Bloomable {
        public Rose() {
            System.out.println("я красная роза");
        }
    }
    public static class Fern extends Plant implements Bloomable {
        public Fern() {
            System.out.println("я густой папоротник");
        }
    }
}
