import AbstractClasses.*;
import Classes.Exceptions.*;
import Classes.Groups.*;
import Classes.*;
import Classes.Personalities.*;
import Classes.Structures.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try{
            // Первое предложение Работа по уборке фруктов была окончена.
            Job fruitJob = new Job("по уборке фруктов", "", 2);
            if (fruitJob.getStatus() < 0){
                throw new NegativeNumberException();
            }
            fruitJob.getDescription();

            //Второе предложение Все подвалы были наполнены доверху, а на деревьях осталось еще много яблок, груш и слив.
            Cellars cellars = new Cellars(100);
            if (cellars.fillLevel() < 0){
                throw new NegativeNumberException();
            }
            cellars.getDescription();

            Trees trees = new Trees();
            trees.display();

            //Третье предложение Решено было подарить их змеевским малышам.
            PopulationPart somePeople = new PopulationPart("Некоторые люди", 50);
            SnakeKids snakeKids = new SnakeKids("Змеевские малыши", 5);
            if (somePeople.getAmount() < 0 || snakeKids.getAmount() < 0){
                throw new NegativeNumberException();
            }

            somePeople.giveFruits(snakeKids);

            //Четвертое предложение Все принялись за работу по подготовке к балу.
            PopulationPart allPeople = new PopulationPart("Все жители", 100);
            Job ball = new Job("", "по подготовке к балу", 0);
            if (allPeople.getAmount() < 0 || ball.getStatus() < 0){
                throw new NegativeNumberException();
            }
            allPeople.startWorking(ball);

            //Пятое предложение Часть населения расчищала заросшую травой круглую танцевальную площадку, другая часть устраивала вокруг площадки красивую ограду.
            PopulationPart firstPopulationPart = new PopulationPart("Первая часть населения", 33);
            DanceFloor danceFloor = new DanceFloor("Танцевальная площадка", "круглая, заросшая травой");
            if (firstPopulationPart.getAmount() < 0){
                throw new NegativeNumberException();
            }
            firstPopulationPart.clearArea(danceFloor);

            PopulationPart secondPopulationPart = new PopulationPart("Вторая часть населения", 33);
            if (secondPopulationPart.getAmount() < 0){
                throw new NegativeNumberException();
            }
            Fence fence = new Fence("ограда", "красивая");
            secondPopulationPart.build(fence, "вокруг площадки");

            //Шестое предложение Торопыжка, Молчун и Гвоздик, вооружившись топорами, принялись сооружать рядом с площадкой двухэтажную беседку для оркестра.
            Toropizhka toropizhka = new Toropizhka("Торопыжка", "мужской", 127, 13);
            Molchun molchun = new Molchun("Молчун", "мужской", 125, 14);
            Gvozdik gvozdik = new Gvozdik("Гвоздик", "мужской", 119, 12);
            if (toropizhka.getAge() < 0 || toropizhka.getHeight() < 0 ||
            molchun.getAge() < 0 || molchun.getHeight() < 0 ||
            gvozdik.getAge() < 0 || gvozdik.getHeight() < 0){
                throw new NegativeNumberException();
            }

            ArrayList<Human> people = new ArrayList<>();
            people.add(toropizhka);
            people.add(molchun);
            people.add(gvozdik);
            Builders builders = new Builders(people);
            builders.armWithWeapon("топор");
            Alcove alcove = new Alcove("Палатка", "двухэтажная для орекстра");
            try {
                builders.build(alcove, new String[]{"пол", "потолок", "стены"}, "рядом с площадкой");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Некоторые работники бездельничают!");
            }

            //Седьмое предложение Другие малыши строили палатки для газированной воды, мороженого и прочих сластей.
            PopulationPart otherKids = new PopulationPart("Другие малыши", 70);
            if (otherKids.getAmount() < 0){
                throw new NegativeNumberException();
            }
            Tents tents = new Tents("Палатки", "");
            otherKids.build(tents, "для еды");

            //Восьмое предложение Вся эта работа велась под музыку, так как Гусля отобрал десять самых лучших арфисток и организовал оркестр.
            Job allJob = new Job("вся", "под музыку", 1);
            if (allJob.getStatus() < 0){
                throw new NegativeNumberException();
            }
            allJob.getDescription();
            Harpists harpists = new Harpists("Арфистки", 10);
            Guslya guslya = new Guslya("Гусля", "мужской", 142, 15);
            if (harpists.getAmount() < 0 || guslya.getAge() < 0 || guslya.getHeight() < 0){
                throw new NegativeNumberException();
            }
            guslya.organizeOrchestra(harpists);

            //Девятое предложение Они тут же принялись делать репетиции.
            harpists.rehearse(1);
            if (harpists.getAmount() < 0){
                throw new NegativeNumberException();
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}
