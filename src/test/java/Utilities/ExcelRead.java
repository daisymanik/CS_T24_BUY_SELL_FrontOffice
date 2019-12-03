package Utilities;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelRead {
	public static void main(String[] args) throws Throwable {
		readexcel();
	}

	
	public static Recordset readexcel() throws Throwable {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("./src/main/resources/TestData/Testdata1.xlsx");
		String query = "Select * from Sheet1";
		Recordset recordset = connection.executeQuery(query);

		while (recordset.next()) {
			recordset.getField("Username");
			recordset.getField("Password");
			recordset.getField("orderdate");
			recordset.getField("securityno");
			recordset.getField("ordertype");
			recordset.getField("transactioncode");
			recordset.getField("custnumber");
			recordset.getField("nonominal");
			recordset.getField("depository");
			recordset.getField("dealstatus");
			recordset.getField("brokerno1");
			recordset.getField("brokertype1");
			recordset.getField("price1");
			recordset.getField("deliveryinstr");
			recordset.getField("Username1");
			recordset.getField("Password1");
			
		}
		
		return recordset;

	}
	
}
