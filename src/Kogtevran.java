public class Kogtevran extends Hogwarts {
    private int mind;
    private int wise;
    private int humor;
    private int creative;

    public Kogtevran(String fullName, int powerOfMagic, int transgressionDistance,
                     int mind, int wise, int humor, int creative) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wise = wise;
        this.humor = humor;
        this.creative = creative;
    }

    public int getMind() {
        return this.mind;
    }

    public int getWise() {
        return this.wise;
    }

    public int getHumor() {
        return this.humor;
    }

    public int getCreative() {
        return this.creative;
    }

    @Override
    public String toString() {
        return "Ученик Когтеврана - " + fullName +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance +
                ", ум = " + mind +
                ", мудрость = " + wise +
                ", остроумие = " + humor +
                ", творчество = " + creative +
                '.';
    }

    @Override
    public int calculatePoints() {
        return mind + wise + humor + creative;
    }

    public static void isTheBestInFaculty(Kogtevran firstStudent, Kogtevran secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.calculatePoints();
            int pointsOfSecondStudent = secondStudent.calculatePoints();
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
}

