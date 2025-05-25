import java.util.Scanner;

public class other_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<n;j++){
//                System.out.print("@ ");
//            }
//            System.out.println();
//        }
//        @ @ @ @ @
//        @ @ @ @ @
//        @ @ @ @ @
//        @ @ @ @ @
//        @ @ @ @ @
//        @ @ @ @ @

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<n;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==1||i==n||j==1||j==n){
//                    System.out.print("@ ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        @ @ @ @ @ @
//        @         @
//        @         @
//        @         @
//        @         @
//        @ @ @ @ @ @

     for (int i=1;i<=n;i++){
         for (int j=1;j<=i;j++){
             System.out.print(" ");
         }for (int k=n;k>=n;k--){
             System.out.print("@");
         }for (int l=1;l<=n;l++){
             if (i==1||i==n){
                 System.out.print("");
             }else {
                 System.out.print("@");
             }
         }
         System.out.println();
     }
    }
}
