
public class Counter {

    private int counter;
    private boolean check;

    public Counter() {
        this(0, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.counter -= decreaseAmount;
        }
        
        if (this.check && this.counter < 0) {
            this.counter = 0;
        }
    }
}
