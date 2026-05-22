import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> categories = new ArrayList<>();
        // Scanner scan = new Scanner(System.in);


        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

        //     // Consume \n after spent input 
        //     if(scan.hasNextLine()) scan.nextLine();

        if (scan.hasNextLine()) {
            scan.nextLine();
            
        }
      BudgetCategory BudgetCategory = new BudgetCategory(category, limit, spent);
      categories.add(BudgetCategory);
    }
    System.out.println("Original Categroeis");
    System.out.println(categories);

    Collections.sort(categories, Collections.reverseOrder());

    System.out.println();
    System.out.println("Categrories from most overspent to least:");
    System.out.println(categories);

    int difference = budgetDifference(categories);

    System.out.println();
    System.out.println("Total budget Difference: $" + difference);
}

        //     String limitString = String.format("$%.2f", limit);
        //     String spentString = String.format("$%.2f", spent);
        //     System.out.println("The budget limit for " + category + " was: " + limitString + 
        //                        " but the actual spend was " + spentString);
        // }

        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4

        double total = 0; 
        for (BudgetCategory : categories){
            total += catagory .getDifference();
        }
        // return (int) total; 
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        //return -1;

        return (int) total; 
    }
    //attemopt at W5
    public static double averageDifference(List<BudgetCategory> categories){
        if (categories.size() = 0){
            return 0;
        }
        return (double) budgetDifference(category) / categories.size();
    }



}