package Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for malicious content...");
        // Simulate a check for forbidden words in the text
        if (textFile.getContent().contains("forbidden")) {
            System.out.println("Alert: Forbidden words found in the text file!");
        } else {
            System.out.println("Text file is clean.");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code...");
        // Simulate a check for malware in the executable code
        if (executableFile.getBinaryCode().contains("malware")) {
            System.out.println("Alert: Malware found in the executable file!");
        } else {
            System.out.println("Executable file is clean.");
        }
    }
}
