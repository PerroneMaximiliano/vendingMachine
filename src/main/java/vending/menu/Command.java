package vending.menu;

public abstract class Command {

    private String title;

    public Command(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void execute();
}
