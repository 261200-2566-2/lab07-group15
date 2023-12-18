public class CustomSetTest {
    public static void main(String[] args) {
        // Create a new CustomSet
        CustomSet<String> customSet = new CustomSet<>();

        // Test the add method
        System.out.println("Adding elements to the set:");
        System.out.println("Added 'A': " + customSet.add("A"));
        System.out.println("Added 'B': " + customSet.add("B"));
        System.out.println("Added 'C': " + customSet.add("C"));
        System.out.println("Added 'A' again: " + customSet.add("A")); // This should return false

        // Test the size and isEmpty methods
        System.out.println("\nSize of the set: " + customSet.size());
        System.out.println("Is the set empty? " + customSet.isEmpty());

        // Test the contains method
        System.out.println("\nDoes the set contain 'B'? " + customSet.contains("B"));
        System.out.println("Does the set contain 'D'? " + customSet.contains("D"));

        // Test the remove method
        System.out.println("\nRemoving 'B': " + customSet.remove("B"));
        System.out.println("Removing 'D': " + customSet.remove("D")); // This should return false

        // Test the removeAll method
        //List<String> elementsToRemove = Arrays.asList("A", "C");
        //System.out.println("\nRemoving elements 'A' and 'C': " + customSet.removeAll(elementsToRemove));

        // Test the clear method
        System.out.println("\nClearing the set");
        customSet.clear();

        // Test the size after clearing
        System.out.println("\nSize of the set after clearing: " + customSet.size());
    }
}
