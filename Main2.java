package src.main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 số nguyên:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(n);
        System.out.println("Do you want to continue? (Y/N)");
        String ans = scanner.nextLine();
        System.out.println(ans);
        while (ans.equalsIgnoreCase("Y")) {
            System.out.println("Mời bạn nhập 1 số nguyên:");
            int n1 = Integer.parseInt(scanner.nextLine());
            System.out.println(n1);
            System.out.println( n += n1);
            System.out.println("Do you want to continue? (Y/N)");
            String ans1 = scanner.nextLine();
            System.out.println(ans1);
            if (ans1.equalsIgnoreCase("N")){
                System.out.println("Kết quả là: "+n);
                break;
            }
        }
        while (ans.equalsIgnoreCase("N")){
            System.out.println("Kết quả là: "+n);
            break;
        }
    }
}
