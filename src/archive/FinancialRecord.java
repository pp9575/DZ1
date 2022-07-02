package archive;

public class FinancialRecord {
    private int income = 0;
    private int outcome = 0;

    public FinancialRecord(int income, int outcome) {
        this.income = income;
        this.outcome = outcome;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }
}
