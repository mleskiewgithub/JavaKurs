// przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) na tych danych
public class TypyObiektowe {
    public static void main(String[] args) {

        // liczby stałoprzecinkowe
          Byte firstNumber = 127; // 1 bajt -128 do 127
          Short secondNumber = 2689; // 2 bajty -32768 do 32767
          Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
          Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
          Float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
          Double sixtNumber = 3.99999999999999D; // 8 bajtów - max 15 cyfr po przecinku

        //wartośc logiczna
          Boolean prawda = true;
          Boolean falsz = false;

        //pojedyńczy znal
          Character letter = 'A';

        // ciągi znakow
          String hello = "Hello Marcin";

        System.out.println(hello.charAt(0)); //wyciaga pierwszą literę ze string hello

    }
}
