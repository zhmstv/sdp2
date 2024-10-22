package Assignment4.TemplateMethod;

public abstract class QualityCheck {
    // Assignment4.Template method defining the steps for checking quality
    public final void checkProduct() {
        checkAppearance();
        checkSpecificCharacteristics();
        generateReport();
    }

    // Step 1: Check appearance (common for all products)
    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    // Step 2: Check specific characteristics (to be implemented by subclasses)
    protected abstract void checkSpecificCharacteristics();

    // Step 3: Generate report (common for all products)
    private void generateReport() {
        System.out.println("Generating quality check report...");
    }
}
