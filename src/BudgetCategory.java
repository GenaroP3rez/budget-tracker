public class BudgetCategory implements Comparable<BudgetCategory> {

    private double budget;
    private double expenses;
    private String name;

    public BudgetCategory(String name, double budget, double expenses) {
        this.name = name;
        this.budget = budget;
        this.expenses = expenses;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDifference() {
        return expenses - budget;
    }

    public String toString() {
        return name + ": budget $" + String.format("%.2f", budget)
                + ", spent $" + String.format("%.2f", expenses)
                + ", difference $" + String.format("%.2f", getDifference());
    }

    public int compareTo(BudgetCategory other) {
        return Double.compare(this.getDifference(), other.getDifference());
    }
}