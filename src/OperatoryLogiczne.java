public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        //&& -> true gdy wyrażenia składowe sa równe true (i)

        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub -> true jedno wyrażenie składowe jest równe true (lub)
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false

        // ! negacja - zwraca wartść przeciwną do wyrażenia przed którym się znajduje (zaprzeczenie)
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue)); // true
    }
}
