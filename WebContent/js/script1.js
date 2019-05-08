function formValidate() {

	var adminID = document.form.adminid.value;
	var adminName = document.form.adminname.value;
	var address = document.form.address.value;
	var emailAddress = document.form.emailaddress.value;
	var contactNo = document.form.contactno.value;
	var userName = document.form.username.value;
	var passWord = document.form.password.value;
	var task = document.form.task.value;

	if (isAlphaNumeric(adminID)) {
		if (isAlphabetic(adminName)) {
			if (isAlphaNumeric(address)) {
				if (emailValidation(emailAddress)) {
					if (isNumeric(contactNo)) {
						if (isAlphabetic(userName)) {
							if (nicValidation(passWord)) {
								if (isAlphabetic(task)) {

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

/////////////////////////////////////////////////////////////////////////////////////

function isEmpty(elemValue, field) {
	if (elemValue == "" || elemValue == null) {
		alert("You can't have ~ " + field + " ~ filled empty");
		return true;
	} else
		return false;

}

////////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "adminID")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Admin ID~");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "adminName")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Admin Name ~ ");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "address")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Address~");
			return false;
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

/////////////////////////////////////////////////////////////////////////////////////

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

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "userName")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ User Name ~  as the Admin Name");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function nicValidation(elemValue) {
	if (!isEmpty(elemValue, "passWord")) {
		var format = ("^[0-9]{9}[vVxX]$");

		if (elemValue.match(format)) {
			return true;

		} else

			alert("The Password must be in the correct format of the NIC Number !");
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "task")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Task ~ ");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

