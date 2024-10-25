package solid;

public class ExcelReportGenerator implements ReportGenerator{

	@Override
	public void generateReport(String data) {
		System.out.println("Generando reporte en formato Excel con los datos: " + data);
		
	}

}
