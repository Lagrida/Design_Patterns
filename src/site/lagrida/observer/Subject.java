package site.lagrida.observer;

public interface Subject {
	void subscribe(Observer observer);
	void remove(Observer observer);
	void notifyAllObservers();
}
