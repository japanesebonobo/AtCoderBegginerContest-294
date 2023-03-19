import java.util.*;

public class B_ASCIIArt  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A[][] = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (A[i][j]==0) {
                    System.out.print('.');
                } else {
                    System.out.print(alphabet[A[i][j]-1]);
                }
            }
            System.out.println();
        }
    }
}

