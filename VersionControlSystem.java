import java.util.Scanner;

public class VersionControlSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VersionControlSystem vcs = new VersionControlSystem();
        vcs.showMenu(scanner);
    }

    // Show the user menu
    private void showMenu(Scanner scanner) {
        System.out.println("Welcome to Version Control System!");
        System.out.println("1. Commit");
        System.out.println("2. View History");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        switch (choice) {
            case 1:
                commit(scanner);
                break;
            case 2:
                viewHistory();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option.");
                showMenu(scanner);
        }
    }

    // Commit a file version
    private void commit(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();

        System.out.print("Enter the file content: ");
        String content = scanner.nextLine();

        System.out.print("Enter commit message: ");
        String message = scanner.nextLine();

        FileVersion fileVersion = new FileVersion(filename, content);
        Commit commit = new Commit(message, fileVersion);

        System.out.println("Commit successful: " + commit.getMessage());
        showMenu(scanner);
    }

    // View history of commits (Dummy for now)
    private void viewHistory() {
        System.out.println("Viewing commit history...");
        // Here, you can add a list of commits
    }
}
