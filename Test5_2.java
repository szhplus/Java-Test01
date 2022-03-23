import java.util.Scanner;
class Test5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int b = s.nextInt();
            if (b % 2 == 0) {
                System.out.println(b + "是偶数");
            } else {
                System.out.println(b + "是奇数");

            }
        }
    }
}