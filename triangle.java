import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how height: "); 
        int height = sc.nextInt(); 
        for (int i = 0; i < height; i++) {
            for (int space = height - 1; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}