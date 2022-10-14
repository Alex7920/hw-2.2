public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;


    public GryffindorStudent(String name, int magic, int transgression, int nobility,int honor,int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public GryffindorStudent setNobility(int nobility) {
        this.nobility = nobility;
        return this;
    }

    public int getHonor() {
        return honor;
    }

    public GryffindorStudent setHonor(int honor) {
        this.honor = honor;
        return this;
    }

    public int getBravery() {
        return bravery;
    }

    public GryffindorStudent setBravery(int bravery) {
        this.bravery = bravery;
        return this;
    }
    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
          System.out.printf("Гриффиндорец %s лучше чем гриффендорец %s: %d vs %d%n", getName(),gryffindorStudent.getName(),ability1,ability2);
        } else  if  (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше чем гриффендорец %s: %d vs %d%n", gryffindorStudent.getName(),getName(),ability2,ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же как гриффендорец %s: %d vs %d%n", gryffindorStudent.getName(), getName(), ability1, ability2);
           }
        }
        private int ability() { return nobility + honor + bravery;}

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(),nobility,honor,bravery);

        }
    }


