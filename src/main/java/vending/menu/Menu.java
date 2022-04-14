package vending.menu;

import vending.utils.Console;
import vending.utils.LimitedIntDialog;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    protected List<Command> commandList;

    public Menu() {
        commandList = new ArrayList<>();
    }

    public void execute() {
        this.write();
        int option = this.getOption();
        commandList.get(option).execute();
    }

    protected void write() {
        Console.instance().writeln();
        Console.instance().writeln("---------------------");
        for (int i = 0; i < commandList.size(); i++) {
            Console.instance().writeln((i + 1) + ". " + commandList.get(i).getTitle());
        }
    }

    private int getOption() {
        return LimitedIntDialog.instance().read("Option", 1, commandList.size())-1;
    }
}
