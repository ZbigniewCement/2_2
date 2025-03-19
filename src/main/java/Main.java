import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie trzech liczb od użytkownika
        System.out.print("Podaj pierwsza liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        // Wyznaczenie największej liczby
        int najwieksza = a;

        if (b > najwieksza) {
            najwieksza = b;
        }

        if (c > najwieksza) {
            najwieksza = c;
        }

        // Wypisanie największej liczby
        System.out.println("Największa liczba to: " + najwieksza);
    }
}
