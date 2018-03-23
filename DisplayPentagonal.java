import java.util.Scanner;

public class DisplayPentagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter n: ");
            n = input.nextInt();
            if (n > 0) {
                System.out.println("Pentagonal Number is: " + getPentagonalNumber(n));
            } else
                System.out.println("Worng number!");
        }while (n <= 0);

    }
    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }
}
