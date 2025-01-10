package abstractclasses;

public abstract class Group {
    protected String name;
    protected int amount;

    public abstract void hello();

    public final String getName() {
        return name;
    }

    public final int getAmount() {
        return amount;
    }


}

