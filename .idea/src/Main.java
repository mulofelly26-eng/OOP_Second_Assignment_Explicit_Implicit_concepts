import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        SavingCalculator Client_1 = new SavingCalculator();
        Client_1.calculateInterest();
    }
    public static class SavingCalculator{
        private String clientName;
        private long depositAmount;
        private double ratePercentage;
        private double interestRate;
        private double rawInterest;
        private long roundedInterest;
        private long finalAccountToatal;

        public SavingCalculator() {
        }
        public void calculateInterest(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Client Name: ");
            clientName = input.nextLine();
            System.out.println("Enter Deposit Amount: ");
            depositAmount = input.nextLong();
            System.out.println("Enter Interest Rate (%): ");
            ratePercentage = input.nextDouble();
        }
    }
}
