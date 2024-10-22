package Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Science".equals(newsCategory)) {
            System.out.println("Laptop received news in Science: " + news);
        }
    }
}

