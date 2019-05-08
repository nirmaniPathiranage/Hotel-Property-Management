function formValidate() {

	var itemID = document.form.ItemID.value;
	var name = document.form.name.value;
	var quantity = document.form.quantity.value;
	var unitPrice = document.form.unitPrice.value;
	var supID = document.form.supID.value;
	var date = document.form.date.value;
	var type = document.form.type.value;

	if (isAlphaNumeric(itemID)) {
		if (isAlphabetic(name)) {
			if (isNumeric(quantity)) {
				if (isNumeric(unitPrice)) {
					if (isAlphaNumeric(supID)) {
						if (dateValidation(date)) {
							if (isAlphabetic(type)) {

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

////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "name")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Item Name ~ ");
			return false;
		}
	} else
		return false;
}

/////////////////////////////////////////////////////////////////////////////////////

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

function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "unitPrice")) {
		var y = /^[0-9]+$/;
		if (elemValue.match(y)) {
			return true;
		}

		else {
			alert("Please enter a valid number for ~Unit Price~");
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

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "type")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Type ~ ");
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
