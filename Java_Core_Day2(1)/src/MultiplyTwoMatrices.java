import java.util.*;
public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] originalMatrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                originalMatrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpositionMatrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transpositionMatrix[i][j] = originalMatrix[j][i];
            }
        }

        int[][] result = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = 0;
                for(int k = 0; k < n; k++){
                    result[i][j] += originalMatrix[i][k] * transpositionMatrix[k][j];
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
