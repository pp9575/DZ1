public class fourthTask {
    public static String string1 = "Hello world!";
    public static String solution(String input) {
        return input.replace('l', 'r').toUpperCase().substring(0,8);
    }
    public static void main(String[] args) {
        System.out.println(solution(string1));
    }
}
