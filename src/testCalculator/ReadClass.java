package testCalculator;

import java.util.Scanner;

public class ReadClass {
    public int readNextInt() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if(sc.hasNextInt()) {
            i = sc.nextInt();
        }
        else {
            System.out.println("Вы ввели некорректное число!");
        }
        return i;
    }
}
