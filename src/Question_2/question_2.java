package Question_2;
import java.util.Scanner;
import java.util.Arrays;

public class question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a comparable number z: ");
        double z = scanner.nextDouble();
        int c = 0; // переменная количества замен
        System.out.print("Enter the number of cells in the array an : ");
        int n = scanner.nextInt();
        double[] a = new double[n]; // {a1 + a2 + ... + an}
        for (int i = 0; i < n; i++) {
            System.out.print("a" + i + " will be equal: ");
            a[i] = scanner.nextDouble(); // присвоим каждой ячейке значение
        }
        System.out.println("Old array - " + Arrays.toString(a));

        for (int i = 0; i < n; i++) {
            if (a[i] < z) {
                a[i] = z;
                c = c + 1;
            }
            else {
                a[i] *= 1;
            }
        }
        System.out.println("New array - " + Arrays.toString(a));
        System.out.println("Numbers of changes: " + c);
    }
}













