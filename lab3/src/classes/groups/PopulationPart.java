package classes.groups;

import abstractclasses.Group;
import classes.Job;
import classes.structures.DanceFloor;
import enums.FoodType;
import enums.Fruits;
import interfaces.Buildable;

import java.util.Objects;

public class PopulationPart extends Group {
    private final String name;
    private final Fruits[] fruitList = Fruits.values();
    private final FoodType[] foodList = FoodType.values();

    public PopulationPart(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void hello() {
        System.out.println("Мы - " + getName() + " нас " + getAmount() + " человек.");
    }

    public void clearArea(DanceFloor danceFloor) {
        System.out.println(name + " расчищали " + danceFloor.description() + " " + danceFloor.name() + ".");
    }

    public void build(Buildable object, String descriprion) {
        if (Objects.equals(descriprion, "для еды")) {
            System.out.print(name + " строили" + object.getDescription() + " " + object.getName() + " для ");
            for (FoodType food : foodList) {
                if (food == foodList[foodList.length - 1]) {
                    System.out.println(food.getName() + ".");
                } else {
                    System.out.print(food.getName() + ", ");
                }

            }

        } else {
            System.out.println(name + " строили " + descriprion + " " + object.getDescription() + " " + object.getName() + ".");
        }
    }

    public void startWorking(Job job) {
        System.out.println(name + " принялись за " + job.getStringDescription());
    }

    public void giveFruits(SnakeKids snakeKids) {
        System.out.print(name + " решили подарить " + snakeKids.getName() + " ");
        for (Fruits fruit : fruitList) {
            if (fruit == fruitList[fruitList.length - 1]) {
                System.out.println(fruit.getName() + ".");
            } else {
                System.out.print(fruit.getName() + ", ");
            }

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
        PopulationPart populationPart = (PopulationPart) obj;
        return getName().equals(populationPart.getName()) &&
                getAmount() == populationPart.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAmount());
    }

    @Override
    public String toString() {
        return "PopulationPart{" +
                "name='" + getName() + "'" +
                ", amount=" + getAmount() +
                '}';
    }
}

