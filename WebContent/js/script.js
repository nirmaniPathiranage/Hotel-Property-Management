function formValidate() {

	var userName = document.form.username.value;
	var passWord = document.form.password.value;
	var confirmPassword = document.form.confirmpassword.value;
	var fullName = document.form.fullname.value;
	var nicNo = document.form.nicno.value;
	var emailAddress = document.form.emailaddress.value;
	var streetAddress = document.form.streetaddress.value;
	var contactNo = document.form.contactno.value;
	var regDate = document.form.regdate.value;

	if (userValidation(userName, 8, 30)){
		if (passwordValidation(passWord)){
			if (confirmPasswordValidation(confirmPassword)){
				if (isAlphabetic(fullName)){
					if (nicValidation(nicNo)){
						if (emailValidation(emailAddress)){
							if (isAlphaNumeric(streetAddress)){
								if (isNumeric(contactNo)){
									if (dateValidation(regDate)){
									}
								}
							}
						}
					}
				}
			}
		}
	}
	return false;

}

////////////////////////////////////////////////////////////////////////////////////

function isEmpty(elemValue, field) {
	if (elemValue == "" || elemValue == null) {
		alert("You can't have ~ " + field + " ~ filled empty");
		return true;
	} else
		return false;

}

////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "fullName")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Full Name ~ ");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "streetAddress")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Street Address~");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "contactNo")) {
		var y = /^[0-9]+$/;
		if (elemValue.match(y)) {
			return true;
		}

		else {
			alert("Please enter a valid number for ~Contact No~");
			return false;
		}

	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function passwordValidation(elemValue) {
	if (!isEmpty(elemValue, "passWord")) {
		var format = /(?=^.{8,}$)(?=.*\d)(?=.*[!@#$%^&*]+)(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$/;

		if (elemValue.match(format)) {
			alert("Login Successful !");

		} else

			alert("The Password must be the combination of all the Characters , Upper cases and Lower cases and Digits !");
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function confirmPasswordValidation(elemValue) {

	if (!isEmpty(elemValue, "confirmPassword")) {
		if (confirmPassword != passWord) {
			alert("Please Enter the Same Password !!!");
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function emailValidation(elemValue) {
	if (!isEmpty(elemValue, "emailAddress")) {
		var format = /.+@.+/;
		if (!elemValue.match(format)) {
			alert("Please Enter a valid E-mail Address !!!");
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function userValidation(elemValue, min, max) {
	if (!isEmpty(elemValue, "userName")) {
		if (elemValue.length >= min && elemValue.length <= max) {
			return true;
		} else {
			alert("Enter a username in between " + min + "and" + max
					+ "characters");
			return false;
		}
	} else
		return false;

}
////////////////////////////////////////////////////////////////////////////////////

function nicValidation(elemValue) {
	if (!isEmpty(elemValue, "nicNo")) {
		var format = ("^[0-9]{9}[vVxX]$");

		if (elemValue.match(format)) {
			return true;

		} else

			alert("The NIC Number must be in the correct format !");
	} else
		return false;


////////////////////////////////////////////////////////////////////////////////////

function dateValidation(elemValue) {
	if (!isEmpty(elemValue, "regDate")) {
		var format = ("^([0-9]{4})-([0-9]{2})-([0-9]{2})$");

		if (elemValue.match(format)) {
			return true;

		} else

			alert("The Registered Date must be in the correct format !");
	} else
		return false;

}
}