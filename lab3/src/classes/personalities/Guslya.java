package classes.personalities;

import abstractclasses.Human;
import classes.groups.Harpists;

import java.util.Objects;

public class Guslya extends Human {
    public Guslya(String name, String gender, int height, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
    }

    public void organizeOrchestra(Harpists harpists) {
        System.out.println("Так как " + getName() + " отобрал " + harpists.getAmount() + " самых лучших " + harpists.getName() + " и организовал оркестр.");
    }


    @Override
    public void hello() {
        System.out.println("Меня зовут " + name + ", мой пол  - " + gender + ", мой рост " + height + ", мой возраст " + age + ".");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Guslya guslya = (Guslya) obj;
        return getHeight() == guslya.getHeight() &&
                getAge() == guslya.getAge() &&
                getName().equals(guslya.getName()) &&
                getGender().equals(guslya.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeight(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Guslya{" +
                "name='" + getName() + "'" +
                ", height=" + getHeight() +
                ", weight=" + getAge() +
                ", gender='" + getGender() + "'" +
                '}';
    }
}

