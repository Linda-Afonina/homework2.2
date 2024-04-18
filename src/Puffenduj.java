public class Puffenduj extends Hogwarts {

    private byte industriousness;
    private byte faithfulness;
    private byte honesty;

    public Puffenduj(String fullName, byte powerOfMagic, byte transgressionDistance,
                     byte industriousness, byte faithfulness, byte honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.faithfulness = faithfulness;
        this.honesty = honesty;
    }

    public byte getIndustriousness() {
        return this.industriousness;
    }

    public void setIndustriousness(byte industriousness) {
        this.industriousness = industriousness;
    }

    public byte getFaithfulness() {
        return this.faithfulness;
    }

    public void setFaithfulness(byte faithfulness) {
        this.faithfulness = faithfulness;
    }

    public byte getHonesty() {
        return this.honesty;
    }

    public void setHonesty(byte honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Ученик Пуффендуя - " + getFullName() +
                ", сила магии = " + getPowerOfMagic() +
                ", расстояние трансгрессии = " + getTransgressionDistance() +
                ", хитрость = " + industriousness +
                ", решительность = " + faithfulness +
                ", амбициозность = " + honesty +
                '.';
    }

    public static void isTheBestInFaculty(Puffenduj firstStudent, Puffenduj secondStudent) {
        if (firstStudent != null && secondStudent != null) {
            int pointsOfFirstStudent = firstStudent.getIndustriousness() + firstStudent.getFaithfulness() +
                    firstStudent.getHonesty();
            int pointsOfSecondStudent = secondStudent.getIndustriousness() + secondStudent.getFaithfulness() +
                    secondStudent.getHonesty();
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
