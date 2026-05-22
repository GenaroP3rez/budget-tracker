public class BudgetCategory implements Comparable<BudgetCategory>  {

    //instance and budget limits
    //what is my instance is gonna have ie budget "ebery instance woukd have"
    private double budget;
    private double expenses;
    private String name;


    //constructor and done
    public BudgetCategory(String name, double budget, double expenses){ 
        this.name = name; 
        this.budget = budget;
        this.expenses = expenses; 
        }

    //right click -> source action- fam

    //scanner 
    public double getBudget(){
        return budget;
    }
    public void setBudget(Double budget){
        this.budget = budget;
    }

    public double getExpenses(){
        return expenses;
    }
    public void setExpenses(Double expenses){
        this.expenses = expenses;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public double getDifference(){
        return expenses - budget;
    }

    public String toString(){
        return name + ": budget $" + String.format("%.2f, " budget) + ", spent" $" + String.format("%.2f, expenses);
    }

    System.out.println(grocceries.getName());
    System.out.println(grocceries.getBudget());
    System.out.println(grocceries.getExpenses());
    System.out.println(grocceries);



    public int compareTo(budgetCategrory other) {
        return Double.compare(this.getDifference(), other.getDifference());
    }

    //sonic oc ahh coding 
    
}