
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECONOMICALLUNCH = 2.50;
    private final double GOURMETLUNCH = 4.00;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= ECONOMICALLUNCH) {
            this.cashInRegister += this.ECONOMICALLUNCH;
            this.economicalSold++;
            return cashGiven - ECONOMICALLUNCH;
        }
        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= GOURMETLUNCH) {
            this.cashInRegister += this.GOURMETLUNCH;
            this.gourmetSold++;
            return cashGiven - GOURMETLUNCH;
        }
        
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= ECONOMICALLUNCH) {
            economicalSold++;
            card.pay(ECONOMICALLUNCH);
            return true;
        }
        
        return false;
    }
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= GOURMETLUNCH) {
            gourmetSold++;
            card.pay(GOURMETLUNCH);
            return true;
        }
        
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;                    
        }
    }
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}