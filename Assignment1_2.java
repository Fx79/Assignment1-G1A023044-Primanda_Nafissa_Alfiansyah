import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Program untuk menghitung jumlah bilangan positif.");
        System.out.println("Masukkan bilangan positif (0 untuk keluar) :");

        while (true) {
            System.out.print("Masukkan angka : ");
            number = sc.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Maaf, tolong masukkan hanya bilangan positif.");
            } else {
                sum += number;
            }
        }

        System.out.println("Total jumlah bilangan positif : " + sum);
        sc.close();
    }
}