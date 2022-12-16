import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sumExpense = 0;
        for (int expenseDay : arr) {
            sumExpense += expenseDay;
        }
        System.out.println("Сумма трат за месяц составила " + sumExpense + " рублей");

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxExpense = 99_000;
        int minExpense = 201_000;
        for (final int current : arr) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }
        for (final int current : arr) {
            if (current < minExpense) {
                minExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int days = 30; //количество дней
        int sumExpense = 0; //суммарные траты
        for (int expenseDay : arr) {
            sumExpense += expenseDay;
        }
        float averageExpense = (float) sumExpense / days; //средние траты
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }


}