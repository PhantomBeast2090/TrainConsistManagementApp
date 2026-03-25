import java.util.*;

public class TrainApp {
    public static void main(String args[]) {
        
        System.out.println("=== Train Consist Management App ===");
        System.out.println("\n=== UC3: Track Unique Bogie IDs (Set - HashSet) ===\n");
        
        // Create a HashSet to store unique bogie IDs
        Set<String> uniqueBogies = new HashSet<>();
        
        // Add bogie IDs (including duplicates)
        System.out.println("Adding bogie IDs to the system...");
        uniqueBogies.add("BG101");
        System.out.println("Added: BG101");
        
        uniqueBogies.add("BG102");
        System.out.println("Added: BG102");
        
        uniqueBogies.add("BG103");
        System.out.println("Added: BG103");
        
        // Attempt to add duplicate
        uniqueBogies.add("BG101");
        System.out.println("Added: BG101 (duplicate - will be ignored)");
        
        uniqueBogies.add("BG104");
        System.out.println("Added: BG104");
        
        // Another duplicate
        uniqueBogies.add("BG102");
        System.out.println("Added: BG102 (duplicate - will be ignored)");
        
        uniqueBogies.add("BG105");
        System.out.println("Added: BG105");
        
        // Display final unique bogie IDs
        System.out.println("\n=== Final Unique Bogie IDs ===");
        System.out.println("Total unique bogies: " + uniqueBogies.size());
        System.out.println("Bogie IDs: " + uniqueBogies);
        
        // Display each bogie ID
        System.out.println("\nIndividual Bogie IDs:");
        for(String bogieID : uniqueBogies) {
            System.out.println("  - " + bogieID);
        }
        
        System.out.println("\n=== Key Observations ===");
        System.out.println("- HashSet automatically prevents duplicate bogie IDs");
        System.out.println("- Duplicates are silently ignored");
        System.out.println("- Only unique bogies are retained in the system");
        System.out.println("- This ensures data integrity in the railway system");
    }
}