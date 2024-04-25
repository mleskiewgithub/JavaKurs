import java.util.Scanner;

public class Calculator {

    // napisz program, który poprosi uzytkownika 0 2 liczby, a nastepnie wykonan na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj prosze pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj prosze druga liczbe");
        int secondNumber = scanner.nextInt();


        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int divison = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie " + divison);
        System.out.println("Modulo: " + mod);

    }
}
