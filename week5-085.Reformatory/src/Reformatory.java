public class Reformatory {
    private int numberWeighted;

    public int weight(Person person) {
        this.numberWeighted++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.numberWeighted;
    }

}
