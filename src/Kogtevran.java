public class Kogtevran extends Hogwarts {
    private byte mind;
    private byte wise;
    private byte humor;
    private byte creative;

    public Kogtevran(String fullName, byte powerOfMagic, byte transgressionDistance,
                     byte mind, byte wise, byte humor, byte creative) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wise = wise;
        this.humor = humor;
        this.creative = creative;
    }

    public byte getMind() {
        return this.mind;
    }

    public void setMind(byte mind) {
        this.mind = mind;
    }

    public byte getWise() {
        return this.wise;
    }

    public void setWise(byte wise) {
        this.wise = wise;
    }

    public byte getHumor() {
        return this.humor;
    }

    public void setHumor(byte humor) {
        this.humor = humor;
    }

    public byte getCreative() {
        return this.creative;
    }

    public void setCreative(byte creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ученик Когтеврана - " + getFullName() +
                ", сила магии = " + getPowerOfMagic() +
                ", расстояние трансгрессии = " + getTransgressionDistance() +
                ", ум = " + mind +
                ", мудрость = " + wise +
                ", остроумие = " + humor +
                ", творчество = " + creative +
                '.';
    }

    public static void isTheBestInFaculty(Kogtevran firstStudent, Kogtevran secondStudent) {
        int pointsOfFirstStudent = firstStudent.getMind() + firstStudent.getWise() + firstStudent.getHumor() +
                firstStudent.getCreative();
        int pointsOfSecondStudent = secondStudent.getMind() + secondStudent.getWise() + secondStudent.getHumor() +
                secondStudent.getCreative();
        if (pointsOfFirstStudent > pointsOfSecondStudent) {
            System.out.println(firstStudent.getFullName() + " - лучший Когтевранец, чем " +
                    secondStudent.getFullName() + ".");
        } else if (pointsOfFirstStudent < pointsOfSecondStudent) {
            System.out.println(secondStudent.getFullName() + " - лучший Когтевранец, чем " +
                    firstStudent.getFullName() + ".");
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() +
                    " - равные в Когтевране.");
        }
    }
}

