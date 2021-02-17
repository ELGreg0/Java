public class Track implements Hindrance {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public String check(Competitor competitor) {
        competitor.run();
        competitor.setSuccess(competitor.getMaxLength() >= length);
        if (competitor.getSuccess()==true) {
            return "Игрок " + competitor.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {
            return "Игрок " + competitor.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
