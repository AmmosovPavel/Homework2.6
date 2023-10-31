public class Flat {
    public static void main(String[] args) {
        final int FLAT_PRICE = 5000000;
        final double FIRST_CONTRIBUTION = 15.6;
        final double CONTRIBUTION = FLAT_PRICE * FIRST_CONTRIBUTION / 100;

        System.out.println("Стоимость квартиры составляет " + FLAT_PRICE + " рублей");
        System.out.println(FIRST_CONTRIBUTION + " % первоначального взноса по ипотеке");
        System.out.println(CONTRIBUTION + " рублей-сумма первоначального взноса");
    }
}
