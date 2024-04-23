public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        //inkrementacja zwiększenie wartości o jeden

        int a = 0;
        System.out.println("Wartosc a: " + a); // 0
        int b = a++;
        System.out.println("Wartosc b: " + b); // 0
        System.out.println("Wartosc a: " + a); // 1
        int c = ++a;
        System.out.println("Wartosc c: " + c); // 2
        System.out.println("Wartosc a:" + a); // 2

        //dekerementacja zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartosc d: " + d); // 0
        int e = d--;
        System.out.println("Wartosc e: " + e); // 0
        System.out.println("Wartosc d: " + d); // -1
        int f = --d;
        System.out.println("Wartosc f: " + f); // -2
        System.out.println("Wartosc d:" + d); // -2



    }



}
