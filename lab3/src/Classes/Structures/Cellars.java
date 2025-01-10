package Classes.Structures;

public record Cellars(int fillLevel) {

    public void getDescription() {
        if (fillLevel == 0) {
            System.out.println("Подвалы были пусты.");
        } else if (fillLevel < 50) {
            System.out.println("Подвалы были заполнены менее чем наполовину.");
        } else if (fillLevel < 100) {
            System.out.println("Подвалы были заполнены более чем наполовину.");
        } else if (fillLevel == 100) {
            System.out.println("Подвалы были заполнены доверху.");
        }
    }
}

