public class Main {
    public static void main(String[] args) {

        Griffindor[] students = new Griffindor[3];
        students[0] = new Griffindor("Гарри Поттер", (byte) 90, (byte) 45, (byte) 78, (byte) 56, (byte) 66);
        students[1] = new Griffindor("Гермиона Грейнджер", (byte) 46, (byte) 30, (byte) 72, (byte) 90, (byte) 80);
        students[2] = new Griffindor("Рон Уизли", (byte) 16, (byte) 50, (byte) 60, (byte) 52, (byte) 86);
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        Griffindor.isTheBestInFaculty(students[0], students[2]);
        Hogwarts.isTheBestInHogwarts(students[2], students[1]);

    }
}