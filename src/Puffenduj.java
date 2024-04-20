public class Puffenduj extends Hogwarts {

    private int industriousness;
    private int faithfulness;
    private int honesty;

    public Puffenduj(String fullName, int powerOfMagic, int transgressionDistance,
                     int industriousness, int faithfulness, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.faithfulness = faithfulness;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return this.industriousness;
    }

    public int getFaithfulness() {
        return this.faithfulness;
    }

    public int getHonesty() {
        return this.honesty;
    }

    @Override
    public String toString() {
        return "Ученик Пуффендуя - " + fullName +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance +
                ", хитрость = " + industriousness +
                ", решительность = " + faithfulness +
                ", амбициозность = " + honesty +
                '.';
    }

    @Override
    public int calculatePoints() {
        return industriousness + faithfulness + honesty;
    }

    public static void isTheBestInFaculty(Puffenduj firstStudent, Puffenduj secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.calculatePoints();
            int pointsOfSecondStudent = secondStudent.calculatePoints();
            if (pointsOfFirstStudent > pointsOfSecondStudent) {
                System.out.println(firstStudent.getFullName() + " - лучший Пуффендуец, чем " +
                        secondStudent.getFullName() + ".");
            } else if (pointsOfFirstStudent < pointsOfSecondStudent) {
                System.out.println(secondStudent.getFullName() + " - лучший Пуффендуец, чем " +
                        firstStudent.getFullName() + ".");
            } else {
                System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() +
                        " - равные в Пуффендуе.");
            }
        }
    }
}
