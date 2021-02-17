public class Human implements Competitor {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }
    public String run() {
        return name + " может пробежать: " + maxLength + " км";
    }
    public String jump() {
        return name + " может прыгнуть: " + maxHeight + " м";
    }

    public String getName() {
        return name;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}