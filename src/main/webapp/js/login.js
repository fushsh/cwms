
function login() {

	var userName = $('#username').val();
	var password = $('#password').val();
	console.info("userName=" + userName);
	console.info("password=" + password);
	if ( password.replace(/(^s*)|(s*$)/g, "").length > 0 ) {
		 var url = 'Login.do/Login?' + new Date().getTime();
		 $.ajax({
			 type: 'POST',
			 url: url,
			 dataType: 'json',
			 data: {
				 "username": userName,
				 "password": password
			 },
			 async: false,
			 cache: true,
			 error: function(response) {
				 console.info("11111111111");

	         },
			 success: function(response) {
				 if (response["code"] == 200) {
					 console.info("22222222222222222");

				 } else {
					 console.info("333333333333333");
				 }
			 }
		 })
	}
}