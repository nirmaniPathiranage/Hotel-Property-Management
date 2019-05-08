function formValidate() {

	var roomNo = document.form.roomNo.value;
	var buildingNo = document.form.buildingNo.value;
	var floorNo = document.form.floorNo.value;
	var roomState = document.form.roomState.value;
	var sid = document.form.sid.value;

	if (isAlphaNumeric(roomNo)) {
		if (isAlphaNumeric(buildingNo)) {
			if (isAlphaNumeric(floorNo)) {
				if (isAlphabetic(roomState)) {
					if (isAlphaNumeric(sid)) {

					}
				}
			}
		}

	}
	return false;

}

// ///////////////////////////////////////////////////////////////////////////////////

function isEmpty(elemValue, field) {
	if (elemValue == "" || elemValue == null) {
		alert("You can't have ~ " + field + " ~ filled empty");
		return true;
	} else
		return false;

}

// //////////////////////////////////////////////////////////////////////////////////

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

// ///////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "buildingNo")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Building No~");
			return false;
		}
	} else
		return false;
}

// ///////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "floorNo")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Floor No~");
			return false;
		}
	} else
		return false;
}

// //////////////////////////////////////////////////////////////////////////////////

function isAlphabetic(elemValue) {
	var exp = /^[a-zA-Z]+$/;

	if (!isEmpty(elemValue, "roomState")) {
		if (elemValue.match(exp)) {
			return true;
		} else {
			alert("Please enter only text for ~ Room State ~ ");
			return false;
		}
	} else
		return false;
}

// //////////////////////////////////////////////////////////////////////////////////

function isAlphaNumeric(elemValue) {
	var x = /^[0-9a-zA-Z]+$/;

	if (!isEmpty(elemValue, "sid")) {
		if (elemValue.match(x)) {
			return true;
		} else {
			alert("Please enter only combination of AlphaNumeric for ~Staff ID~");
			return false;
		}
	} else
		return false;
}