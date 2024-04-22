public class Hero {
    private String name;
    private int health;
    private int exp;
    private int mana;
    private int abilityPower;
    private int attackPower;
    private int movementSpeed;
    private int lifeSteal;

    private Level level;

    public Hero(String name, Level level) {
        this.name = name;
        this.setLevel(level);
    }

    public void setLevel(Level level) {
        this.health = level.getHealth();
        this.exp = level.getExp();
        this.mana = level.getMana();
        this.abilityPower = level.getAbilityPower();
        this.attackPower = level.getAttackPower();
        this.movementSpeed = level.getMovementSpeed();
        this.lifeSteal = level.getLifeSteal();
        this.level = level;
    }

    public void showStats() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Experience: " + exp);
        System.out.println("Mana: " + mana);
        System.out.println("Ability Power: " + abilityPower);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Movement Speed: " + movementSpeed);
        System.out.println("Life Steal: " + lifeSteal);
        System.out.println("Level: " + level.name());
        System.out.println("------------------------");
    }

    public void levelUp() {
        System.out.println("You leveled up!");
        level = Level.values()[level.ordinal() + 1];
        setLevel(level);
        this.showStats();
    }

    public void increaseHealth(int amount) {
        health += amount;
        System.out.println("Your health increased by " + amount + "!");
        System.out.println("Current Health: " + health);
    }

    // Getters for hero's attributes
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getExp() {
        return exp;
    }

    public int getMana() {
        return mana;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getLifeSteal() {
        return lifeSteal;
    }

    public Level getLevel() {
        return level;
    }
}
