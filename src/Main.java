public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
            System.out.println();
        }

        {
            double[] arr = {1.57, 7.654, 9.986};
            System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);

        }
        {
            int[] arr = {15, 18, 30, 78, 5};
            System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4]);
        }
    }
}
