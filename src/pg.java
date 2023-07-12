import java.util.Scanner;

public class pg {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int a = sm.nextInt();
        int b = sm.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


