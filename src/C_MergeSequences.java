import java.util.*;

public class C_MergeSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }
        scanner.close();
        int [] C = new int[N+M];
        System.arraycopy(A, 0, C, 0, N);  
        System.arraycopy(B, 0, C, N, M);
        Arrays.sort(C);
        
        for (int i = 0; i < N; i++) {
                int aAns = search(C, A[i]);
                if (aAns != -1) {
                    System.out.print(aAns);
                    System.out.print(" ");
                } 
        }

        for (int i = 0; i < M; i++) {
            int bAns = search(C, B[i]);
            if (bAns != -1) {
                System.out.print(bAns);
                System.out.print(" ");
            }
        }
    }

    public static int search(int[] data, int target) {
		int ret = -1;
		int left = 0;
		int right = data.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data[mid] == target) {
				return mid + 1;
			} else if (target < data[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ret;
	}
}