function formValidate() {

	var supID = document.form.supID.value;
	var name = document.form.name.value;
	var tpNo = document.form.tpNo.value;
	var email = document.form.email.value;
	var date = document.form.date.value;

	if (isAlphaNumeric(supID)) {
		if (isAlphabetic(name)) {
			if (isNumeric(tpNo)) {
				if (emailValidation(email)) {
					if (dateValidation(date)) {
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

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "supID")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Suplier ID~");
			return false;
		}
	} else
		return false;
}

/////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "name")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Supplier Name ~ ");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "tpNo")) {
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

function emailValidation(elemValue) {
	if (!isEmpty(elemValue, "email")) {
		var format = /.+@.+/;
		if (!elemValue.match(format)) {
			alert("Please Enter a valid E-mail Address !!!");
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function dateValidation(elemValue) {
	if (!isEmpty(elemValue, "regDate")) {
		var format = ("^([0-9]{4})-([0-9]{2})-([0-9]{2})$");

		if (elemValue.match(format)) {
			return true;

		} else

			alert("The Date must be in the correct format !");
	} else
		return false;

}
