public class AdvancedCalcTest {
    public static void main(String[] args) {
        AdvancedCalc advancedCalc = new AdvancedCalc();
        System.out.println("Czy liczba 4 jest parzysta ? " + advancedCalc.isEven(4) );
        System.out.println("Czy liczba 5 jest parzysta ? " + advancedCalc.isEven(5) );

        System.out.println("Czy liczba 4 jest nieparzysta ? " + advancedCalc.isOdd(4));
        System.out.println("Czy liczba 5 jest nieparzysta ? " + advancedCalc.isOdd(5));

        System.out.println("Pole koła o promieniu 4.5 wynosi : " + advancedCalc.circleField(4.5));

        System.out.println("Liczba 5 podniesiona do kwadratu daje : " + advancedCalc.power(5));
    }
}
