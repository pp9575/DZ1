public class Homework {
    public static void main(String[] args) {
//Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        System.out.println("Задача №1");
            String firstString = "234";
            String secondString = "some_text";
            int result = Integer.parseInt(firstString) + secondString.length();
            System.out.println(result);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5

        System.out.println("Задача №2");
            int a = 3;
            int b = 5;
            System.out.println((a + b) * (a * b));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        System.out.println("Задача №3");
            int[] array1 = {1, 2, 5, 7, 10};
            int[] array2 = {2, 3, 2, 17, 15};
            int[] array_result = new int[array1.length * 3];
            //можно было бы использовать Arrays.copyOf, но буду руками
            for (int i = 0; i < array_result.length; i++) {
                if (i < array1.length) {
                    array_result[i] = array1[i];
                } else if (i < (array1.length + array2.length)) {
                    array_result[i] = array2[i - array1.length];
                } else {
                    array_result[i] = array1[i - (array1.length + array2.length)] * array2[i - (array1.length + array2.length)];
                }
                System.out.print(array_result[i] + ",");
            }
        System.out.println();

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        System.out.println("Задача №4");
            String string1 = "Hello world!";
            System.out.println(string1.replace('l', 'r').toUpperCase().substring(0,8));

    }
}

