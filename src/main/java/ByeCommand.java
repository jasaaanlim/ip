public class ByeCommand extends Command {
    public ByeCommand(String command) {
        super(command);
    }

    public void execute(TaskList tasks, Storage storage, Ui ui) {
        ui.printMessage("Bye! I shall go rest now. PAge me when you need me!");
    }

    public boolean isExit() {
        return true;
    }
}
