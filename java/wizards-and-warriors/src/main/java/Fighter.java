class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return (fighter.isVulnerable()) ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared;  // Mémorise si un sort est préparé
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.spellPrepared = true;  // Met à jour l'état pour indiquer que le sort est préparé
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return (spellPrepared) ? 12 : 3;
    }
}