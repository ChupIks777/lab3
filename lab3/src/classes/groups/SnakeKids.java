package classes.groups;

import abstractclasses.Group;

import java.util.Objects;

public class SnakeKids extends Group {
    public SnakeKids(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void hello() {
        System.out.println("Мы - " + getName() + " нас " + getAmount() + " человек.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        SnakeKids snakeKids = (SnakeKids) obj;
        return getName().equals(snakeKids.getName()) &&
                getAmount() == snakeKids.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAmount());
    }

    @Override
    public String toString() {
        return "SnakeKids{" +
                "name='" + getName() + "'" +
                ", amount=" + getAmount() +
                '}';
    }
}
