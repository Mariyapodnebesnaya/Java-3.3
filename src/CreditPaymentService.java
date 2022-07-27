public class CreditPaymentService {
    public double calculate(double creditAmount , double month , double yIns) {
        double i = yIns/100/12;
        double pow = Math.pow(1+i,month);
        double result = creditAmount * (i + i/ (pow - 1));
        return Math.round(result*100)/100;
    }
}


