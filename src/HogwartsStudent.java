public abstract class HogwartsStudent {

    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public HogwartsStudent setName(String name) {
        this.name = name;
        return this;
    }

    public int getMagic() {
        return magic;
    }

    public HogwartsStudent setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public int getTransgression() {
        return transgression;
    }

    public HogwartsStudent setTransgression(int transgression) {
        this.transgression = transgression;
        return this;
    }
    public void print() {
        System.out.println(this);
    }
    private int ability() {
        return magic + transgression;
    }
    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = this.ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2){
           System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n", getName(), hogwartsStudent.getName(),ability1,ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n", getName(), hogwartsStudent.getName(),ability2,ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n", getName(), hogwartsStudent.getName(), ability1, ability2);
        }
        }
        public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",name,magic,transgression);
        }
    }

