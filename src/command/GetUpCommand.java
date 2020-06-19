package command;

public class GetUpCommand implements Command {
	
	private Exercises exercises;
	
	public GetUpCommand(Exercises exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		this.exercises.getUp();
	}

	@Override
	public String getType() {
		return this.exercises.getExerciseType();
	}

}
