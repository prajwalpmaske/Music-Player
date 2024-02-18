import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = false;
        String currentSong = "";

        while (true) {
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Change Song");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!isPlaying) {
                        System.out.println("Playing: " + currentSong);
                        isPlaying = true;
                    } else {
                        System.out.println("Already playing.");
                    }
                    break;
                case 2:
                    if (isPlaying) {
                        System.out.println("Paused.");
                        isPlaying = false;
                    } else {
                        System.out.println("Not playing.");
                    }
                    break;
                case 3:
                    if (isPlaying) {
                        System.out.println("Stopping.");
                        isPlaying = false;
                        currentSong = "";
                    } else {
                        System.out.println("Not playing.");
                    }
                    break;
                case 4:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the new song name: ");
                    currentSong = scanner.nextLine();
                    System.out.println("Song changed to: " + currentSong);
                    break;
                case 5:
                    System.out.println("Exiting Music Player.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
