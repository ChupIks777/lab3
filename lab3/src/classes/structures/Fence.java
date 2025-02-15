package classes.structures;

import interfaces.Buildable;

public record Fence(String name, String description) implements Buildable {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
