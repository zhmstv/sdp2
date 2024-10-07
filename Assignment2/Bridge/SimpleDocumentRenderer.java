package Assignment2.Bridge;

// Реализация рендеринга документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    // Реализация рендеринга через движок
    @Override
    public void render(String content) {
        // Вызываем метод рендеринга движка
        engine.render(content);
    }
}


