package command;

public class LieDownCommand implements Command {
	
	private Exercises exercises;
	
	public LieDownCommand(Exercises exercises) {
		this.exercises = exercises;
	}

	@Override
	public void execute() {
		this.exercises.lieDown();
	}

	@Override
	public String getType() {
		return this.exercises.getExerciseType();
	}

}
