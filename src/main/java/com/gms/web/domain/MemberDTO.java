package com.gms.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class MemberDTO {
	private String teamid,userid,password,name,age,ssn,gender,roll;
}

