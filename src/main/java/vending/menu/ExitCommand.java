package vending.menu;

public class ExitCommand extends Command {
    private boolean closed;

    public ExitCommand() {
        super("Exit");
        this.reset();
    }

    @Override
    public void execute() {
        closed = true;
    }

    public boolean closed() {
        return closed;
    }

    public void reset() {
        closed = false;
    }
}
