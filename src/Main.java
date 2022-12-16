public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        System.out.println("Задача 1 ( способ 1)");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 1( способ 2");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int arrMax = 99999;
        int arrMin = 200000;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            } else if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        System.out.println(" Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей ");
    }

    public static void task4() {
        System.out.println("Задача 3");
        double[] arr = {23, 34, 45, 2, 9, 56, 9, 6, 4, 3, 3, 3, 5, 6, 7, 8, 9, 0, 23, 67, 9, 45, 3, 5, 6, 7, 8, 3, 8, 3,};
        double sum = 0;
        double arrAverage = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        arrAverage = sum / arr.length;


        System.out.println(" Средняя сумма трат за месяц составила " + arrAverage + " рублей");
    }

    public static void task5() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index > -1; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}
