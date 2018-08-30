package com.gms.web.service;

import java.util.List;
import java.util.Map;
import com.gms.web.domain.MemberDTO;

public interface MemberService {
	public void add(MemberDTO p);
	public List<?> list(Map<?,?> p);
	public List<?> search(Map<?,?> p);
	public MemberDTO retrieve(String p);
	public void count(Map<?,?> p);
	public void modify(Map<?,?> p);
	public void remove(MemberDTO p);
	public boolean login(MemberDTO p);
}