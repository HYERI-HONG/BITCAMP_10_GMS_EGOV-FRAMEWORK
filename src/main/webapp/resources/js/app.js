"use strict";
var app = app || {}
var user = user || {}
var app={
	init : x =>{
		console.log('step1');
		sessionStorage.removeItem('image');
		app.session.context(x);
		app.onCreate();
	},
	onCreate : ()=>{
		console.log('step3');
		app.setContentView();
		$('#login_btn').click(()=>{
			location.href = app.x()+'/move/member/login/off';
		});
		$('#login_submit').click(()=>{
			$('#loginForm').attr({
				action:app.x()+"/member/login",
				method:"POST"
			})
			.submit();
		});
		$('#logout_btn').click(()=>{
			location.href = app.x()+'/member/logout';
		});
		$('#mypage_btn').click(()=>{
			location.href = app.x()+'/member/retrieve/'+user.getItem().userid;
		});
		$('#home_btn').click(()=>{
			var auth="";
			if(user.getItem().userid===null){
				auth="off";
			}else{
				auth ="on";
			}
			location.href = app.x()+'/move/common/content/'+auth;
		});
		$('#add_btn').click(()=>{
			location.href = app.x()+'/move/member/add/off';
		});
		$('#add_submit').click(()=>{
			/*var form = document.getElementById('joinForm');
			form.action = app.x()+"/member/add";
			form.method = "POST";
			form.submit();	*/
			$('#addForm')
			.attr({
				action:app.x()+"/member/add",
				method:"POST"
			})
			.submit();
		});
		$('#goModify').click(()=>{
			location.href = app.x()+'/move/member/modify/on';
		
		});
		$('#modify_submit').click(()=>{
			
			var form = document.getElementById('modifyForm');
			var node = document.createElement('input');	
			node.setAttribute('type', 'hidden');
			node.setAttribute('name','userid');
			node.setAttribute('value',user.getItem().userid);
			form.appendChild(node);
			$('#modifyForm').attr({
				action:app.x()+"/member/modify",
				method:"POST"
			}).submit();
		});
		$('#goRemove').click(()=>{
			location.href = app.x()+'/move/member/remove/on';
		});
		$('#remove_submit').click(()=>{
			
			var form = document.getElementById('removeForm');
			var node = document.createElement('input');	
			node.setAttribute('type', 'hidden');
			node.setAttribute('name','userid');
			node.setAttribute('value',user.getItem().userid);
			form.appendChild(node);
			
			if(user.getItem().password===form.password.value){
				$('#removeForm').attr({
					action:app.x()+"/member/remove",
					method:"POST"
				}).submit();
			}else{
				alert("비밀번호가 틀렸습니다.")
			}
		});
	},
	setContentView : ()=>{
		console.log('step4  '+app.session.path('js'));
	}
};
app.session = {
		context : x=>{
			console.log('step2');
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		}, 
		path : x=>{
			return sessionStorage.getItem(x);
		}	
};
app.x =()=>{
	return app.session.path('context');
};
app.j =()=>{
	return app.session.path('js');
};
app.c =()=>{
	return app.session.path('css');
};
app.i =()=>{
	return app.session.path('img');
};

user.session = x=>{
	$.each(x, (k,v)=>{
		sessionStorage.setItem(k,v);
	});
}
user.getItem=()=>{
	return {
		userid : sessionStorage.getItem("userid"),
		password : sessionStorage.getItem("password")
	}
}
user.modify=()=>{
	let a = user.getItem().userid;
	$('#modifyuserid').text(a);
}



