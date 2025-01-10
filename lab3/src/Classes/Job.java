package Classes;

public class Job {
    private final String description;
    private final String context;
    private final int status;

    // Конструктор, который позволяет передавать описание и контекст работы
    public Job(String description, String context, int status) {
        this.description = "Работа " + (description != null ? description : "");
        this.context = context != null ? context : "";
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    // Метод для получения текстового представления состояния работы
    public void getDescription() {
        System.out.print(description);
        switch (status) {
            case 0:
                System.out.print(" была начата ");
                break;
            case 1:
                System.out.print(" была в процессе ");
                break;
            case 2:
                System.out.print(" была окончена ");
                break;
            default:
                System.out.print("");
        }
        System.out.println(context + ".");
    }

    public String getStringDescription() {
        return description + context + ".";
    }
}