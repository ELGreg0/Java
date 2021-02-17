public class Wall implements Hindrance {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(Competitor competitor) {
        competitor.jump();
        competitor.setSuccess(competitor.getMaxHeight() >= height);
        if (competitor.getSuccess()==true) {
            return "Игрок " + competitor.getName() + " перепрыгнул стену с высотой: " + height + " км";
        } else {
            return "Игрок " + competitor.getName() + " не смог перепрыгнуть стену с высотой: " + height + " км";
        }
    }
}