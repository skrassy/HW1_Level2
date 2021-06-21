public class Course {

    Obstacle[] obstacles = {
            new Cross(80),
            new Wall(2),
            new Water(15),
            new Cross(120)};

    public void doIt(Team team) {
        for (Competitor c : team.competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
