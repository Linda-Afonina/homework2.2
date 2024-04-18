public class Slizerin extends Hogwarts {

    private byte trick;
    private byte determination;
    private byte ambition;
    private byte resourcefulness;
    private byte domineering;

    public Slizerin(String fullName, byte powerOfMagic, byte transgressionDistance,
                    byte trick, byte determination, byte ambition, byte resourcefulness, byte domineering) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domineering = domineering;
    }

    public byte getTrick() {
        return this.trick;
    }

    public void setTrick(byte trick) {
        this.trick = trick;
    }

    public byte getDetermination() {
        return this.determination;
    }

    public void setDetermination(byte determination) {
        this.determination = determination;
    }

    public byte getAmbition() {
        return this.ambition;
    }

    public void setAmbition(byte ambition) {
        this.ambition = ambition;
    }

    public byte getResourcefulness() {
        return this.resourcefulness;
    }

    public void setResourcefulness(byte resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public byte getDomineering() {
        return this.domineering;
    }

    public void setDomineering(byte domineering) {
        this.domineering = domineering;
    }

    @Override
    public String toString() {
        return "Ученик Слизерина - " + getFullName() +
                ", сила магии = " + getPowerOfMagic() +
                ", расстояние трансгрессии = " + getTransgressionDistance() +
                ", хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажада власти = " + domineering +
                '.';
    }

    public static void isTheBestInFaculty(Slizerin firstStudent, Slizerin secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.getTrick() + firstStudent.getDetermination() +
                    firstStudent.getAmbition() + firstStudent.getResourcefulness() + firstStudent.getDomineering();
            int pointsOfSecondStudent = secondStudent.getTrick() + secondStudent.getDetermination() +
                    secondStudent.getAmbition() + secondStudent.getResourcefulness() + secondStudent.getDomineering();
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
