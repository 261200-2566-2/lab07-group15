import java.util.Arrays;
import java.util.List;

public class Lab07 {
    public static void main(String[] args) {
        CustomSet<Integer> mySet = new CustomSet<>();
        System.out.println("Size? " + mySet.size());
        System.out.println("Is Empty? " + mySet.isEmpty());
        mySet.add(3);
        System.out.println("Contain 3? " + mySet.contains(3));
        System.out.println("Contain 5? " + mySet.contains(5));
        System.out.println("Is Empty? " + mySet.isEmpty());
        System.out.println("Size? " + mySet.size());
        mySet.add(3);
        System.out.println("Size? " + mySet.size());
        mySet.add(50);
        System.out.println("Size? " + mySet.size());
        mySet.clear();
        System.out.println("Size? " + mySet.size());
        List<String> testElements = Arrays.asList("A", "C", "E");
        CustomSet<String> anotherSet = new CustomSet<>();
        System.out.println("Size? " + anotherSet.size());
        anotherSet.addAll(testElements);
        System.out.println("Size? " + anotherSet.size());
        anotherSet.remove("C");
        System.out.println("Size? " + anotherSet.size());
        anotherSet.add("F");
        anotherSet.add("Z");
        System.out.println("Size? " + anotherSet.size());
        System.out.println("Contain all A,C,E?" + anotherSet.containsAll(testElements));
        anotherSet.add("C");
        System.out.println("Contain all A,C,E?" + anotherSet.containsAll(testElements));
        System.out.println("Size? " + anotherSet.size());
        System.out.println("Remove All A,C,E");
        anotherSet.removeAll(testElements);
        System.out.println("Size? " + anotherSet.size());
        anotherSet.clear();
        System.out.println("Size? " + anotherSet.size());
    }
}
