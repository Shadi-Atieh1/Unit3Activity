package unit03.activities;

public class MegaMage extends Goat {

    public MegaMage(String name) {
        super(name, 1000);
    }

    @Override
    public Attack attack() {
        int[] hits = {99, 99, 99, 99};
        return new Attack("Mega Magic Missiles", hits, DamageType.MAGICAL);
    }

    public void takeDamage(Attack attack) {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.MAGICAL) {
            adjustment = 0.75;
            this.heal(1);
        } else if(type == DamageType.PHYSICAL) {
            adjustment = 1.25;
        }
        takeDamage(attack, adjustment);
    }

}
