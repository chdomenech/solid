package solid;

public class Ejecuta {

	public static void main(String[] args) {
		
		 String data = "Este es el contenido del reporte.";

        // Generar un reporte en PDF
        ReportGenerator pdfGenerator = new PDFReportGenerator();
        ReportService pdfReportService = new ReportService(pdfGenerator);
        pdfReportService.generate(data);

        // Generar un reporte en Excel
        ReportGenerator excelGenerator = new ExcelReportGenerator();
        ReportService excelReportService = new ReportService(excelGenerator);
        excelReportService.generate(data);

	}

}
