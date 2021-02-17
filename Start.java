public class Start{

    static void Positive() {
        Competitor cat1 = new Cat("Барсик", 5, 7);
        Competitor cat2 = new Cat("Мурка", 10, 11);

        Competitor human1 = new Human("Женя", 25, 10);
        Competitor human2 = new Human("Вася", 31, 9);

        Competitor robot1 = new Robot("Коннор", 15, 15);
        Competitor robot2 = new Robot("Бадди", 21, 7);

        Competitor[] competitors = {cat1, cat2, human1, human2, robot1, robot2};


        Hindrance wall1 = new Wall(10);
        Hindrance wall2 = new Wall(12);

        Hindrance track1 = new Track(11);
        Hindrance track2 = new Track(17);

        Hindrance[] hindrances = {wall1, wall2, track1, track2};

        for (int i = 0; i < hindrances.length; i++) {

            for (Competitor competitor : competitors) {
                if (competitor.getSuccess()) {
                    System.out.println(hindrances[i].check(competitor));
                }


            }
        }
    }

    static void Negative() {
        Competitor cat1 = new Cat("Барсик", 5, 7);
        Competitor cat2 = new Cat("Мурка", 10, 11);

        Competitor human1 = new Human("Женя", 25, 10);
        Competitor human2 = new Human("Вася", 31, 9);

        Competitor robot1 = new Robot("Коннор", 15, 15);
        Competitor robot2 = new Robot("Бадди", 21, 7);

        Competitor[] competitors = {cat1, cat2, human1, human2, robot1, robot2};


        Hindrance wall1 = new Wall(16);
        Hindrance wall2 = new Wall(20);

        Hindrance track1 = new Track(11);
        Hindrance track2 = new Track(17);

        Hindrance[] hindrances = {wall1, wall2, track1, track2};


        for (int i = 0; i < hindrances.length; i++) {
            for (Competitor competitor : competitors) {
                if (!competitor.getSuccess()) {
                    System.out.println(hindrances[i].check(competitor));
                }
            }
        }

    }
}