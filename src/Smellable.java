public interface Smellable {
    default void smell() {
        System.out.println("я пахну");
    }
}
