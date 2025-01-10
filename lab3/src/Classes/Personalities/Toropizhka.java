package Classes.Personalities;

import AbstractClasses.Human;

import java.util.Objects;

public class Toropizhka extends Human{
    private String structure;
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

    public String build(String structure) {
        this.structure = structure;
        return "строить " + structure;
    }
    public String getStructure(){
        return structure;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Сравниваем ссылки: если это один и тот же объект, возвращаем true
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false; // Если другой объект null или классы не совпадают, возвращаем false
        }
        Toropizhka toropizhka = (Toropizhka) obj; // Приводим объект к классу Stoleman
        return  getHeight() == toropizhka.getHeight() &&
                getAge() == toropizhka.getAge() &&
                getName().equals(toropizhka.getName()) &&
                getGender().equals(toropizhka.getGender());
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код на основе всех полей
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


