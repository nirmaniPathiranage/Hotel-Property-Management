function formValidate() {

	var roomNo = document.form.roomNo.value;
	var roomType = document.form.roomType.value;
	var price = document.form.price.value;
	var discount = document.form.discount.value;

	if (isAlphaNumeric(roomNo)) {
		if (isAlphabetic(roomType)) {
			if (isNumeric(price)) {
				if (Numeric(discount)) {

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

	if (!isEmpty(elemValue, "roomNo")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Room No~");
			return false;
		}
	} else
		return false;
}

/////////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "roomType")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Room Type ~ ");
			return false;
		}
	} else
		return false;
}

///////////////////////////////////////////////////////////////////////////////////////

function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "price")) {
		var y = /^[0-9]+$/;
		if (elemValue.match(y)) {
			return true;
		}

		else {
			alert("Please enter a valid number for ~Price~");
			return false;
		}

	} else
		return false;
}

////////////////////////////////////////////////////////////////////////////////////

function isNumeric(elemValue) {
	if (!isEmpty(elemValue, "discount")) {
		var y = /^[0-9]+$/;
		if (elemValue.match(y)) {
			return true;
		}

		else {
			alert("Please enter a valid number for ~Discount~");
			return false;
		}

	} else
		return false;
}


