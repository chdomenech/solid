package solid;

public class PDFReportGenerator implements ReportGenerator {

	@Override
	public void generateReport(String data) {
		System.out.println("Generando reporte en formato PDF con los datos: " + data);     
		
	}

}
