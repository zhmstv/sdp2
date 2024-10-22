package Assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        System.out.println("Tablet received news in category " + newsCategory + ": " + news);
    }
}

