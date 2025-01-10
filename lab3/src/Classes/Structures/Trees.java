package Classes.Structures;
import Enums.Fruits;

public record Trees() {
    public void display(){
        Fruits[] fruitList = Fruits.values();
        if (fruitList.length == 0) {
            System.out.println("На деревьях ничего не осталось");
        } else {
            System.out.print("А на деревьях остались висеть: ");
            for (Fruits fruit : fruitList) {
                if (fruit == fruitList[fruitList.length - 1]) {
                    System.out.println(fruit.getName() + ".");
                } else {
                    System.out.print(fruit.getName() + ", ");
                }

            }
        }

    }
}

