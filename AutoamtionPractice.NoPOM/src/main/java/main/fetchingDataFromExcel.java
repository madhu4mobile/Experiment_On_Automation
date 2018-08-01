package main;
import Util.Xls_Reader;

public class fetchingDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Madhu X1_Tab\\git\\AutomationPractice\\"
				+ "AutoamtionPractice.NoPOM\\src\\test\\java\\TestData\\TestData.xlsx");
		
		String sheetName = "login";
		
//		int rowCount = reader.getRowCount(sheetName);
//		
//		System.out.println(rowCount);
//		
//		int columnCount = reader.getColumnCount(sheetName);
//		
//		System.out.println(columnCount);
		
		System.out.println(sheetName);

	}

}
