package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String category, String news) {
        for (Observer observer : observers) {
            observer.update(category, news);
        }
    }

    public void publishNews(String category, String news) {
        notifyObservers(category, news);
    }
}

