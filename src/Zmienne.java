// zarezerwowane miejsce w pamięci z określonym typem danych
public class Zmienne {


    public static void main(String[] args) {


        int firstNumber;
        int secondNumber;
        int result;

        String name = "Marcin";

        firstNumber = 1;
        secondNumber = 2;
        result = firstNumber + secondNumber;

        name = "Kasia"; // nadpisuje pierwszą zmienną Marcin

        System.out.println(name);
        System.out.println(result);
    }

}
