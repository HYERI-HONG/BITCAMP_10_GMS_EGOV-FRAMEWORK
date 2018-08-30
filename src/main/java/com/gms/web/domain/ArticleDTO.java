package com.gms.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
@Lazy
//Lazy - 해당 domain에 대해서는 domain이 호출될 때에만 만들라는의미,
//초기 로딩 속도가 빨라진다. 
public class ArticleDTO {
	private String bno,title,content,writer,regdate,viewcnt;
}
