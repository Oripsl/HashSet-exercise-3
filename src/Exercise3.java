import java.util.HashSet;
import java.util.Iterator;

public class Exercise3 {
    public static void main(String[] args) {
        HashSet<String> animals = fillSet();

        Iterator iterator = animals.iterator();

        System.out.println(animals);
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
            if(element.equals("Lion")) {
                iterator.remove();
            }
        }

        System.out.println(animals);
        animals.clear();

        System.out.println("Empty hashSet: " + animals.isEmpty());

    }

    public static HashSet<String> fillSet() {
        HashSet<String> animals = new HashSet<>();
        animals.add("Lion");
        animals.add("Sheep");
        animals.add("Pig");
        animals.add("Cow");
        animals.add("Gazelle");
        return animals;
    }
}
