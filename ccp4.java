import java.util.Scanner;

class ccp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i <= t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(n + " " + s + " ");
            System.out.println(n + "\n" + s + "\n");
        }
    }
}