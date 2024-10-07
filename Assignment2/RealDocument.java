package Assignment2;

public class RealDocument implements Document {
    private String title;
    private boolean isLoaded;

    public RealDocument(String title) {
        this.title = title;
        this.isLoaded = false;
    }

    private void loadFromDisk() {
        if (!isLoaded) {
            System.out.println("Loading document from disk: " + title);
            isLoaded = true;
        }
    }

    @Override
    public void display() {
        loadFromDisk(); // Загружаем документ перед отображением
        System.out.println("Displaying document: " + title);
    }
}



