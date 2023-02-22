public class monthlyBalance {
    public static void main(String[] args) {
       final double startingCardbalance=5000;//stays the same
       final double interestRate = .17;//stays the same
       double firstMonth = startingCardbalance*interestRate+startingCardbalance;
       double secondMonth = firstMonth*interestRate+firstMonth;
        System.out.println("The interest due after first month is $"+firstMonth+".");
        System.out.println("The interest due after the second month is $"+secondMonth+".");
    }
}