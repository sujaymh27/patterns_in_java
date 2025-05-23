import java.util.Scanner;

public class numerical_ptterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextByte();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
//        1
//        12
//        123
//        1234
//        12345
//        123456

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

//        1
//        22
//        333
//        4444
//        55555
//        666666

        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
//            1
//           12
//          123
//         1234
//        12345
//       123456

        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
//             1
//            22
//           333
//          4444
//         55555
//        666666

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for (int k=n;k>=i;k--){
                System.out.print(k);
            }
            System.out.println();
        }

//        654321
//         65432
//          6543
//           654
//            65
//             6
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for (int k=n;k>=i;k--){
                System.out.print(i);
            }
            System.out.println();
        }
//        111111
//         22222
//          3333
//           444
//            55
//             6

    for (int i=0;i<=n;i++){
        for (int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for (int j=0;j<=i;j++){
            System.out.print(i+1+" ");
        }
        System.out.println();
    }

//             1
//            2 2
//           3 3 3
//          4 4 4 4
//         5 5 5 5 5
//        6 6 6 6 6 6


    }
}
