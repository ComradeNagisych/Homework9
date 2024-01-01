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
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxSpend = arr[0];
        int minSpend = arr[0];
        for (int i: arr) {
            if (i < minSpend) {
                minSpend = i;
            }
            if (i > maxSpend) {
                maxSpend = i;
            }
        }
        System.out.println("Минимапьная сумма трат за день составила " + minSpend + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpend + " рублей");
    }
    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) total / arr.length + " рублей");
    }
    public static void task4() {
        System.out.println("Задача №4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}