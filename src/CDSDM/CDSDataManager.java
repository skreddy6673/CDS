package CDSDM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import CDSBusiness.Compnay;
import CDSBusiness.Customer;
import CDSBusiness.DeliveryPerson;
import CDSBusiness.Employee;
import CDSBusiness.Ticket;

public class CDSDataManager {
	public void setEmployeeData(Employee emp){
		if(new File("src/CDSEmployeeList.xls").exists()){
				WritableWorkbook existingWorkbook;
				try {
					Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
					existingWorkbook = Workbook.createWorkbook(new File("src/CDSEmployeeList.xls"),wb);
					WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
					WritableCell cell;
					int rw = sheetToEdit.getRows();
					Label l = new Label(0, rw,emp.getEname());
					cell = (WritableCell) l;
					sheetToEdit.addCell(cell);
					Label l1 = new Label(1, rw,emp.getPhone());
					cell = (WritableCell) l1;
					sheetToEdit.addCell(cell);
					Label l2 = new Label(2, rw,emp.getEmail());
					cell = (WritableCell) l2;
					sheetToEdit.addCell(cell);
					Label l3 = new Label(3, rw,emp.getEmpType());
					cell = (WritableCell) l3;
					sheetToEdit.addCell(cell);
					Label l4 = new Label(4, rw,emp.getPassword());
					cell = (WritableCell) l4;
					sheetToEdit.addCell(cell);
					existingWorkbook.write();
					wb.close();
					existingWorkbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				} catch (BiffException e) {
					e.printStackTrace();
				}
		}else{
			WritableWorkbook workbookCopy;
			try {
				workbookCopy = Workbook.createWorkbook(new File("src/CDSEmployeeList.xls"));
				WritableSheet sheetToEdit = workbookCopy.createSheet("Sheet", 0);
				WritableCell cell;
				Label l = new Label(0, 0,"Name");
				cell = (WritableCell) l;
				sheetToEdit.addCell(cell);
				Label l1 = new Label(1, 0,"Contact Number");
				cell = (WritableCell) l1;
				sheetToEdit.addCell(cell);
				Label l2 = new Label(2, 0,"Email ID");
				cell = (WritableCell) l2;
				sheetToEdit.addCell(cell);
				Label l3 = new Label(3, 0,"Type");
				cell = (WritableCell) l3;
				sheetToEdit.addCell(cell);
				Label l4 = new Label(4, 0,"Password");
				cell = (WritableCell) l4;
				sheetToEdit.addCell(cell);
				Label l5 = new Label(0, 1,emp.getEname());
				cell = (WritableCell) l5;
				sheetToEdit.addCell(cell);
				Label l6 = new Label(1, 1,emp.getPhone());
				cell = (WritableCell) l6;
				sheetToEdit.addCell(cell);
				Label l7 = new Label(2, 1,emp.getEmail());
				cell = (WritableCell) l7;
				sheetToEdit.addCell(cell);
				Label l8 = new Label(3, 1,emp.getEmpType());
				cell = (WritableCell) l8;
				sheetToEdit.addCell(cell);
				Label l9 = new Label(4, 1,emp.getPassword());
				cell = (WritableCell) l9;
				sheetToEdit.addCell(cell);
				workbookCopy.write();
				workbookCopy.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			}
		}
	}
	//read the data from employee list
	public HashMap<String,ArrayList<String>> getEmployeeData(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		int count=0;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			for(int c=0;c<sheetToEdit.getColumns();c++){
				ArrayList<String> rdt = new ArrayList<String>();
				for(int r=1;r<sheetToEdit.getRows();r++){	
					rdt.add(sheetToEdit.getCell(c, r).getContents());
				}
				data.put(sheetToEdit.getCell(count, 0).getContents(), rdt);
				count++;
			}
			wb.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public void setCompanyData(Compnay cmp){
		if(new File("src/CDSCompanyList.xls").exists()){
			WritableWorkbook existingWorkbook;
			try {
				Workbook wb = Workbook.getWorkbook(new File("src/CDSCompanyList.xls"));
				existingWorkbook = Workbook.createWorkbook(new File("src/CDSCompanyList.xls"),wb);
				WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				WritableCell cell;
				Label l = new Label(0, 1,cmp.getName());
				cell = (WritableCell) l;
				sheetToEdit.addCell(cell);
				Label l1 = new Label(1, 1,cmp.getContactnumber());
				cell = (WritableCell) l1;
				sheetToEdit.addCell(cell);
				Label l2 = new Label(2, 1,cmp.getCompanyhrs());
				cell = (WritableCell) l2;
				sheetToEdit.addCell(cell);
				Label l3 = new Label(3, 1,cmp.getLocation());
				cell = (WritableCell) l3;
				sheetToEdit.addCell(cell);
				Label l4 = new Label(4, 1,cmp.getBlockpermiles());
				cell = (WritableCell) l4;
				sheetToEdit.addCell(cell);
				Label l5 = new Label(5, 1,cmp.getRateperblock());//will change to objectname.getRatePerBlock()
				cell = (WritableCell) l5;
				sheetToEdit.addCell(cell);
				
				existingWorkbook.write();
				wb.close();
				existingWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} catch (BiffException e) {
				e.printStackTrace();

		}
			}else{
				WritableWorkbook workbookCopy;
				try {
					workbookCopy = Workbook.createWorkbook(new File("src/CDSCompanyList.xls"));
					WritableSheet sheetToEdit = workbookCopy.createSheet("Sheet", 0);
					WritableCell cell;
					Label l = new Label(0, 0,"Name");
					cell = (WritableCell) l;
					sheetToEdit.addCell(cell);
					Label l1 = new Label(1, 0,"Contact Number");
					cell = (WritableCell) l1;
					sheetToEdit.addCell(cell);
					Label l2 = new Label(2, 0,"Working Hours");
					cell = (WritableCell) l2;
					sheetToEdit.addCell(cell);
					Label l3 = new Label(3, 0,"Closest Intersection");
					cell = (WritableCell) l3;
					sheetToEdit.addCell(cell);
					Label l4 = new Label(4, 0,"Block To Miles");
					cell = (WritableCell) l4;
					sheetToEdit.addCell(cell);
					Label l5 = new Label(5, 0,"Rate Per Block");
					cell = (WritableCell) l5;
					sheetToEdit.addCell(cell);
					
					Label l7 = new Label(0, 1,cmp.getName());
					cell = (WritableCell) l7;
					sheetToEdit.addCell(cell);
					Label l8 = new Label(1, 1,cmp.getContactnumber());
					cell = (WritableCell) l8;
					sheetToEdit.addCell(cell);
					Label l9 = new Label(2, 1,cmp.getCompanyhrs());
					cell = (WritableCell) l9;
					sheetToEdit.addCell(cell);
					Label l10 = new Label(3, 1,cmp.getLocation());
					cell = (WritableCell) l10;
					sheetToEdit.addCell(cell);
					Label l11 = new Label(4, 1,cmp.getBlockpermiles());
					cell = (WritableCell) l11;
					sheetToEdit.addCell(cell);
					Label l12 = new Label(5, 1,cmp.getRateperblock());
					cell = (WritableCell) l12;
					sheetToEdit.addCell(cell);
					
					workbookCopy.write();
					workbookCopy.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}
			}
	}
	
	//read data from companylist
	public HashMap<String, ArrayList<String>> getCompanyList(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		int count=0;
		try{
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCompanyList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			
			for(int c=0;c<sheetToEdit.getColumns();c++){
				ArrayList<String> rdt = new ArrayList<String>();
				for(int r=1;r<sheetToEdit.getRows();r++){	
					rdt.add(sheetToEdit.getCell(c, r).getContents());
				}
				data.put(sheetToEdit.getCell(count, 0).getContents(), rdt);
				count++;
				
			}
			wb.close();
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public void setTicketData(Ticket tkt){
		if(new File("src/CDSTicketList.xls").exists()){
			WritableWorkbook existingWorkbook;
			try {
				Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
				existingWorkbook = Workbook.createWorkbook(new File("src/CDSTicketList.xls"),wb);
				WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				WritableCell cell;
				int rw = sheetToEdit.getRows();
				Label l12 = new Label(0, rw,tkt.getTicketid());
				cell = (WritableCell) l12;
				sheetToEdit.addCell(cell);
				Label l13 = new Label(1, rw,tkt.getPickupLocation());
				cell = (WritableCell) l13;
				sheetToEdit.addCell(cell);
				Label l25 = new Label(2, rw,tkt.getDeliverLocation());
				cell = (WritableCell) l25;
				sheetToEdit.addCell(cell);
				Label l14 = new Label(3, rw,tkt.getExecutiveId());
				cell = (WritableCell) l14;
				sheetToEdit.addCell(cell);
				Label l15 = new Label(4, rw,tkt.getExecutiveName());
				cell = (WritableCell) l15;
				sheetToEdit.addCell(cell);
				Label l16 = new Label(5, rw,tkt.getStatus());
				cell = (WritableCell) l16;
				sheetToEdit.addCell(cell);
				Label l17 = new Label(6, rw,tkt.getOrderTaker());
				cell = (WritableCell) l17;
				sheetToEdit.addCell(cell);
				Label l18 = new Label(7, rw,tkt.getPickupCustomer());
				cell = (WritableCell) l18;
				sheetToEdit.addCell(cell);
				Label l19 = new Label(8, rw,tkt.getDeliverCustomer());
				cell = (WritableCell) l19;
				sheetToEdit.addCell(cell);
				Label l20 = new Label(9, rw,tkt.getPickuptime());
				cell = (WritableCell) l20;
				sheetToEdit.addCell(cell);
				Label l21 = new Label(10, rw,tkt.getDeliverTime());
				cell = (WritableCell) l21;
				sheetToEdit.addCell(cell);
				Label l22 = new Label(11, rw,tkt.getPackageId());
				cell = (WritableCell) l22;
				sheetToEdit.addCell(cell);
				Label l23 = new Label(12, rw,tkt.getBillPayee());
				cell = (WritableCell) l23;
				sheetToEdit.addCell(cell);
				Label l27 = new Label(13, rw,tkt.getBillAmount());
				cell = (WritableCell) l27;
				sheetToEdit.addCell(cell);
				
				existingWorkbook.write();
				wb.close();
				existingWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} catch (BiffException e) {
				e.printStackTrace();

		}
			}else{
				WritableWorkbook workbookCopy;
				try {
					workbookCopy = Workbook.createWorkbook(new File("src/CDSTicketList.xls"));
					WritableSheet sheetToEdit = workbookCopy.createSheet("Sheet", 0);
					WritableCell cell;
					Label l = new Label(0, 0,"Ticket ID");
					cell = (WritableCell) l;
					sheetToEdit.addCell(cell);
					Label l1 = new Label(1, 0,"Pickup Location");
					cell = (WritableCell) l1;
					sheetToEdit.addCell(cell);
					Label l24 = new Label(2, 0,"Deliver Location");
					cell = (WritableCell) l24;
					sheetToEdit.addCell(cell);
					Label l2 = new Label(3, 0,"Executive ID");
					cell = (WritableCell) l2;
					sheetToEdit.addCell(cell);
					Label l3 = new Label(4, 0,"Executive Name");
					cell = (WritableCell) l3;
					sheetToEdit.addCell(cell);
					Label l4 = new Label(5, 0,"Status");
					cell = (WritableCell) l4;
					sheetToEdit.addCell(cell);
					Label l5 = new Label(6, 0,"Order Taker");
					cell = (WritableCell) l5;
					sheetToEdit.addCell(cell);
					Label l6 = new Label(7, 0,"Pickup Customer");
					cell = (WritableCell) l6;
					sheetToEdit.addCell(cell);
					Label l7 = new Label(8, 0,"Deliver Customer");
					cell = (WritableCell) l7;
					sheetToEdit.addCell(cell);
					Label l8 = new Label(9, 0,"Pickup Time");
					cell = (WritableCell) l8;
					sheetToEdit.addCell(cell);
					Label l9 = new Label(10, 0,"Deliver Time");
					cell = (WritableCell) l9;
					sheetToEdit.addCell(cell);
					Label l10 = new Label(11, 0,"Package ID");
					cell = (WritableCell) l10;
					sheetToEdit.addCell(cell);
					Label l11 = new Label(12, 0,"Bill Payee");
					cell = (WritableCell) l11;
					sheetToEdit.addCell(cell);
					Label l26 = new Label(13, 0,"Bill Amount");
					cell = (WritableCell) l26;
					sheetToEdit.addCell(cell);
					
					
					Label l12 = new Label(0, 1,tkt.getTicketid());
					cell = (WritableCell) l12;
					sheetToEdit.addCell(cell);
					Label l13 = new Label(1, 1,tkt.getPickupLocation());
					cell = (WritableCell) l13;
					sheetToEdit.addCell(cell);
					Label l25 = new Label(2, 1,tkt.getDeliverLocation());
					cell = (WritableCell) l25;
					sheetToEdit.addCell(cell);
					Label l14 = new Label(3, 1,tkt.getExecutiveId());
					cell = (WritableCell) l14;
					sheetToEdit.addCell(cell);
					Label l15 = new Label(4, 1,tkt.getExecutiveName());
					cell = (WritableCell) l15;
					sheetToEdit.addCell(cell);
					Label l16 = new Label(5, 1,tkt.getStatus());
					cell = (WritableCell) l16;
					sheetToEdit.addCell(cell);
					Label l17 = new Label(6, 1,tkt.getOrderTaker());
					cell = (WritableCell) l17;
					sheetToEdit.addCell(cell);
					Label l18 = new Label(7, 1,tkt.getPickupCustomer());
					cell = (WritableCell) l18;
					sheetToEdit.addCell(cell);
					Label l19 = new Label(8, 1,tkt.getDeliverCustomer());
					cell = (WritableCell) l19;
					sheetToEdit.addCell(cell);
					Label l20 = new Label(9, 1,tkt.getPickuptime());
					cell = (WritableCell) l20;
					sheetToEdit.addCell(cell);
					Label l21 = new Label(10, 1,tkt.getDeliverTime());
					cell = (WritableCell) l21;
					sheetToEdit.addCell(cell);
					Label l22 = new Label(11, 1,tkt.getPackageId());
					cell = (WritableCell) l22;
					sheetToEdit.addCell(cell);
					Label l23 = new Label(12, 1,tkt.getBillPayee());
					cell = (WritableCell) l23;
					sheetToEdit.addCell(cell);
					Label l27 = new Label(13, 1,tkt.getBillAmount());
					cell = (WritableCell) l27;
					sheetToEdit.addCell(cell);
					
					workbookCopy.write();
					workbookCopy.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}
			}
	}
	
	public HashMap<String, ArrayList<String>> getTicketData(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		try{
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			for(int col=0;col<sheetToEdit.getColumns();col++){
				ArrayList<String> val = new ArrayList<>();
				for(int row =1;row<sheetToEdit.getRows();row++){
					val.add(sheetToEdit.getCell(col, row).getContents());
				}
				data.put(sheetToEdit.getCell(col, 0).getContents(), val);
			}
			wb.close();
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	public HashMap<String, ArrayList<String>> getCourierData(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		try{
			Workbook wb = Workbook.getWorkbook(new File("src/CourierList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			for(int col=0;col<sheetToEdit.getColumns();col++){
				ArrayList<String> val = new ArrayList<>();
				for(int row =3;row<sheetToEdit.getRows();row++){
					val.add(sheetToEdit.getCell(col, row).getContents());
				}
				data.put(sheetToEdit.getCell(col, 2).getContents(), val);
			}
			wb.close();
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	public String getPassword(String name){
		String pass=null;
		
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(4, r).getContents();
						break;
					}
				}
				wb.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	public String getType(String name){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(3, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}

	public void setCustomerData(Customer cst){
		if(new File("src/CDSCustomerList.xls").exists()){
			WritableWorkbook existingWorkbook;
			try {
				Workbook wb = Workbook.getWorkbook(new File("src/CDSCustomerList.xls"));
				existingWorkbook = Workbook.createWorkbook(new File("src/CDSCustomerList.xls"),wb);
				WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				WritableCell cell;
				int rw = sheetToEdit.getRows();
				Label l = new Label(0, rw,cst.getName());
				cell = (WritableCell) l;
				sheetToEdit.addCell(cell);
				Label l1 = new Label(1, rw,cst.getMail());
				cell = (WritableCell) l1;
				sheetToEdit.addCell(cell);
				Label l2 = new Label(2, rw,cst.getClosestintersection());
				cell = (WritableCell) l2;
				sheetToEdit.addCell(cell);
				Label l3 = new Label(3, rw,cst.getCity());
				cell = (WritableCell) l3;
				sheetToEdit.addCell(cell);
				Label l4 = new Label(4, rw,cst.getPhone());
				cell = (WritableCell) l4;
				sheetToEdit.addCell(cell);
				Label l5 = new Label(5, rw,cst.getState());
				cell = (WritableCell) l5;
				sheetToEdit.addCell(cell);
				Label l6 = new Label(5, rw,cst.getZip());
				cell = (WritableCell) l6;
				sheetToEdit.addCell(cell);
				
				existingWorkbook.write();
				wb.close();
				existingWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} catch (BiffException e) {
				e.printStackTrace();

		}
			}else{
				WritableWorkbook workbookCopy;
				try {
					workbookCopy = Workbook.createWorkbook(new File("src/CDSCustomerList.xls"));
					WritableSheet sheetToEdit = workbookCopy.createSheet("Sheet", 0);
					WritableCell cell;
					Label l = new Label(0, 0,"Name");
					cell = (WritableCell) l;
					sheetToEdit.addCell(cell);
					Label l1 = new Label(1, 0,"Email");
					cell = (WritableCell) l1;
					sheetToEdit.addCell(cell);
					Label l2 = new Label(2, 0,"Closest Intersection");
					cell = (WritableCell) l2;
					sheetToEdit.addCell(cell);
					Label l3 = new Label(3, 0,"City");
					cell = (WritableCell) l3;
					sheetToEdit.addCell(cell);
					Label l4 = new Label(4, 0,"Phone");
					cell = (WritableCell) l4;
					sheetToEdit.addCell(cell);
					Label l5 = new Label(5, 0,"State");
					cell = (WritableCell) l5;
					sheetToEdit.addCell(cell);
					Label l6 = new Label(5, 0,"Zip");
					cell = (WritableCell) l6;
					sheetToEdit.addCell(cell);
					
					Label l7 = new Label(0, 1,cst.getName());
					cell = (WritableCell) l7;
					sheetToEdit.addCell(cell);
					Label l8 = new Label(1, 1,cst.getMail());
					cell = (WritableCell) l8;
					sheetToEdit.addCell(cell);
					Label l9 = new Label(2, 1,cst.getClosestintersection());
					cell = (WritableCell) l9;
					sheetToEdit.addCell(cell);
					Label l10 = new Label(3, 1,cst.getCity());
					cell = (WritableCell) l10;
					sheetToEdit.addCell(cell);
					Label l11 = new Label(4, 1,cst.getPhone());
					cell = (WritableCell) l11;
					sheetToEdit.addCell(cell);
					Label l12 = new Label(5, 1,cst.getState());
					cell = (WritableCell) l12;
					sheetToEdit.addCell(cell);
					Label l13 = new Label(5, 1,cst.getZip());
					cell = (WritableCell) l13;
					sheetToEdit.addCell(cell);
					
					workbookCopy.write();
					workbookCopy.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}
			}
	}
	
	public void setDbData(DeliveryPerson dp){
		if(new File("src/CDSDeliveryboyList.xls").exists()){
			WritableWorkbook existingWorkbook;
			try {
				Workbook wb = Workbook.getWorkbook(new File("src/CDSDeliveryboyList.xls"));
				existingWorkbook = Workbook.createWorkbook(new File("src/CDSDeliveryboyList.xls"),wb);
				WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				WritableCell cell;
				int rw = sheetToEdit.getRows();
				Label l = new Label(0, rw,dp.getName());
				cell = (WritableCell) l;
				sheetToEdit.addCell(cell);
				Label l1 = new Label(1, rw,dp.getStatus());
				cell = (WritableCell) l1;
				sheetToEdit.addCell(cell);
				
				existingWorkbook.write();
				wb.close();
				existingWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} catch (BiffException e) {
				e.printStackTrace();

		}
			}else{
				WritableWorkbook workbookCopy;
				try {
					workbookCopy = Workbook.createWorkbook(new File("src/CDSDeliveryboyList.xls"));
					WritableSheet sheetToEdit = workbookCopy.createSheet("Sheet", 0);
					WritableCell cell;
					Label l = new Label(0, 0,"Name");
					cell = (WritableCell) l;
					sheetToEdit.addCell(cell);
					Label l1 = new Label(1, 0,"Status");
					cell = (WritableCell) l1;
					sheetToEdit.addCell(cell);
					
					Label l7 = new Label(0, 1,dp.getName());
					cell = (WritableCell) l7;
					sheetToEdit.addCell(cell);
					Label l8 = new Label(1, 1,dp.getStatus());
					cell = (WritableCell) l8;
					sheetToEdit.addCell(cell);
					
					workbookCopy.write();
					workbookCopy.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}
			}
	}
	
	public HashMap<String, ArrayList<String>> getCustomerData(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		int count=0;
		try{
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCustomerList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			
			for(int c=0;c<sheetToEdit.getColumns();c++){
				ArrayList<String> rdt = new ArrayList<String>();
				for(int r=1;r<sheetToEdit.getRows();r++){	
					rdt.add(sheetToEdit.getCell(c, r).getContents());
				}
				data.put(sheetToEdit.getCell(count, 0).getContents(), rdt);
				count++;
			}
			wb.close();
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public HashMap<String, ArrayList<String>> getDpData(){
		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		int count=0;
		try{
			Workbook wb = Workbook.getWorkbook(new File("src/CDSDeliveryboyList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			
			for(int c=0;c<sheetToEdit.getColumns();c++){
				ArrayList<String> rdt = new ArrayList<String>();
				for(int r=1;r<sheetToEdit.getRows();r++){	
					rdt.add(sheetToEdit.getCell(c, r).getContents());
				}
				data.put(sheetToEdit.getCell(count, 0).getContents(), rdt);
				count++;
			}
			wb.close();
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public String getCustomEmployee(String name,int col){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(col, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public String getCustomCustomer(String name,int col){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCustomerList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(col, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public String getCustomCompany(int col){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCompanyList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
			pass = sheetToEdit.getCell(col, 1).getContents();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pass;
	}
	
	public String getCustomTicket(String name,int col){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(col, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public ArrayList<String> getCustomTicketid(String name){
		ArrayList<String> pass=new ArrayList<>();
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(6, r).getContents().equals(name)){
						pass.add(sheetToEdit.getCell(0, r).getContents());
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public String getCustomTicketval(String name){
		int tot=0;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(6, r).getContents().equals(name)){
						tot+=Integer.parseInt(sheetToEdit.getCell(13, r).getContents());
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tot+"";
	}
	
	
	public String getCustomCourier(String name,int col){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CourierList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=2;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(1, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(col, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public String getDpStatus(String name){
		String pass=null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSDeliveryboyList.xls"));
			Sheet sheetToEdit = wb.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						pass = sheetToEdit.getCell(1, r).getContents();
						break;
					}
				}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pass;
	}
	
	public void editCustomer(String name,Customer cst){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCustomerList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSCustomerList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l7 = new Label(0, r,cst.getName());
						cell = (WritableCell) l7;
						sheetToEdit.addCell(cell);
						Label l8 = new Label(1, r,cst.getMail());
						cell = (WritableCell) l8;
						sheetToEdit.addCell(cell);
						Label l9 = new Label(2, r,cst.getClosestintersection());
						cell = (WritableCell) l9;
						sheetToEdit.addCell(cell);
						Label l10 = new Label(3, r,cst.getCity());
						cell = (WritableCell) l10;
						sheetToEdit.addCell(cell);
						Label l11 = new Label(4, r,cst.getPhone());
						cell = (WritableCell) l11;
						sheetToEdit.addCell(cell);
						Label l12 = new Label(5, r,cst.getState());
						cell = (WritableCell) l12;
						sheetToEdit.addCell(cell);
						Label l13 = new Label(5, r,cst.getZip());
						cell = (WritableCell) l13;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {

			e.printStackTrace();
		}
	}
	
	public void editTicketStatus(String name,Ticket tkt){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSTicketList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l16 = new Label(5, r,tkt.getStatus());
						cell = (WritableCell) l16;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {

			e.printStackTrace();
		}
	}
	
	public void editTicketDeliveryboy(String name,Ticket tkt){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSTicketList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l16 = new Label(4, r,tkt.getExecutiveName());
						cell = (WritableCell) l16;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {

			e.printStackTrace();
		}
	}
	
	public void editTicketDeliveryTime(String name,Ticket tkt){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSTicketList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l16 = new Label(10, r,tkt.getDeliverTime());
						cell = (WritableCell) l16;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {

			e.printStackTrace();
		}
	}
	public void editDpStatus(String name,DeliveryPerson dp){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSDeliveryboyList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSDeliveryboyList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l16 = new Label(1, r,dp.getStatus());
						cell = (WritableCell) l16;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {

			e.printStackTrace();
		}
	}
	
	public void delCustomer(String name){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSCustomerList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSCustomerList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				for(int r=3;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						sheetToEdit.removeRow(r);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void delEmployee(String name){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSEmployeeList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						sheetToEdit.removeRow(r);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	public void deldb(String name){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSDeliveryboyList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSDeliveryboyList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						sheetToEdit.removeRow(r);
						existingWorkbook.write();
						break;
					}
					}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
	public void delTicket(String name){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSTicketList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSTicketList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						sheetToEdit.removeRow(r);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
	public void editEmployee(String name,Employee emp){
		WritableWorkbook existingWorkbook;
		try {
			Workbook wb = Workbook.getWorkbook(new File("src/CDSEmployeeList.xls"));
			existingWorkbook = Workbook.createWorkbook(new File("src/CDSEmployeeList.xls"),wb);
			WritableSheet sheetToEdit = existingWorkbook.getSheet(0);
			WritableCell cell;
				for(int r=1;r<sheetToEdit.getRows();r++){	
					if(sheetToEdit.getCell(0, r).getContents().equals(name)){
						Label l7 = new Label(0, r,emp.getEname());
						cell = (WritableCell) l7;
						sheetToEdit.addCell(cell);
						Label l8 = new Label(1, r,emp.getPhone());
						cell = (WritableCell) l8;
						sheetToEdit.addCell(cell);
						Label l9 = new Label(2, r,emp.getEmail());
						cell = (WritableCell) l9;
						sheetToEdit.addCell(cell);
						Label l11 = new Label(3, r,emp.getEmpType());
						cell = (WritableCell) l11;
						sheetToEdit.addCell(cell);
						Label l12 = new Label(4, r,emp.getPassword());
						cell = (WritableCell) l12;
						sheetToEdit.addCell(cell);
						existingWorkbook.write();
						break;
					}
				}
				wb.close();
				existingWorkbook.close();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
}
