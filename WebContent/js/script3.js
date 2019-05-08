function formValidate() {

	var itemID = document.form.itemID.value;
	var supID = document.form.supID.value;
	var quantity = document.form.quantity.value;
	var date = document.form.date.value;

	if (isAlphaNumeric(itemID)) {
		if (isAlphaNumeric(supID)) {
			if (isNumeric(quantity)) {
				if (dateValidation(date)) {

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

	if (!isEmpty(elemValue, "itemID")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Item ID~");
			return false;
		}
	} else
		return false;
}

/////////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "supID")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Supplier ID~");
			return false;
		}
	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////
function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "quantity")) {
		var y = /^[0-9]+$/;
		if (elemValue.match(y)) {
			return true;
		}

		else {
			alert("Please enter a valid number for ~Quantity~");
			return false;
		}

	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function dateValidation(elemValue) {
	if (!isEmpty(elemValue, "date")) {
		var format = ("^([0-9]{4})-([0-9]{2})-([0-9]{2})$");

		if (elemValue.match(format)) {
			return true;

		} else

			alert("The Date must be in the correct format !");
	} else
		return false;

}
