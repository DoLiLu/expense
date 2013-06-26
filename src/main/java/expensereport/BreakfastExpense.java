package expensereport;

public class BreakfastExpense extends Expense {
    public BreakfastExpense(int amount) {
        super(Type.BREAKFAST, amount);
    }

    boolean isOverage() {
        return amount > 1000;
    }

    boolean isMeal() {
        return true;
    }
}
