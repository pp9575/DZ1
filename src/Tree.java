public class Tree {
    public static class Fir extends Tree implements Smellable {
        public Fir() {
            System.out.println("я красивая елка");
        }
    }
    public static class Pine extends Tree implements Smellable {
        public Pine() {
            System.out.println("я высокая сосна");
        }
    }
}
