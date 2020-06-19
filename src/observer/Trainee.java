package observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String commandType;
	
	public void setCommandType(String commandType) {
		this.commandType = commandType;
		this.notifyObservers();
	}

	@Override
	public void startWatching(Observer observer) {
		observers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void stopWatching(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.commandType;
	}

}
