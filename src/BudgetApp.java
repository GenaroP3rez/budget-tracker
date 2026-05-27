import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> categories = new ArrayList<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            if (scan.hasNextLine()) {
                scan.nextLine();
            }

            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            categories.add(budgetCategory);
        }

        System.out.println("Original Categories:");
        System.out.println(categories);

        Collections.sort(categories, Collections.reverseOrder());

        System.out.println();
        System.out.println("Categories from most overspent to least:");
        System.out.println(categories);

        int difference = budgetDifference(categories);

        System.out.println();
        System.out.println("Total budget Difference: $" + difference);

        double average = averageDifference(categories);
        System.out.println("Average budget Difference: $" + String.format("%.2f", average));
    }

    public static int budgetDifference(List<BudgetCategory> categories) {
        double total = 0;

        for (BudgetCategory category : categories) {
            total += category.getDifference();
        }

        return (int) total;
    }

    public static double averageDifference(List<BudgetCategory> categories) {
        if (categories.size() == 0) {
            return 0;
        }

        return (double) budgetDifference(categories) / categories.size();
    }
}