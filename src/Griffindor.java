public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int powerOfMagic, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    @Override
    public String toString() {
        return "Ученик Гриффиндора - " + fullName +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery + '.';
    }

    @Override
    public int calculatePoints() {
        return nobility + honor + bravery;
    }

    public static void isTheBestInFaculty(Griffindor firstStudent, Griffindor secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.calculatePoints();
            int pointsOfSecondStudent = secondStudent.calculatePoints();
            if (pointsOfFirstStudent > pointsOfSecondStudent) {
                System.out.println(firstStudent.getFullName() + " - лучший Гриффиндорец, чем " +
                        secondStudent.getFullName() + ".");
            } else if (pointsOfFirstStudent < pointsOfSecondStudent) {
                System.out.println(secondStudent.getFullName() + " - лучший Гриффиндорец, чем " +
                        firstStudent.getFullName() + ".");
            } else {
                System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() +
                        " - равные в Гриффиндоре.");
            }
        } else {
            System.out.println("Введите корректные данные");
        }
    }
}
