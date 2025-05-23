import java.util.Scanner;

public class character_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            char c='A';
            for (int j=1;j<=i;j++){
                System.out.print(c++);
            }
            System.out.println();
        }

//                    A
//                    AB
//                    ABC
//                    ABCD
//                    ABCDE
//                    ABCDEF

        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(c++);
            }
            System.out.println();

        }
//                    ABCDEF
//                    ABCDE
//                    ABCD
//                    ABC
//                    AB
//                    A

       for (int i=1;i<=n;i++){
           char c='A';
           for (int j=1;j<=i;j++){
               System.out.print(" ");
           }for (int k=n;k>=i;k--){
               System.out.print(c++);
           }
           System.out.println();
       }
//                  ABCDEF
//                   ABCDE
//                    ABCD
//                     ABC
//                      AB
//                       A

        for (int i=1;i<=n;i++){
            char c='A';
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print(c++);
            }
            System.out.println();
        }
//                     A
//                    AB
//                   ABC
//                  ABCD
//                 ABCDE
//                ABCDEF

        for (int i=1;i<=n;i++){
            char c='A';
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print(c+++" ");
            }
            System.out.println();
        }
//             A
//            A B
//           A B C
//          A B C D
//         A B C D E
//        A B C D E F

    }
}
