package classes.groups;

import abstractclasses.Human;
import classes.structures.Alcove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Builders {
    private final ArrayList<Human> workers;

    public Builders(ArrayList<Human> workers) {
        this.workers = workers;
    }

    public void build(Alcove alcove, String[] parts, String context) {
        Set<String> requiredParts = new HashSet<>();
        requiredParts.add("пол");
        requiredParts.add("стены");
        requiredParts.add("потолок");

        Set<String> providedParts = new HashSet<>();
        for (int i = 0; i < workers.toArray().length; i++) {
            System.out.println(workers.get(i).getName() + " строит " + parts[i] + ".");
            providedParts.add(parts[i]);
        }

        // Проверяем, содержатся ли все необходимые элементы в предоставленных частях
        if (providedParts.containsAll(requiredParts)) {
            System.out.println(alcove.getName() + " " + alcove.getDescription() + " " + context + " была успешно построена!");
        } else {
            System.out.println("Не хватает частей для постройки беседки!");
        }
    }

    public void armWithWeapon(String weapon) {
        System.out.print("Каждому из работников ");

        for (int i = 0; i < workers.toArray().length; i++) {
            if (i == workers.toArray().length - 1) {
                System.out.print(workers.get(i).getName() + " ");
            }
            System.out.print(workers.get(i).getName() + ", ");
        }
        System.out.println("выдано по " + weapon + ".");
    }

}

