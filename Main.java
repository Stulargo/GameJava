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

        System.out.println("Choose your starting level:");
        System.out.println("1. Level 1");
        System.out.println("2. Level 2");
        System.out.println("3. Level 3");
        System.out.print("Enter your choice: ");
        int startingLevelChoice = input.nextInt();
        input.nextLine();

        Level startingLevel;
        switch (startingLevelChoice) {
            case 1:
                startingLevel = Level.LEVEL_1;
                break;
            case 2:
                startingLevel = Level.LEVEL_2;
                break;
            case 3:
                startingLevel = Level.LEVEL_3;
                break;
            default:
                startingLevel = Level.LEVEL_1;
                break;
        }

        Hero player = new Hero(playerName, startingLevel);
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
