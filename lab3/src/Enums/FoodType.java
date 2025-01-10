package Enums;

public enum FoodType {
    SPARKLINGWATER ("Газированная вода"),
    ICECREAM ("Мороженое"),
    OTHERS ("Прочие сласти");

    private final String name;

    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}