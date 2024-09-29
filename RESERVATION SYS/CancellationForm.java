import java.util.Scanner;

public class CancellationForm {
    public static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PNR number: ");
        String pnr = scanner.nextLine();

        // Fetch and display reservation details based on PNR
        System.out.println("Reservation details for PNR: " + pnr);
        System.out.print("Do you want to cancel this reservation? (yes/no): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            // Cancel the reservation
            System.out.println("Reservation cancelled successfully!");
        } else {
            System.out.println("Cancellation aborted.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        cancelReservation();
    }
}
