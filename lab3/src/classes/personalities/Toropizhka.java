package classes.personalities;

import abstractclasses.Human;

import java.util.Objects;

public class Toropizhka extends Human {
    public Toropizhka(String name, String gender, int height, int age) {
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
        Toropizhka toropizhka = (Toropizhka) obj;
        return getHeight() == toropizhka.getHeight() &&
                getAge() == toropizhka.getAge() &&
                getName().equals(toropizhka.getName()) &&
                getGender().equals(toropizhka.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeight(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Toropizhka{" +
                "name='" + getName() + "'" +
                ", height=" + getHeight() +
                ", weight=" + getAge() +
                ", gender='" + getGender() + "'" +
                '}';
    }
}


