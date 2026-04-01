import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * =========================================================
 * * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 * * This maps ordered uniqueness using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==============================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADDING BOGIES IN SPECIFIC ORDER ----
        formation.add("Engine-01");
        formation.add("AC-Coach-A1");
        formation.add("Sleeper-S1");
        formation.add("General-G1");

        // ---- ATTEMPTING DUPLICATES ----
        // These will be ignored, but the original order will remain untouched
        System.out.println("System Check: Attempting to add duplicate 'Sleeper-S1'...");
        formation.add("Sleeper-S1");

        // ---- DISPLAY FINAL FORMATION ----
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        int position = 1;
        for (String bogie : formation) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }

        System.out.println("\nTotal unique bogies in sequence: " + formation.size());
    }
}