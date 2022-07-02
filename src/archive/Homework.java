package archive;

public class Homework {
    public static void main(String[] args) {
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
            long iCount = 0L;
            do {
                if (increment <= 0) {
                    break;
                }
                result += increment;
                iCount++;
            }
            while (result <= 1_000_000);
            if (result != 0) {
                System.out.println(iCount);
            }

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
            int[] input = {1, 1, 1, 1, 1};
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0) {
                    input[i] = 0;
                }
                System.out.print(i < (input.length - 1) ? input[i] + ", " : input[i] + "\n");
            }

        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
            int invoice = 0;
            if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
                invoice += 1000;
            }

            if (hasMotorProblem) {
                invoice += 10_000;
            }
            if (hasElectricsProblem) {
                invoice += 5000;
            }
            if (hasTransmissionProblem) {
                invoice += 4000;
            }
            if (hasWheelsProblem) {
                invoice += 2000;
            }
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                invoice = invoice * 8 / 10;
            }
            System.out.println(invoice);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

            Workers worker1 = new Workers("Vasya", "Kolpino", 3);
            Workers worker2 = new Workers("Misha", "Kolpino", 5);
            Workers worker3 = new Workers("Kirill", "Kolpino", 4);
            worker1.spoilVodka();
            worker2.spoilVodka();
            worker3.spoilVodka();
            worker2.spoilVodka();
            System.out.println("На складе осталось " + WarehouseKolpino.getVodka() + " водки");
            System.out.println(worker2.getName() + " испортил уже " + worker2.getSpoiledVodka() + " водки.");

//_____________________________________________________________________________________________________________________



    }
}