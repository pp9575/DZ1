import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Homework {
    public static void main(String[] args) throws IOException {
        //Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
            Toyota corolla = new Toyota();
            Lada samara = new Lada();
            corolla.music();
            corolla.start();
            corolla.lights();
            samara.lights();
            samara.start();
            samara.broken();


        //Задача №2
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

            FileReader fileReader = new FileReader("C:\\temp\\Java\\DZ1\\resource\\my_first_file.txt");
            String output = "";
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            do {
                output = output + bufferedReader.readLine() + " ";
            }
            while (bufferedReader.ready());
            System.out.println(output);
            bufferedReader.close();
            fileReader.close();

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300

            FinancialRecord record = new FinancialRecord(500, 300);
            FileWriter fileWriter = new FileWriter("C:\\temp\\Java\\DZ1\\resource\\report.txt");
            fileWriter.write("доходы = " + record.getIncome() +", расходы = " + record.getOutcome());
            fileWriter.close();

        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
            Cars[] carsArray = new Cars[40];
            for (int i = 0; i < 40; i++) {
                if (i < 20) {
                   carsArray[i] = CarFactory.createLada();
                }
                else {
                   carsArray[i] = CarFactory.createToyota();
                }
            }
            for (Cars car:
                 carsArray) {
                if(car instanceof Lada) {
                    ((Lada) car).broken();
                } else if (car instanceof Toyota) {
                    ((Toyota) car).music();
                }
            }

        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
            FinancialRecord[] financialArray = new FinancialRecord[10];
            for (int i = 0; i < 10; i++) {
                financialArray[i] = new FinancialRecord((new Random().nextInt(500)), (new Random().nextInt(500)));
            }
            FileWriter fileWriter1 = new FileWriter("C:\\temp\\Java\\DZ1\\resource\\arrayReport.txt");
            for (int i = 0; i < 10; i++) {
                fileWriter1.append(financialArray[i].getIncome() + ";" + financialArray[i].getOutcome() + ";");
            }
            fileWriter1.close();
            String outputTsk2 = "";
            FileReader fileReader1 = new FileReader("C:\\temp\\Java\\DZ1\\resource\\arrayReport.txt");
            while (fileReader1.ready()){
                outputTsk2 += (char) fileReader1.read();
            }
            String[] resultString = outputTsk2.split(";");
            int income = 0;
            int outcome = 0;
            for (int i = 0; i < resultString.length; i++) {
                if (i % 2 == 0) {
                    income += Integer.parseInt(resultString[i]);
                }
                else {
                    outcome += Integer.parseInt(resultString[i]);
                }
            }
            System.out.println("общие доходы - " + income + ", общие расходы - " + outcome);






    }
}