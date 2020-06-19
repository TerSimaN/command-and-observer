package command;

public class Trainer {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void sayCommand() {
		this.command.execute();
	}

}
