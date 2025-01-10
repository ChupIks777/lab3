package Classes.Structures;

import Interfaces.Buildable;

public record Tents(String name, String description) implements Buildable {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
