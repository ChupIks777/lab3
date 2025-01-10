package classes.structures;

import enums.Fruits;

public record Trees() {
    public void display() {
        Fruits[] fruitList = Fruits.values();
        if (fruitList.length == 0) {
            System.out.println("На деревьях ничего не осталось");
            return;
        }
        System.out.print("А на деревьях остались висеть: ");
        for (Fruits fruit : fruitList) {
            if (fruit == fruitList[fruitList.length - 1]) {
                System.out.println(fruit.getName() + ".");
                continue;
            }
            System.out.print(fruit.getName() + ", ");
        }

    }
}

