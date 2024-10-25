package solid;

public class ReportService {
	
	 private ReportGenerator reportGenerator;
	 
	    public ReportService(ReportGenerator reportGenerator) {
	        this.reportGenerator = reportGenerator;
	    }	    

	    public void generate(String data) {
	        // Liskov Substitution Principle (LSP)
	        // Podemos usar cualquier tipo de ReportGenerator sin afectar el funcionamiento.
	        reportGenerator.generateReport(data);
	    }

}
