public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1000000;
        double month = 12;
        double yIns = 9.99;
        double amountPayment = service.calculate(creditAmount, month, yIns);
        System.out.println();
        System.out.println(String.format("Сумма ежемесячного платежа: %s рублей", String.valueOf(amountPayment)));

        month = 24;
        amountPayment = service.calculate(creditAmount, month, yIns);
        System.out.println();
        System.out.println(String.format("Сумма ежемесячного платежа: %s рублей", String.valueOf(amountPayment)));

        month = 36;
        amountPayment = service.calculate(creditAmount, month, yIns);
        System.out.println();
        System.out.println(String.format("Сумма ежемесячного платежа: %s рублей", String.valueOf(amountPayment)));

    }
}