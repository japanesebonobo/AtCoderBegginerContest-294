import java.util.*;

public class A_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            if (A[i]%2==0) {
                System.out.println(A[i]);
            }
        }
    }
}

