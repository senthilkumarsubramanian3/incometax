package com.BAO;


import java.io.File;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class Pdf
{
	private static String USER_PASS = "Incometax";

	private static String OWNER_PASS = "tax";
   public  void pdfgenerator(String a)
   {
	try {
			
			OutputStream file = new FileOutputStream(new File("IncomeTax.pdf"));

			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);

			writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
					PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);

			document.open();
			document.add(new Paragraph(a));
	

			document.close();
			file.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
   }
}