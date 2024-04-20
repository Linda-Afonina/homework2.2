public class Main {
    public static void main(String[] args) {

        System.out.println("Описание студентов:");
        Griffindor garriPotter = new Griffindor("Гарри Поттер", 90, 45, 
                78, 56, 66);
        Griffindor germionaGreindzher = new Griffindor("Гермиона Грейнджер", 46,
                30, 72, 90, 80);
        Griffindor ronUizli = new Griffindor("Рон Уизли", 16, 50, 60,
                52, 86);
        System.out.println(garriPotter);
        System.out.println(germionaGreindzher);
        System.out.println(ronUizli);

        Kogtevran chzhouChang = new Kogtevran("Чжоу Чанг", 48, 75, 20,
                68, 33, 44);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 67, 90, 23,
                80, 44, 55);
        Kogtevran markusBelbi = new Kogtevran("Маркус Белби", 64, 80, 41,
                85, 11, 56);
        System.out.println(chzhouChang);
        System.out.println(padmaPatil);
        System.out.println(markusBelbi);

        Slizerin drakoMalfoi = new Slizerin("Драко Малфой", 45, 65, 64,
                78, 23, 41, 78);
        Slizerin grehemMontegu = new Slizerin("Грэхэм Монтегю", 56, 60, 90,
                77, 45, 78, 60);
        Slizerin gregoriGoil = new Slizerin("Грегори Гойл", 78, 33, 80,
                70, 54, 77, 62);
        System.out.println(drakoMalfoi);
        System.out.println(grehemMontegu);
        System.out.println(gregoriGoil);

        Puffenduj zahariyaSmit = new Puffenduj("Захария Смит", 45, 56,
                78, 91, 44);
        Puffenduj sedrikDiggori = new Puffenduj("Седрик Диггори", 55, 28,
                55, 66, 51);
        Puffenduj justinFinchFletchli = new Puffenduj("Джастин Финч-Флетчли", 61,
                40, 71, 65, 71);
        System.out.println(zahariyaSmit);
        System.out.println(sedrikDiggori);
        System.out.println(justinFinchFletchli);


        System.out.println("Лучший на факультете:");
//        Griffindor.isTheBestInFaculty(garriPotter, ronUizli);
//        Kogtevran.isTheBestInFaculty(padmaPatil, chzhouChang);
//        Slizerin.isTheBestInFaculty(grehemMontegu, gregoriGoil);
//        Puffenduj.isTheBestInFaculty(zahariyaSmit, sedrikDiggori);
        garriPotter.isTheBestInFaculty(ronUizli);
        padmaPatil.isTheBestInFaculty(chzhouChang);
        grehemMontegu.isTheBestInFaculty(gregoriGoil);
        zahariyaSmit.isTheBestInFaculty(sedrikDiggori);

        System.out.println("Лучший в Хогвартсе:");
//        Hogwarts.isTheBestInHogwarts(grehemMontegu, ronUizli);
//        Hogwarts.isTheBestInHogwarts(padmaPatil, germionaGreindzher);
//        Hogwarts.isTheBestInHogwarts(drakoMalfoi, justinFinchFletchli);
//        Hogwarts.isTheBestInHogwarts(markusBelbi, zahariyaSmit);
        grehemMontegu.isTheBestInHogwarts(ronUizli);
        padmaPatil.isTheBestInHogwarts(germionaGreindzher);
        drakoMalfoi.isTheBestInHogwarts(justinFinchFletchli);
        markusBelbi.isTheBestInHogwarts(zahariyaSmit);
    }
}