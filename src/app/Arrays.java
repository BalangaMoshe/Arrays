package app;

import java.util.Scanner;

public class Arrays {
    static String[] produkts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        produkts = new String[]{"№0 - Apple", "№1 - Milk", "№2 - Banana", "№3 - Sugar", "№4 - Banana"};
        int lengthRR = produkts.length;

        System.out.println(java.util.Arrays.toString(produkts));
        System.out.print("ВЫБЕРИ ПРОДУКТ ОТ 0 до 4 ");

        int getMe = scanner.nextInt();

        System.out.println("ТЫ ВЫБРАЛ " + produkts[getMe] + " ПРИЯТНОГО АППЕТИТА");
        System.out.println("ВСЕХ ПРОДУКТОВ БЫЛО " + lengthRR);
        System.out.println(produkts[produkts.length - 1] + " ЭТО БЫЛ ПОСЛЕДНИЙ ПРОДУКТ В СПИСКЕ");



    }
}
