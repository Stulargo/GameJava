import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner userInput = new Scanner(System.in);
    Random random = new Random();

    String[] stories = {
            "You stumbled upon a hidden treasure chest!",
            "You encountered a group of friendly travelers.",
            "You found a mysterious artifact in the forest.",
            "You got lost in a maze of tunnels.",
            "You discovered a secret passage behind a waterfall."
    };

    String[] quests = {
            "Quest 1: Find the lost artifact in the forest.",
            "Quest 2: Rescue the captured villagers from the bandits.",
            "Quest 3: Investigate the strange occurrences in the haunted mansion."
    };

    public void showMenuBox() {
        String[] menuItems = {"Explore", "View Inventory", "Quests", "Stats", "Games", "Level Up","Battle Boss"};

        System.out.println("Choose your action:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.print("| " + (i + 1) + ". " + menuItems[i] + " | ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void showAndChooseGame(Hero player) {
        System.out.println("Choose a game:");
        System.out.println("1. Guessing Game");

        int choice = userInput.nextInt();
        userInput.nextLine();

        switch (choice) {
            case 1:
                playGuessingGame();
                break;
            default:
                System.out.println("Invalid choice. Returning to menu.");
        }
    }

    private void playGuessingGame() {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.play();
    }

    public void explore(Hero player) {
        int randomIndex = random.nextInt(stories.length);
        System.out.println(stories[randomIndex]);
    }

    public void viewInventory(Hero player) {
        System.out.println("Inventory:");
    }

    public void showQuests() {
        System.out.println("Quests:");
        for (String quest : quests) {
            System.out.println(quest);
        }
    }

    public void battleBoss(Hero player) {
        Boss boss = new Boss("Dragon", 100, 20);
        System.out.println("A fearsome " + boss.getName() + " appears!");

        double v = 0.1;
        int i = 50;

        while (player.getHealth() > 0 && boss.getHealth() > 0) {
            int playerDamage = player.getAttackPower();
            System.out.println(player.getName() + " attacks " + boss.getName() + " for " + playerDamage + " damage!");
            boss.reduceHealth(playerDamage);

            if (boss.getHealth() <= 0) {
                System.out.println("Congratulations! You defeated " + boss.getName() + "!");
                boss.increaseStats(v);
                boss.increaseHealth(i);
                return;
            }

            int bossDamage = boss.getAttackPower();
            System.out.println(boss.getName() + " attacks " + player.getName() + " for " + bossDamage + " damage!");

            if (player.getHealth() <= 0) {
                System.out.println("Game over! " + boss.getName() + " defeated you!");
                return;
            }
        }
    }
}
