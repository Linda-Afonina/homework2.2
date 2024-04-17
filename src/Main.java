public class Main {
    public static void main(String[] args) {

        Griffindor[] studentsOfGriffindor = new Griffindor[3];
        studentsOfGriffindor[0] = new Griffindor("Гарри Поттер", (byte) 90, (byte) 45, (byte) 78, (byte) 56, (byte) 66);
        studentsOfGriffindor[1] = new Griffindor("Гермиона Грейнджер", (byte) 46, (byte) 30, (byte) 72, (byte) 90, (byte) 80);
        studentsOfGriffindor[2] = new Griffindor("Рон Уизли", (byte) 16, (byte) 50, (byte) 60, (byte) 52, (byte) 86);
        System.out.println(studentsOfGriffindor[0]);
        System.out.println(studentsOfGriffindor[1]);
        System.out.println(studentsOfGriffindor[2]);
        Griffindor.isTheBestInFaculty(studentsOfGriffindor[0], studentsOfGriffindor[2]);
        Hogwarts.isTheBestInHogwarts(studentsOfGriffindor[2], studentsOfGriffindor[1]);

        Kogtevran[] studentsOfKogtevran = new Kogtevran[3];
        studentsOfKogtevran[0] = new Kogtevran("Чжоу Чанг", (byte) 48, (byte) 75, (byte) 20, (byte) 68, (byte) 33, (byte) 44);
        studentsOfKogtevran[1] = new Kogtevran("Падма Патил", (byte) 67, (byte) 90, (byte) 23, (byte) 80, (byte) 44, (byte) 55);
        studentsOfKogtevran[2] = new Kogtevran("Маркус Белби", (byte) 64, (byte) 80, (byte) 41, (byte) 85, (byte) 11, (byte) 56);
        System.out.println(studentsOfKogtevran[0]);
        System.out.println(studentsOfKogtevran[1]);
        System.out.println(studentsOfKogtevran[2]);

        Hogwarts.isTheBestInHogwarts(studentsOfGriffindor[2], studentsOfKogtevran[1]);
    }
}