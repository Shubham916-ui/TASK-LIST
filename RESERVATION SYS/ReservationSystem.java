import java.util.Scanner;

public class ReservationSystem {
    public static void makeReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter from: ");
        String from = scanner.nextLine();
        System.out.print("Enter to: ");
        String to = scanner.nextLine();

        // Insert reservation details into the database
        System.out.println("Reservation made successfully!");

        scanner.close();
    }

    public static void main(String[] args) {
        makeReservation();
    }
}