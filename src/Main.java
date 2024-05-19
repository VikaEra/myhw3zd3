public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // double amountCredit = 1_000_000; // сумма кредита
        // double loanRate = 0.008325; // (считается так = 9.99/12/100, где 9,99 - процентная ставка) месячная процентная ставка (1/100 доля процентной ставки (в месяц))
        // double creditTerm = 24; // срок кредита в месяцах

        System.out.println();
        System.out.println("Срок кредита - 1 год, ежемесячный платеж = ");
        System.out.println(service.calculate(1_000_000, 0.008325, 12));

        System.out.println();
        System.out.println("Срок кредита - 2 года, ежемесячный платеж = ");
        System.out.println(service.calculate(1_000_000, 0.008325, 24));

        System.out.println();
        System.out.println("Срок кредита - 3 года, ежемесячный платеж = ");
        System.out.println(service.calculate(1_000_000, 0.008325, 36));
    }
}