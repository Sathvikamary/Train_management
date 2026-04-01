import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * =========================================================
 * * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 * * This maps CRUD operations using ArrayList.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train
        passengerBogies.add("General-1");
        passengerBogies.add("Sleeper-1");
        passengerBogies.add("AC-3Tier-1");
        passengerBogies.add("Pantry-Car");
        System.out.println("After adding bogies: " + passengerBogies);

        // ---- READ (Check availability) ----
        String searchBogie = "Sleeper-1";
        if (passengerBogies.contains(searchBogie)) {
            System.out.println("Bogie '" + searchBogie + "' is present in the train.");
        }

        // ---- DELETE (Remove bogies) ----
        // remove() detaches a bogie from the train
        passengerBogies.remove("Pantry-Car");
        System.out.println("After removing Pantry-Car: " + passengerBogies);

        // ---- FINAL DISPLAY ----
        System.out.println("\nFinal Train Consist Summary:");
        System.out.println("Total Bogies: " + passengerBogies.size());
        System.out.println("Current List: " + passengerBogies);
    }
}