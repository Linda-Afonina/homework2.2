public abstract class Hogwarts {

    private final String fullName;
    private byte powerOfMagic;
    private byte transgressionDistance;

    public Hogwarts(String fullName, byte powerOfMagic, byte transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return this.fullName;
    }

    public byte getPowerOfMagic() {
        return this.powerOfMagic;
    }

    public void setPowerOfMagic(byte powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public byte getTransgressionDistance() {
        return this.transgressionDistance;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public abstract String toString();

    public abstract boolean equals(Object otherStudent);

    public abstract int hashCode();

    public static void isTheBestInHogwarts(Hogwarts firstStudent, Hogwarts secondStudent) {
        int pointsOfFirstStudent = firstStudent.getPowerOfMagic() + firstStudent.getTransgressionDistance();
        int pointsOfSecondStudent = secondStudent.getPowerOfMagic() + secondStudent.getTransgressionDistance();
        if (pointsOfFirstStudent > pointsOfSecondStudent) {
            System.out.println(firstStudent.getFullName() + " обладает большей мощностью магии, чем " +
                    secondStudent.getFullName() + ".");
        } else if (pointsOfFirstStudent < pointsOfSecondStudent) {
            System.out.println(secondStudent.getFullName() + " обладает большей мощностью магии, чем " +
                    firstStudent.getFullName() + ".");
        } else {
            System.out.println("Они равны по силе магии");
        }
    }
}
