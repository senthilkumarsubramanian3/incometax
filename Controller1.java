package com.controller;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.BAO.Logic;
import com.BAO.Pdf;


@Controller 
public class Controller1 {  
	@RequestMapping(value="/salaryenter",method = RequestMethod.POST)
    public String redirect(@RequestParam("data") String a,Model m) throws IOException  
    {
		double p = 0;
	Logic object=new Logic();
        p=object.calculate(a);
         if(p==0){
        	 return "Noresult";
         }
               String b=a.concat("----").concat(Double.toString(p));
             
              
             BufferedWriter writer = new BufferedWriter(
                                         new FileWriter("C:\\Users\\765584\\Desktop\\Tax.txt", true)  //Set true for append mode
                                     );  
             writer.newLine();   //Add new line
             writer.write(b);
             writer.close();
         Pdf object1=new Pdf();
         object1.pdfgenerator(b);
        m.addAttribute("pq", p);
		return "Result";
    }
}