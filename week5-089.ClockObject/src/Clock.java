
import java.util.Calendar;

public class Clock {

    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        this.seconds.next();

        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }
    
    @Override
    public String toString() {
        return this.hours.toString() + ":" + this.minutes.toString() 
                + ":" + this.seconds.toString();
    }
}
