public interface Competitor {
    String getName();
    int getMaxLength();
    int getMaxHeight();
    boolean getSuccess();
    void setSuccess(boolean success);
    String run();
    String jump();
}
