public class Main {
    public static void main(String[] args) {

        System.out.println("Описание студентов:");
        Griffindor[] studentsOfGriffindor = new Griffindor[3];
        studentsOfGriffindor[0] = new Griffindor("Гарри Поттер", (byte) 90, (byte) 45, (byte) 78, (byte) 56, (byte) 66);
        studentsOfGriffindor[1] = new Griffindor("Гермиона Грейнджер", (byte) 46, (byte) 30, (byte) 72, (byte) 90, (byte) 80);
        studentsOfGriffindor[2] = new Griffindor("Рон Уизли", (byte) 16, (byte) 50, (byte) 60, (byte) 52, (byte) 86);
        Griffindor garri = studentsOfGriffindor[0];
        Griffindor germiona = studentsOfGriffindor[1];
        Griffindor ron = studentsOfGriffindor[2];
        System.out.println(garri);
        System.out.println(germiona);
        System.out.println(ron);

        Kogtevran[] studentsOfKogtevran = new Kogtevran[3];
        studentsOfKogtevran[0] = new Kogtevran("Чжоу Чанг", (byte) 48, (byte) 75, (byte) 20, (byte) 68, (byte) 33, (byte) 44);
        studentsOfKogtevran[1] = new Kogtevran("Падма Патил", (byte) 67, (byte) 90, (byte) 23, (byte) 80, (byte) 44, (byte) 55);
        studentsOfKogtevran[2] = new Kogtevran("Маркус Белби", (byte) 64, (byte) 80, (byte) 41, (byte) 85, (byte) 11, (byte) 56);
        Kogtevran chzhou = studentsOfKogtevran[0];
        Kogtevran padma = studentsOfKogtevran[1];
        Kogtevran markus = studentsOfKogtevran[2];
        System.out.println(chzhou);
        System.out.println(padma);
        System.out.println(markus);

        Slizerin[] studentsOfSlizerin = new Slizerin[3];
        studentsOfSlizerin[0] = new Slizerin("Драко Малфой", (byte) 45, (byte) 65, (byte) 64, (byte) 78, (byte) 23, (byte) 41, (byte) 78);
        studentsOfSlizerin[1] = new Slizerin("Грэхэм Монтегю", (byte) 56, (byte) 60, (byte) 90, (byte) 77, (byte) 45, (byte) 78, (byte) 60);
        studentsOfSlizerin[2] = new Slizerin("Грегори Гойл", (byte) 78, (byte) 33, (byte) 80, (byte) 70, (byte) 54, (byte) 77, (byte) 62);
        Slizerin drako = studentsOfSlizerin[0];
        Slizerin grehem = studentsOfSlizerin[1];
        Slizerin gregori = studentsOfSlizerin[2];
        System.out.println(drako);
        System.out.println(grehem);
        System.out.println(gregori);

        Puffenduj[] studentsOfPuffenduj = new Puffenduj[3];
        studentsOfPuffenduj[0] = new Puffenduj("Захария Смит", (byte) 45, (byte) 56, (byte) 78, (byte) 91, (byte) 44);
        studentsOfPuffenduj[1] = new Puffenduj("Седрик Диггори", (byte) 55, (byte) 28, (byte) 55, (byte) 66, (byte) 51);
        studentsOfPuffenduj[2] = new Puffenduj("Джастин Финч-Флетчли", (byte) 61, (byte) 40, (byte) 71, (byte) 65, (byte) 71);
        Puffenduj zahariya = studentsOfPuffenduj[0];
        Puffenduj sedrik = studentsOfPuffenduj[1];
        Puffenduj justin = studentsOfPuffenduj[2];
        System.out.println(zahariya);
        System.out.println(sedrik);
        System.out.println(justin);


        System.out.println("Лучший на факультете:");
        Griffindor.isTheBestInFaculty(garri, ron);
        Kogtevran.isTheBestInFaculty(padma, chzhou);
        Slizerin.isTheBestInFaculty(grehem, gregori);
        Puffenduj.isTheBestInFaculty(zahariya, sedrik);

        System.out.println("Лучший в Хогвартсе:");
        Hogwarts.isTheBestInHogwarts(grehem, ron);
        Hogwarts.isTheBestInHogwarts(padma, germiona);
        Hogwarts.isTheBestInHogwarts(drako, justin);
        Hogwarts.isTheBestInHogwarts(markus, zahariya);
    }
}