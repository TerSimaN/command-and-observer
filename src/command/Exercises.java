package command;

public class Exercises {
	
	public String exerciseType = "none";
	
	public void getUp() {
		System.out.println("Get up!");
		exerciseType = "Get up!";
	}
	
	public void lieDown() {
		System.out.println("Lie down!");
		exerciseType = "Lie down!";
	}
	
	public String getExerciseType() {
		return this.exerciseType;
	}

}
