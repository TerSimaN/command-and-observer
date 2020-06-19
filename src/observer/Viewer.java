package observer;

public class Viewer implements Observer {
	
	private String name;
	private Observable trainee;
	
	public Viewer(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if (trainee == null) {
			System.out.println("No trainee");
			return;
		}
		
		String commandType = trainee.getUpdate();
		System.out.println(this.getName() + " updated with: " + "Command is: " + commandType);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
