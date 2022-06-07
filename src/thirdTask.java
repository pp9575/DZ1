public class thirdTask {
    public static int[] array1 = {1, 2, 5, 7, 10};
    public static int[] array2 = {2, 3, 2, 17, 15};
    public static void main(String[] args) {
        int[] result = new int[array1.length * 3];
        //можно было бы использовать Arrays.copyOf, но буду руками
        for (int a = 0; a < result.length; a++) {
            if (a < array1.length) {
                result[a] = array1[a];
            }
            else if (a < (array1.length + array2.length)) {
                result[a] = array2[a - array1.length];
            }
            else {
                result[a] = array1[a - (array1.length + array2.length)] * array2[a - (array1.length + array2.length)];
            }
            System.out.print(result[a] + ",");
        }




    }
}
