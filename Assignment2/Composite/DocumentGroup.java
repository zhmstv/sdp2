package Assignment2.Composite;

import Assignment2.Document;
import java.util.ArrayList;
import java.util.List;

public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void removeDocument(Document document) {
        documents.remove(document);
    }

    @Override
    public void display() {
        if (documents.isEmpty()) {
            System.out.println("No documents in the group.");
        } else {
            for (Document doc : documents) {
                doc.display();
            }
        }
    }
}


