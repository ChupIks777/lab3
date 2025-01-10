package classes.structures;

public record Cellars(int fillLevel) {

    public void getDescription() {
        if (fillLevel == 0) {
            System.out.println("Подвалы были пусты.");
            return;
        }

        if (fillLevel < 50) {
            System.out.println("Подвалы были заполнены менее чем наполовину.");
            return;
        }

        if (fillLevel < 100) {
            System.out.println("Подвалы были заполнены более чем наполовину.");
            return;
        }

        if (fillLevel == 100) {
            System.out.println("Подвалы были заполнены доверху.");
        }

    }
}

