package com.BAO;

public class Logic {
public double calculate(String a){
	double ans = 0;
	double salary=Double.parseDouble(a);
	salary=salary-40000;
	double tax = 0,surcharge;
	 double educationcess;
	if(salary<=250000){
		   ans=0;
	}
 	else if((salary>250000)&&(salary<=500000)){
		salary=salary-250000;
		tax=(salary/100);
		tax=tax*5;
		educationcess= (tax/100);
		educationcess=educationcess*4;
		tax=tax+educationcess;
		   ans=tax;
	}
	else if ((salary>500000)&&(salary<=1000000)){
		salary=salary-500000;
		tax= (salary/100);
		tax=(tax*20)+12500;
		educationcess= (tax/100);
		educationcess=educationcess*4;
		tax=tax+educationcess;
		ans=tax;
	}
	else if((salary>1000000)&&(salary<=5000000)) {
		salary=salary-1000000;
		tax= (salary/100);
		tax=(tax*30)+112500;
		educationcess= (tax/100);
		educationcess=educationcess*4;
		tax=tax+educationcess;
		ans=tax;
	}
	else if((salary>5000000)&&(salary<=10000000)){
		salary=salary-1000000;
		tax=(salary/100);
		tax=(tax*30)+112500;
		surcharge=tax/100;
		surcharge=surcharge*10;
		tax=tax+surcharge;
		educationcess=(tax/100);
		educationcess=educationcess*4;
		tax=tax+educationcess;
		ans=tax;
	}
	else if(salary>10000000){
		salary=salary-1000000;
		tax=(salary/100);
		tax=(tax*30)+112500;
		surcharge=tax/100;
		surcharge=surcharge*15;
		tax=tax+surcharge;
		educationcess=(tax/100);
		educationcess=educationcess*4;
		tax=tax+educationcess;
		ans=tax;
	}
	return ans;
}
}
