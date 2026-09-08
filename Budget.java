public class Budget {

    private double monthlyBudget;

    // Constructor
    public Budget() {
        monthlyBudget = 0;
    }

    // Set monthly budget
    public void setBudget(double amount) {
        monthlyBudget = amount;
    }

    // Get monthly budget
    public double getBudget() {
        return monthlyBudget;
    }

    // Calculate remaining budget
    public double getRemainingBudget(double totalExpense) {
        return monthlyBudget - totalExpense;
    }

    // Display budget details
    public void displayBudget(double totalExpense) {

        double remaining = getRemainingBudget(totalExpense);

        System.out.println("\n========== BUDGET DETAILS ==========");
        System.out.printf("Monthly Budget : ₹%.2f%n", monthlyBudget);
        System.out.printf("Total Expense  : ₹%.2f%n", totalExpense);
        System.out.printf("Remaining      : ₹%.2f%n", remaining);
        System.out.println("====================================");
    }
}