package testCalculator;

public class CalcTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        int one = 0;
        int two = 0;

        int action;

        do {
            System.out.print("Введите первое: ");

            one = readClass.readNextInt();


            System.out.print("Введите второе число: ");

            two = readClass.readNextInt();


            Calculator calculator = new Calculator(one, two);

            System.out.println("Выберите действие: ");
            System.out.println("1.  Сложить ");
            System.out.println("2.  Вычесть ");
            System.out.println("3.  Умножить ");
            System.out.println("4.  Поделить");
            System.out.println("0. Выход");
            System.out.println("Введите номер пункта: ");

            action = readClass.readNextInt();

            switch (action) {
                case 1:
                    System.out.println(calculator.add());
                    break;
                case 2:
                    System.out.println(calculator.subs());
                    break;
                case 3:
                    System.out.println(calculator.multi());
                    break;
                case 4:
                    System.out.println(calculator.div());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный символ!");
            }
        } while (action != 0);
    }
}
