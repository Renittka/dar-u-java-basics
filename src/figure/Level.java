package figure;

public enum Level {
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High");

    private final String title;

    Level(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
