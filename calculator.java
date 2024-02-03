import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        scanner.close();
    }
}
