public class Team {
    String name;
    Competitor[] competitors = new Competitor[4];

    public Team(String name) {
        this.name = name;
        competitors[0] = new Human("Боб");
        competitors[1] = new Cat("Барсик");
        competitors[2] = new Dog("Бобик");
        competitors[3] = new Human("Алекс");
    }

    public void infoAboutPassedTheTest() {
        for (Competitor c: competitors) {
            if (c.isOnDistance()) {
                c.info();
            }
        }
    }

    public void infoAboutTeam() {
        for (Competitor c: competitors) {
            c.info();
        }
    }
}
