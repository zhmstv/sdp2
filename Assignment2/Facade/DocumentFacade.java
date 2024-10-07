package Assignment2.Facade;

import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Bridge.RenderEngine;

public class DocumentFacade {

    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        if (document != null) {
            document.display();
        } else {
            System.out.println("Document not found.");
        }
    }

    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        if (document != null) {
            Document watermarkedDocument = new WatermarkDecorator(document); 
            watermarkedDocument.display();
        } else {
            System.out.println("Document not found.");
        }
    }

    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        if (document != null) {
            DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
            renderer.render(getDocumentContent(title));
        } else {
            System.out.println("Document not found.");
        }
    }

    // Метод для имитации получения содержимого документа
    private String getDocumentContent(String title) {
        // Для примера, просто возвращаем заголовок как контент
        return "Content of document: " + title;
    }
}




