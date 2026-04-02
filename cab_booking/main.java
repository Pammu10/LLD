import java.util.main;
public class Main {
    public static void main(String[] args) {
        CabService service = new CabService();

        // Step 1 — Onboard 3 users
        // add Abhishek, Rahul, Nandini
        // update their locations

        // Step 2 — Onboard 3 drivers
        // Driver1 at (10,1), Driver2 at (11,10), Driver3 at (5,3)

        // Step 3 — Abhishek tries to find ride (0,0) -> (20,1)
        // should print: No ride found

        // Step 4 — Rahul finds ride (10,0) -> (15,3)
        // should show Driver1, choose it, calculate bill

        // Step 5 — Set Driver1 unavailable
        // Nandini tries to find ride — should print No ride found

        // Step 6 — find_total_earning()
    }
}