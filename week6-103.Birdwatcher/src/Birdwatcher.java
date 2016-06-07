import java.util.ArrayList;

public class Birdwatcher {
    private ArrayList<Bird> collection;
    
    public Birdwatcher() {
        this.collection = new ArrayList<Bird>();
    }
    
    public void Add(String name, String latinName) {
        collection.add(new Bird(name, latinName));
    }
    
    public void Observation(String birdName) {
        for (Bird name : collection) {
            if (name.name().contains(birdName)) {
                name.birdIsObserved();
                return;
            }
        }
        
        System.out.println("Is not a bird!"); 
    }
    
    public void Statistics() {
        for (Bird name: collection) {
            System.out.println(name);
        }
    }
    
    public void Show(String birdName) {
        for (Bird name : collection) {
            if (name.name().contains(birdName)) {
                System.out.println(name);
            }
        }
    }
}
