package Classes.Structures;

import Interfaces.Buildable;

public record Alcove(String name, String description) implements Buildable {
    @Override
    public String getName() {
        return "Ограда";
    }
    @Override
    public String getDescription() {
        return "красивая";
    }
}
