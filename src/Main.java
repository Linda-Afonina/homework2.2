public class Main {
    public static void main(String[] args) {

        System.out.println("Описание студентов:");
        Griffindor[] studentsOfGriffindor = new Griffindor[3];
        studentsOfGriffindor[0] = new Griffindor("Гарри Поттер", (byte) 90, (byte) 45, (byte) 78, (byte) 56, (byte) 66);
        studentsOfGriffindor[1] = new Griffindor("Гермиона Грейнджер", (byte) 46, (byte) 30, (byte) 72, (byte) 90, (byte) 80);
        studentsOfGriffindor[2] = new Griffindor("Рон Уизли", (byte) 16, (byte) 50, (byte) 60, (byte) 52, (byte) 86);
        System.out.println(studentsOfGriffindor[0]);
        System.out.println(studentsOfGriffindor[1]);
        System.out.println(studentsOfGriffindor[2]);

        Kogtevran[] studentsOfKogtevran = new Kogtevran[3];
        studentsOfKogtevran[0] = new Kogtevran("Чжоу Чанг", (byte) 48, (byte) 75, (byte) 20, (byte) 68, (byte) 33, (byte) 44);
        studentsOfKogtevran[1] = new Kogtevran("Падма Патил", (byte) 67, (byte) 90, (byte) 23, (byte) 80, (byte) 44, (byte) 55);
        studentsOfKogtevran[2] = new Kogtevran("Маркус Белби", (byte) 64, (byte) 80, (byte) 41, (byte) 85, (byte) 11, (byte) 56);
        System.out.println(studentsOfKogtevran[0]);
        System.out.println(studentsOfKogtevran[1]);
        System.out.println(studentsOfKogtevran[2]);

        Slizerin[] studentsOfSlizerin = new Slizerin[3];
        studentsOfSlizerin[0] = new Slizerin("Драко Малфой", (byte) 45, (byte) 65, (byte) 64, (byte) 78, (byte) 23, (byte) 41, (byte) 78);
        studentsOfSlizerin[1] = new Slizerin("Грэхэм Монтегю", (byte) 56, (byte) 60, (byte) 90, (byte) 77, (byte) 45, (byte) 78, (byte) 60);
        studentsOfSlizerin[2] = new Slizerin("Грегори Гойл", (byte) 78, (byte) 33, (byte) 80, (byte) 70, (byte) 54, (byte) 77, (byte) 62);
        System.out.println(studentsOfSlizerin[0]);
        System.out.println(studentsOfSlizerin[1]);
        System.out.println(studentsOfSlizerin[2]);

        Puffenduj[] studentsOfPuffenduj = new Puffenduj[3];
        studentsOfPuffenduj[0] = new Puffenduj("Захария Смит", (byte) 45, (byte) 56, (byte) 78, (byte) 91, (byte) 44);
        studentsOfPuffenduj[1] = new Puffenduj("Седрик Диггори", (byte) 55, (byte) 28, (byte) 55, (byte) 66, (byte) 51);
        studentsOfPuffenduj[2] = new Puffenduj("Джастин Финч-Флетчли", (byte) 61, (byte) 40, (byte) 71, (byte) 65, (byte) 71);
        System.out.println(studentsOfPuffenduj[0]);
        System.out.println(studentsOfPuffenduj[1]);
        System.out.println(studentsOfPuffenduj[2]);


        System.out.println("Лучший на факультете:");
        Griffindor.isTheBestInFaculty(studentsOfGriffindor[0], studentsOfGriffindor[2]);
        Kogtevran.isTheBestInFaculty(studentsOfKogtevran[0], studentsOfKogtevran[1]);
        Slizerin.isTheBestInFaculty(studentsOfSlizerin[1], studentsOfSlizerin[2]);
        Puffenduj.isTheBestInFaculty(studentsOfPuffenduj[1], studentsOfPuffenduj[0]);

        System.out.println("Лучший в Хогвартсе:");
        Hogwarts.isTheBestInHogwarts(studentsOfGriffindor[2], studentsOfSlizerin[1]);
        Hogwarts.isTheBestInHogwarts(studentsOfGriffindor[1], studentsOfKogtevran[1]);
        Hogwarts.isTheBestInHogwarts(studentsOfSlizerin[0], studentsOfPuffenduj[2]);
        Hogwarts.isTheBestInHogwarts(studentsOfPuffenduj[0], studentsOfKogtevran[2]);
    }
}