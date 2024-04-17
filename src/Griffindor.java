public class Griffindor extends Hogwarts {
    private byte nobility;
    private byte honor;
    private byte bravery;

    public Griffindor(String fullName, byte powerOfMagic, byte transgressionDistance,
                      byte nobility, byte honor, byte bravery) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public byte getNobility() {
        return this.nobility;
    }

    public void setNobility(byte nobility) {
        this.nobility = nobility;
    }

    public byte getHonor() {
        return this.honor;
    }

    public void setHonor(byte honor) {
        this.honor = honor;
    }

    public byte getBravery() {
        return this.bravery;
    }

    public void setBravery(byte bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return
                "Ученик Гриффиндора - " + getFullName() +
                        ", сила магии = " + getPowerOfMagic() +
                        ", расстояние трансгрессии = " + getTransgressionDistance() +
                        ", благородство = " + nobility +
                        ", честь = " + honor +
                        ", храбрость = " + bravery + '.';
    }

    @Override
    public boolean equals(Object otherStudent) {
        if (otherStudent == null || this.getClass() != otherStudent.getClass()) {
            return false;
        }
        Griffindor student = (Griffindor) otherStudent;
        return getFullName().equals(student.getFullName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getFullName());
    }

    public static void isTheBestInFaculty(Griffindor firstStudent, Griffindor secondStudent) {
        int pointsOfFirstStudent = firstStudent.getBravery() + firstStudent.getHonor() + firstStudent.getNobility();
        int pointsOfSecondStudent = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();
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
    }
}
