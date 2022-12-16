public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1,1");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
    }

    public static void task2() {
        System.out.println("Задача 1,2");
        double[] weight = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public static void task3() {
        System.out.println("Задача 1,3");
        double[] box = new double[7];
        box[0] = 93;
        box[1] = 74;
        box[2] = 46.56;
        box[3] = 3;
        box[4] = 93;
        box[5] = 2;
        box[6] = 13.73;
    }

    public static void task4() {
        System.out.println("Задача 2,1");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 2,2");
        double[] weight = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 2,3");
        double[] box = new double[7];
        box[0] = 93;
        box[1] = 74;
        box[2] = 46.56;
        box[3] = 3;
        box[4] = 93;
        box[5] = 2;
        box[6] = 13.73;
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i != box.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 3,1");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 3,2");
        double[] weight = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 3,3");
        double[] box = new double[7];
        box[0] = 93;
        box[1] = 74;
        box[2] = 46.56;
        box[3] = 3;
        box[4] = 93;
        box[5] = 2;
        box[6] = 13.73;
        for (int i = box.length - 1; i > 0; i--) {
            System.out.print(box[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 4");
        int[] weight = {1, 2, 3, 4, 5};
        for (int i = 0; i <= weight.length; i++) {
            if (i % 2 != 0) {
                i = i + 1;
                System.out.print(" " + i + " ");
                if (i != weight.length + 1) {
                    System.out.print(" , ");
                }
            }
        }
    }
}