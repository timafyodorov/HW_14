public class Main {
    public static void main(String[] args) {
        Gryffindor Garry = new Gryffindor("Гарри", "Поттер", 100, 100, 80);
        System.out.println(Garry);
        Gryffindor Hermeona = new Gryffindor("Гермиона", "Грейнджер", 90, 100, 85);
        Hermeona.anyComparison(Garry);
        Hermeona.studentComparison(Garry);
    }
}