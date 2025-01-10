package classes.personalities;

import abstractclasses.Human;

import java.util.Objects;

public class Gvozdik extends Human {
    public Gvozdik(String name, String gender, int height, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
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
        Gvozdik gvozdik = (Gvozdik) obj;
        return getHeight() == gvozdik.getHeight() &&
                getAge() == gvozdik.getAge() &&
                getName().equals(gvozdik.getName()) &&
                getGender().equals(gvozdik.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeight(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Gvozdik{" +
                "name='" + getName() + "'" +
                ", height=" + getHeight() +
                ", weight=" + getAge() +
                ", gender='" + getGender() + "'" +
                '}';
    }
}

