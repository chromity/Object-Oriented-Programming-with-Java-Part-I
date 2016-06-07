
public class Bird {
    private String name;
    private String nameLatin;
    private int numberOfObservation;
    
    public Bird (String name, String nameInLatin) {
        this.name = name;
        this.nameLatin = nameInLatin;
        this.numberOfObservation = 0;
    }
    
    public String name() {
        return this.name;
    }
    
    public String nameInLatin() {
        return this.nameLatin;
    }
    
    public int numberOfObservation() {
        return this.numberOfObservation;
    }
    
    public void birdIsObserved() {
        this.numberOfObservation++;
    }
    
    @Override
    public String toString() {
            + this.numberOfObservation + " observations";
    }
}
