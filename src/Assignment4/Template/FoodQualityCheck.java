package Assignment4.TemplateMethod;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking food expiration date and composition...");
    }
}
