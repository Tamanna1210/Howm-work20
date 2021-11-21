package HomeWork20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        card.calculateInterest();

        Visa visa=new Visa();
        visa.calculateInterest();

        AX ax = new AX();
        ax.calculateInterest();




    }


}
