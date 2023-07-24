public class InheritanceExercise {
    public static void main(String[] args) {
        Player p = new Player();
        p.attack();
        p.defend();
        p.castSpell("Fire ball");
        p.useWeapon();
    }
}

// Player สืบทอด Character, Mage, Warrior
class Player implements Character, Mage, Warrior {
    public void attack() {
        System.out.println("The player attacks the enemy.");

    }

    public void defend() {
        System.out.println("The player defends against the enemy's atack.");

    }

    public void castSpell(String spell) {
        System.out.println("the player cast " + spell);
    }

    public void useWeapon() {
        System.out.println("The player use weapon to attack.");
    }
}

// Charecter
interface Character {
    void attack();

    void defend();
}

interface Mage {
    void castSpell(String spell);
}

interface Warrior {
    void useWeapon();
}
