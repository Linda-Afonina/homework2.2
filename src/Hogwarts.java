public abstract class Hogwarts {

    protected final String fullName;
    protected int powerOfMagic;
    protected int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }


    public String getFullName() {
        return this.fullName;
    }

    public int getPowerOfMagic() {
        return this.powerOfMagic;
    }

    public int getTransgressionDistance() {
        return this.transgressionDistance;
    }

    public abstract String toString();

    public abstract int calculatePoints();

    public int calculateBasicPoints() {
        return powerOfMagic + transgressionDistance;
    }

    public void isTheBestInHogwarts(Hogwarts student) {
        if (student != null) {
            int sum1 = calculateBasicPoints();
            int sum2 = student.calculateBasicPoints();
            if (sum1 > sum2) {
                System.out.println(fullName + " обладает большей мощностью магии, чем " +
                        student.fullName + ".");
            } else if (sum1 < sum2) {
                System.out.println(student.fullName + " обладает большей мощностью магии, чем " +
                        fullName + ".");
            } else {
                System.out.println("Они равны по силе.");
            }
        }
    }

    public void isTheBestInFaculty(Hogwarts student) {
        if (student != null && student.getClass() == getClass()) {
            int sum1 = calculatePoints(); //абстрактный метод, без тела. При вызове будет использован метод того класса, который нужен (объект которого используется)
            int sum2 = student.calculatePoints();
            if (sum1 > sum2) {
                System.out.println(fullName + " лучше на факультете, чем " +
                        student.fullName + ".");
            } else if (sum1 < sum2) {
                System.out.println(student.fullName + " лучше на факультете, чем " +
                        fullName + ".");
            } else {
                System.out.println("Они равны по силе.");
            }
        } else {
            System.out.println("Данные не корректны!");
        }
    }
}
