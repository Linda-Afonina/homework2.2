public class Slizerin extends Hogwarts {

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int domineering;

    public Slizerin(String fullName, int powerOfMagic, int transgressionDistance,
                    int trick, int determination, int ambition, int resourcefulness, int domineering) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domineering = domineering;
    }

    public int getTrick() {
        return this.trick;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getDomineering() {
        return this.domineering;
    }

    @Override
    public String toString() {
        return "Ученик Слизерина - " + fullName +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance +
                ", хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажада власти = " + domineering +
                '.';
    }

    @Override
    public int calculatePoints() {
        return trick + determination + ambition + resourcefulness + domineering;
    }

    public static void isTheBestInFaculty(Slizerin firstStudent, Slizerin secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.calculatePoints();
            int pointsOfSecondStudent = secondStudent.calculatePoints();
            if (pointsOfFirstStudent > pointsOfSecondStudent) {
                System.out.println(firstStudent.getFullName() + " - лучший Слизеринец, чем " +
                        secondStudent.getFullName() + ".");
            } else if (pointsOfFirstStudent < pointsOfSecondStudent) {
                System.out.println(secondStudent.getFullName() + " - лучший Слизеринец, чем " +
                        firstStudent.getFullName() + ".");
            } else {
                System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() +
                        " - равные в Слизерине.");
            }
        }
    }
}
