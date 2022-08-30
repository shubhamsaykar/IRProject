//package com.pwc.anemoi.vendor.roles.serviceImpl;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Cell;
//
////xls file reader class
//public class ExcelFileReader {
//	
//	public static void main(String args[]) throws IOException {
//		FileInputStream file= new FileInputStream (new File("C:\\Users\\Anemoi\\Downloads\\UserAccessManagementTemplate (2).xls"));
//		
//		
//		HSSFWorkbook workbook = new HSSFWorkbook(file);
//		HSSFSheet sheet =workbook.getSheetAt(0);
//		FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
//		System.out.println("The given file is as>>>>>");
//		for(Row row: sheet) {
//			
//			for(Cell cell:row) {
//				
//				switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
//				case Cell.CELL_TYPE_NUMERIC:
//					System.out.println(cell.getNumericCellValue()+"\t\t");
//					
//					
//					break;
//					
//				case Cell.CELL_TYPE_STRING:
//					System.out.println(cell.getStringCellValue()+"\t\t");
//
//					break;
//				default:
////					System.out.println("Reading the excel file successfully");
//					
//				}
//			}
//		}
//	}
////	import java.lang.Math;
////	class HelloWorld {
////	    public static void main(String[] args) {
////	        double x=5;
////	        double y=330000;
////	        double expo=Math.pow(0.5,y);
////	        double ans=Math.pow(x,expo);
////	         System.out.println("****"+ans);
////	    }
////	}
//
//}
//
//
//
