package classes.groups;

import abstractclasses.Group;

import java.util.Objects;

public class Harpists extends Group {
    public Harpists(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void hello() {
        System.out.println("Мы - " + getName() + " нас " + getAmount() + " человек.");
    }

    public void rehearse(int status) {
        switch (status) {
            case 0:
                System.out.println(getName() + " отдыхают.");
                break;
            case 1:
                System.out.println(getName() + " начали репетировать.");
                break;
            case 2:
                System.out.println(getName() + " репетируют.");
                break;
            case 3:
                System.out.println(getName() + " отрепетировали.");
                break;
            default:
                System.out.println(getName() + " занимаются своими делами.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Harpists harpists = (Harpists) obj;
        return getName().equals(harpists.getName()) &&
                getAmount() == harpists.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAmount());
    }

    @Override
    public String toString() {
        return "Harpists{" +
                "name='" + getName() + "'" +
                ", amount=" + getAmount() +
                '}';
    }
}
