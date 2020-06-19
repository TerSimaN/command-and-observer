package observer;

public interface Observable {
	public void startWatching(Observer observer);
	public void stopWatching(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
