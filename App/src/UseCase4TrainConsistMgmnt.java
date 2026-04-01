import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * =========================================================
 * * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * * This maps positional operations using LinkedList.
 * * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==============================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts/removals
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- SEQUENTIAL ADDITION ----
        trainConsist.add("Bogie-1");
        trainConsist.add("Bogie-2");
        trainConsist.add("Bogie-3");
        System.out.println("Initial Consist: " + trainConsist);

        // ---- POSITIONAL INSERTION ----
        // Adding an Engine at the front and a Guard Van at the rear
        trainConsist.addFirst("Engine-Front");
        trainConsist.addLast("Guard-Van-Rear");

        // Inserting at a specific index (e.g., adding a VIP bogie at position 2)
        trainConsist.add(2, "VIP-Executive");

        System.out.println("After specific insertions: " + trainConsist);

        // ---- REMOVALS FROM FRONT AND REAR ----
        // Useful for decoupling the engine or changing the last car
        trainConsist.removeFirst(); // Removes Engine-Front
        trainConsist.removeLast();  // Removes Guard-Van-Rear

        System.out.println("Final Train Structure (after front/rear removal):");
        System.out.println(trainConsist);
        System.out.println("Total Bogies: " + trainConsist.size());
    }
}