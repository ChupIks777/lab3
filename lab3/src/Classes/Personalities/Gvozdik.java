package Classes.Personalities;

import AbstractClasses.Human;
import Interfaces.Buildable;

import java.util.Objects;

public class Gvozdik extends Human {
    private String structure;
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

    public String build(String structure) {
        this.structure = structure;
        return "строить " + structure;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Сравниваем ссылки: если это один и тот же объект, возвращаем true
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false; // Если другой объект null или классы не совпадают, возвращаем false
        }
        Gvozdik gvozdik = (Gvozdik) obj; // Приводим объект к классу Stoleman
        return  getHeight() == gvozdik.getHeight() &&
                getAge() == gvozdik.getAge() &&
                getName().equals(gvozdik.getName()) &&
                getGender().equals(gvozdik.getGender());
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код на основе всех полей
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

