package com.gms.web.service.impl;

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
		memberDAO.insert(p);
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
	public void modify(MemberDTO p) {
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