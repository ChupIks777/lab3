package AbstractClasses;

public abstract class Human {
    protected String name;
    protected String gender;
    protected int height;
    protected int age;
    public abstract void hello();

    public final String getName(){
        return name;
    }
    public final String getGender(){
        return gender;
    }
    public final int getHeight(){
        return height;
    }
    public final int getAge(){
        return age;
    }


}

