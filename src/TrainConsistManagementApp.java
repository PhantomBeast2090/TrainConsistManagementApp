// Implementing UC3 using HashSet for tracking unique bogie IDs
import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    private Set<String> uniqueBogieIDs;

    public TrainConsistManagementApp() {
        uniqueBogieIDs = new HashSet<>();
    }

    public void addBogie(String bogieID) {
        uniqueBogieIDs.add(bogieID);
    }

    public boolean hasBogie(String bogieID) {
        return uniqueBogieIDs.contains(bogieID);
    }

    // Other methods related to train consist management...
}