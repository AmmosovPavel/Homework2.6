public class Flat {
    public static void main(String[] args) {
        final int flatPrice = 5000000;
        final double firstContribution = 15.6;
        final double contribution = flatPrice * firstContribution / 100;

        System.out.println("Стоимость квартиры составляет " + flatPrice + " рублей");
        System.out.println(firstContribution + " % первоначального взноса по ипотеке");
        System.out.println(contribution + " рублей-сумма первоначального взноса");
    }
}
