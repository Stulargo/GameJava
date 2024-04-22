import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        System.out.print("Enter your username: ");
        String playerName = input.nextLine();

        while (playerName.isEmpty()) {
            System.out.println("Please enter a valid name!");
            playerName = input.nextLine();
        }

        Hero player = new Hero(playerName,Level.LEVEL_1);
        player.showStats();

        Menu menu = new Menu();

        int choice;
        do {
            menu.showMenuBox();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    menu.explore(player);
                    break;
                case 2:
                    menu.viewInventory(player);
                    break;
                case 3:
                    menu.showQuests();
                    break;
                case 4:
                    player.showStats();
                    break;
                case 5:
                    menu.showAndChooseGame(player);
                    break;
                case 6:
                    player.levelUp();
                    break;
                case 7:
                    menu.battleBoss(player);
                    break;
                case 0:
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        input.close();
    }
}
