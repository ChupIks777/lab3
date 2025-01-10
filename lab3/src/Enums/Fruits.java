package Enums;

public enum Fruits {
    APPLE("Яблоки"),
    PEAR("Груши"),
    PLUM("Сливы");

    private final String name;

    Fruits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
