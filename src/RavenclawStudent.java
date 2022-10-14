public class RavenclawStudent extends HogwartsStudent {

    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;


    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public RavenclawStudent setCleverness(int cleverness) {
        this.cleverness = cleverness;
        return this;
    }

    public int getWisdom() {
        return wisdom;
    }

    public RavenclawStudent setWisdom(int wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    public int getWit() {
        return wit;
    }

    public RavenclawStudent setWit(int wit) {
        this.wit = wit;
        return this;
    }

    public int getCreativity() {
        return creativity;
    }

    public RavenclawStudent setCreativity(int creativity) {
        this.creativity = creativity;
        return this;
    }

    private int ability() {
        return cleverness + wisdom + wit + creativity;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше чем Когтевранец %s: %d vs %d%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше чем Когтевранец %s: %d vs %d%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же как Когтевранец %s: %d vs %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d мудрость: %d остроумие: %d творчество: %d", super.toString(), cleverness, wisdom, wit, creativity);

    }
}
