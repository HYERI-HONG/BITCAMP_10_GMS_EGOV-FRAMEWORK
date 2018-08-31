package com.gms.web.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class Calc {
	public String calcAge(String ssn){
		
		int birfront = Integer.parseInt(ssn.substring(0, 2));		
		return String.valueOf(
				Integer.parseInt(
						new SimpleDateFormat("yyyy").format(new Date())
						)
				-
				Integer.parseInt(
						((birfront>18&&birfront<=99)?"19":"20")
						+""+birfront)
				+
				(
						(
								Integer.parseInt(ssn.substring(2, 6))>
								Integer.parseInt(new SimpleDateFormat("MMdd").format(new Date()))
						)? 1:0)
				);
	}
	public String calcGender(String ssn){ 
		char genderNum = ssn.charAt(7);
		String gender="";

		if(genderNum=='1'||genderNum=='3'){
			gender="남자";
		}else if(genderNum=='2'||genderNum=='4'){
			gender="여자";
		}else if(genderNum=='5'||genderNum=='6'){
			gender="외국인";
		}		
	
		return gender;
	}
}


