import java.util.Scanner;

public class triangle_continued {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("@");
            }for (int l=2;l<=i;l++){
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("@");
            }
            for (int l = n - 2; l >= i; l--) {
                System.out.print("@");
            }
            System.out.println();
        }

//                 @
//                @@@
//               @@@@@
//              @@@@@@@
//             @@@@@@@@@
//            @@@@@@@@@@@
//             @@@@@@@@@
//              @@@@@@@
//               @@@@@
//                @@@
//                 @

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }for(int k=n;k>=i;k--){
                System.out.print("@");
            }for (int l=n-1;l>=i;l--){
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i=2;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("@");
            }for (int l=1;l<=i-1;l++){
                System.out.print("@");
            }
            System.out.println();
        }
//        @@@@@@@@@@@
//         @@@@@@@@@
//          @@@@@@@
//           @@@@@
//            @@@
//             @
//            @@@
//           @@@@@
//          @@@@@@@
//         @@@@@@@@@
//        @@@@@@@@@@@


    }
}
