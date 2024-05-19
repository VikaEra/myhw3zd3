public class CreditPaymentService {
    public int calculate(double amountCredit, double loanRate, double creditTerm) {
        double annuityCoefficient = (loanRate * Math.pow((1 + loanRate), creditTerm) / (Math.pow((1 + loanRate), creditTerm) - 1)); // формула расчета для коэффициента аннуитета
        double annuityPayment = amountCredit * annuityCoefficient; // формула расчета аннуитетного платежа
        int anPayment = (int) annuityPayment;
        return anPayment;
    }
}