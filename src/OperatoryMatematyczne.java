// umożliwijają wykonanie podtawowych operacji matematycznych

public class OperatoryMatematyczne {

    public static void main(String[] args) {
      int firstNumber = 4;
      int secondNumber = 6;
      float thirdNumber = 4.0F;


      int addition = firstNumber + secondNumber; //10
      int subtraction = firstNumber - secondNumber; // -2
      int multiplication = firstNumber * secondNumber; // 24
      float divison = thirdNumber/secondNumber; // 0,66
      int mod = secondNumber%firstNumber; //reszta z dzielenia - 4 mieści sie w 6 = 0, reszta 2

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie " + divison);
        System.out.println("Modulo: " + mod);

        firstNumber+=secondNumber; //firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber); // 10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odejmowaniu " + firstNumber);// 4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnozeniu " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); // 4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber); // 0
    }
}
