package com.gms.web.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper memberDAO;
	@Override
	public void add(MemberDTO p) {
		
		//--------------------Age-----------------//
		Date date = new Date();
		String ssn = p.getSsn();
		
		/*int toYear = date.getYear()+1900;
		int toMonth = date.getMonth()+1;
		int toDay = date.getDate();
		
		int birYear = Integer.parseInt(ssn.substring(0, 2));
		int birMonth = Integer.parseInt(ssn.substring(2, 4));
		int birDay = Integer.parseInt(ssn.substring(4, 6));
		
		birYear = birYear>18&&birYear<=99 ? 
				Integer.parseInt("19"+String.valueOf(birYear))
				:
					Integer.parseInt("20"+String.valueOf(birYear));

		int age = ((birMonth*100+birDay)>(toMonth*100+toDay))? toYear-birYear-1:toYear-birYear;
		p.setAge(String.valueOf(age));
		
		//--------------------Gender-----------------//
		char genderNum = ssn.charAt(7);
		String gender="";

		if(genderNum=='1'||genderNum=='3'){
			gender="남자";
		}else if(genderNum=='2'||genderNum=='4'){
			gender="여자";
		}else if(genderNum=='5'||genderNum=='6'){
			gender="외국인";
		}	
		p.setGender(gender);	
		
		System.out.println("age : "+age+" gender :"+gender);
		memberDAO.insert(p);*/
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(String p) {
		return memberDAO.selectOne(p);
	}
	
	@Override
	public void count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Map<?,?> p) {
		memberDAO.update(p);
		
	}

	@Override
	public void remove(MemberDTO p) {
		memberDAO.delete(p);
		
	}

	@Override
	public boolean login(MemberDTO p) {
		return memberDAO.login(p).equals("1");
	}
}