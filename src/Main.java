public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 0) {
                System.out.print((arr[x] + 1) + " ");
            } else System.out.print(arr[x] + " ");
        }
    }


    private static void task2() {

        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int x = arr.length - 1; x >= 0; x--) {
                System.out.print(arr[x] + ", ");
            }
            System.out.println();
        }

        {
            double[] arr = {1.57, 7.654, 9.986};
            for (int x = arr.length - 1; x >= 0; x--) {
                System.out.print(arr[x] + ", ");
            }
            System.out.println();

        }

        {
            int[] arr = {15, 18, 30, 78, 5};
            for (int x = arr.length - 1; x >= 0; x--) {
                System.out.print(arr[x] + ", ");
            }
            System.out.println();
        }
    }


    public static void task1() {
        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + ", ");}
            System.out.println();
        }

        {
            double[] arr = {1.57, 7.654, 9.986};
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + ", ");}
            System.out.println();

        }
        {
            int[] arr = {15, 18, 30, 78, 5};
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + ", ");}
            System.out.println();
        }
    }
}
