public class Course {

    public static int find(int[][] a, int v) {
        for (int i = 0; i < a.length; i++) {
            int[] ia = a[i];
            for (int j = 0; j < ia.length; j++) {
                if (ia[j] == v) {
                    return i;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.printf("%d%n", a);
        boolean b = true || (a++) == 1;
        System.out.printf("%d%n", a);
        boolean c = true | (a++) == 1;
        System.out.printf("%d%n", a);

        int[][] arr = {
                { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 }
        };
        System.out.println(find(arr, 5));
    }
}
