package Assignment4.Observer;

public interface NewsPublisher {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String category, String news);
}


