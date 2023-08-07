import java.util.Scanner;

public class sumofmultarray {
    public static void main(String[] args) {
        int m, n, p, q;
        Scanner sc = new Scanner(System.in);

        //FIRST MATRIX
        System.out.println("Enter the no of rows of the first matrix: ");
        m = sc.nextInt();
        System.out.println("Enter the number of colums of the first matrix: ");
        n = sc.nextInt();
        int a1[][] = new int[m][n];
        System.out.println("Entr the elements of the first matrix");
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the first matrix are: ");
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.print(a1[i][j] + " ");
                
            }
            System.out.println();
        }


        // SECOND MATRIX
        System.out.println("Enter the no of rows of the second matrix: ");
        p = sc.nextInt();
        System.out.println("Enter the number of colums of the second matrix: ");
        q = sc.nextInt();
         int a2[][] = new int[p][q];
         System.out.println("Enter the elements of the second matrix: ");
         for(int i=0; i<p; i++){
             for(int j =0; j<q; j++){
                 a2[i][j] = sc.nextInt();
             }
         }
 
         System.out.println("Elements of the second matrix are: ");
         for(int i=0; i<m; i++){
             for(int j =0; j<n; j++){
                 System.out.print(a2[i][j] + " ");
                 
             }
             System.out.println();
         }
         
         //SUM OF THE TWO MATRICES
        int sum[][] = new int[p][q];
        System.out.println("the sum of the two matrices are: ");
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                sum[i][j] = a1[i][j] + a2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

