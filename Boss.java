public class Boss {
    private String name;
    private int health;
    private int attackPower;

    public Boss(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public void increaseStats(double v) {
    }

    public void increaseHealth(int i) {
    }
}
