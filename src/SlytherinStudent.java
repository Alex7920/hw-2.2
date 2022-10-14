public class SlytherinStudent extends HogwartsStudent{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public SlytherinStudent setCunning(int cunning) {
        this.cunning = cunning;
        return this;
    }

    public int getDetermination() {
        return determination;
    }

    public SlytherinStudent setDetermination(int determination) {
        this.determination = determination;
        return this;
    }

    public int getAmbition() {
        return ambition;
    }

    public SlytherinStudent setAmbition(int ambition) {
        this.ambition = ambition;
        return this;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public SlytherinStudent setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
        return this;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public SlytherinStudent setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
        return this;
    }
    private int ability() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше чем Слизеринец %s: %d vs %d%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше чем Слизеринец %s: %d vs %d%n", slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же как Слизеринец %s: %d vs %d%n", slytherinStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, thirstForPower);

    }
}
