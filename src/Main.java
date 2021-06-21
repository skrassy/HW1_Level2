public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("Спартак");
        course.doIt(team);
        System.out.println("Полосу препятствий прошли: ");
        team.infoAboutPassedTheTest();
        System.out.println("Информация о команде: ");
        team.infoAboutTeam();
    }
}