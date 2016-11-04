package XdfPrint;

import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.*;

public class myPrintGUI {
	public myPrintGUI(){}
	public void GUIInitial(){}
	public void printMenuItem(){
		
	}
	/*author Alex Qu
	 * this method is used to create a printer dialog
	 * in the dialog the information of page format should be delivery to service class
	 * */
	public void myPrintDialog(){
		PrinterJob pj = PrinterJob.getPrinterJob();
		if(pj.printDialog()){
			try{pj.print();}
			catch(PrinterException exc){
				System.out.println(exc);
			}
		}
	}
	
	public static void main(String[] arg){
		myPrintGUI pg= new myPrintGUI();
		pg.myPrintDialog();
		
	}
}
