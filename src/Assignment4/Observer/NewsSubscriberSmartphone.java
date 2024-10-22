package Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Sports".equals(newsCategory)) {
            System.out.println("Smartphone received news in Sports: " + news);
        }
    }
}

