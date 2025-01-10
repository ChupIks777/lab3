package classes.personalities;

import abstractclasses.Human;

import java.util.Objects;

public class Molchun extends Human {
    public Molchun(String name, String gender, int height, int age) {
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
        Molchun molchun = (Molchun) obj;
        return getHeight() == molchun.getHeight() &&
                getAge() == molchun.getAge() &&
                getName().equals(molchun.getName()) &&
                getGender().equals(molchun.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeight(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Molchun{" +
                "name='" + getName() + "'" +
                ", height=" + getHeight() +
                ", weight=" + getAge() +
                ", gender='" + getGender() + "'" +
                '}';
    }
}

