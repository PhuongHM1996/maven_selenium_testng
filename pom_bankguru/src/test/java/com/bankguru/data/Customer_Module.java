package com.bankguru.data;

public class Customer_Module {

	public class ErrorMessage {

		public static final String CUSTOMER_NAME_CAN_NOT_BE_EMPTY = "Customer name must not be blank";
		public static final String CUSTOMER_NAME_CAN_NOT_BE_NUMERIC = "Numbers are not allowed";
		public static final String CUSTOMER_NAME_CAN_NOT_HAVE_SPECIAL_CHARETERS = "Special characters are not allowed";
		public static final String CUSTOMER_NAME_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE = "First character can not have space";

		public static final String ADDRESS_CAN_NOT_BE_EMPTY = "Address Field must not be blank";
		public static final String ADDRESS_FIRST_CHARACTER_AS_SPACE = "First character can not have space";

		public static final String CITY_CAN_NOT_BE_EMPTY = "City Field must not be blank";
		public static final String CITY_CAN_NOT_BE_NUMERIC = "Numbers are not allowed";
		public static final String CITY_CAN_NOT_HAVE_SPECIAL_CHARETERS = "Special characters are not allowed";
		public static final String CITY_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE = "First character can not have space";

		public static final String STATE_CAN_NOT_BE_EMPTY = "Sate Field must not be blank";
		public static final String STATE_CAN_NOT_BE_EMPTY_EDIT = "State must not be blank";
		public static final String STATE_CAN_NOT_BE_NUMERIC = "Numbers are not allowed";
		public static final String STATE_CAN_NOT_HAVE_SPECIAL_CHARETERS = "Special characters are not allowed";
		public static final String STATE_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE = "First character can not have space";

		public static final String PIN_CAN_NOT_BE_NUMERIC = "Characters are not allowed";
		public static final String PIN_CAN_NOT_BE_EMPTY = "PIN Code must not be blank";
		public static final String PIN_CAN_MUST_HAVE_SIX_DIGITS = "PIN Code must have 6 Digits";
		public static final String PIN_CAN_NOT_HAVE_SPECIAL_CHARETERS = "Special characters are not allowed";
		public static final String PIN_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE = "First character can not have space";
		public static final String PIN_CAN_NOT_HAVE_CHARACTER_AS_SPACE = "Characters are not allowed";

		public static final String PHONE_CAN_NOT_BE_EMPTY = "Mobile no must not be blank";
		public static final String PHONE_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE = "First character can not have space";
		public static final String PHONE_CAN_NOT_HAVE_CHARACTER_AS_SPACE = "Characters are not allowed";
		public static final String PHONE_CAN_NOT_HAVE_SPECIAL_CHARETERS = "Special characters are not allowed";

		public static final String EMAIL_CAN_NOT_BE_EMPTY = "Email-ID must not be blank";
		public static final String EMAIL_MUST_BE_IN_CORRECT_FORMAT = "Email-ID is not valid";
		public static final String EMAIL_CAN_NOT_HAVE_CHARACTER_AS_SPACE = "Email-ID is not valid";

		public static final String CUSTOMER_ID_CAN_NOT_BE_EMPTY = "Customer ID is required";
		public static final String CUSTOMER_ID_HAVE_CHARACTER = "Characters are not allowed";
		public static final String CUSTOMER_ID_HAVE_BLANK_SPACE = "Characters are not allowed";
		public static final String CUSTOMER_ID_HAVE_FIRST_BLANK_SPACE = "First character can not have space";
		public static final String CUSTOMER_ID_HAVE_SPECIAL_CHARACER = "Special characters are not allowed";

	}

	public class New_Customer_Data {

		public static final String CUSTOMER_NAME_DATA_HAVE_NUMBERIC_01 = "1234";
		public static final String CUSTOMER_NAME_DATA_HAVE_NUMBERIC_02 = "name1234";
		public static final String CUSTOMER_NAME_DATA_HAVE_SPECIAL_CHARATERS_01 = "name!@#$";
		public static final String CUSTOMER_NAME_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String CUSTOMER_NAME_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

		public static final String ADDRESS_DATA_HAVE_NUMBERIC_01 = "1234";
		public static final String ADDRESS_DATA_HAVE_NUMBERIC_02 = "city1234";
		public static final String ADDRESS_DATA_HAVE_SPECIAL_CHARATERS_01 = "address!@#$";
		public static final String ADDRESS_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String ADDRESS_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

		public static final String STATE_DATA_HAVE_NUMBERIC_01 = "1234";
		public static final String STATE_DATA_HAVE_NUMBERIC_02 = "State1234";
		public static final String STATE_DATA_HAVE_SPECIAL_CHARATERS_01 = "state!@#$";
		public static final String STATE_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String STATE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

		public static final String PIN_DATA_HAVE_CHARACTER = "PIN";
		public static final String PIN_DATA_LESS_SIX_DIGITS = "12345";
		public static final String PIN_DATA_HAVE_SPECIAL_CHARATERS_01 = "12!@#$";
		public static final String PIN_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String PIN_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";
		public static final String PIN_DATA_HAVE_CHARACTER_AS_SPACE = "1 2";

		public static final String PHONE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";
		public static final String PHONE_DATA_HAVE_CHARACTER_AS_SPACE = "0931889 2";
		public static final String PHONE_DATA_HAVE_SPECIAL_CHARATERS_01 = "0931!@#";
		public static final String PHONE_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";

		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_01 = "guru99@gmail";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_02 = "guru99";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_03 = "guru99@";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_04 = "guru99gmail.";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_05 = "guru99gmail.com";
		public static final String EMAIL_DATA_HAVE_CHARACTER_AS_SPACE = "guru 99@gmail.com";
	}

	public class Edit_Customer_Data {

		public static final String CUSTOMER_ID_DATA_HAVE_CHARACTER_01 = "1234Acc";
		public static final String CUSTOMER_ID_DATA_HAVE_CHARACTER_02 = "Acc1234";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_01 = "123!@#";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_02 = "!@#123";

		public static final String CITY_DATA_HAVE_NUMBERIC_01 = "1234";
		public static final String CITY_DATA_HAVE_NUMBERIC_02 = "city1234";
		public static final String CITY_DATA_HAVE_SPECIAL_CHARATERS_01 = "city!@#$";
		public static final String CITY_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";

		public static final String STATE_DATA_HAVE_NUMBERIC_01 = "1234";
		public static final String STATE_DATA_HAVE_NUMBERIC_02 = "State1234";
		public static final String STATE_DATA_HAVE_SPECIAL_CHARATERS_01 = "state!@#$";
		public static final String STATE_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String STATE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

		public static final String PIN_DATA_HAVE_CHARACTER = "PIN";
		public static final String PIN_DATA_LESS_SIX_DIGITS = "12345";
		public static final String PIN_DATA_HAVE_SPECIAL_CHARATERS_01 = "12!@#$";
		public static final String PIN_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String PIN_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";
		public static final String PIN_DATA_HAVE_CHARACTER_AS_SPACE = "1 2";

		public static final String PHONE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";
		public static final String PHONE_DATA_HAVE_CHARACTER_AS_SPACE = "0931889 2";
		public static final String PHONE_DATA_HAVE_SPECIAL_CHARATERS_01 = "0931!@#";
		public static final String PHONE_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";

		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_01 = "guru99@gmail";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_02 = "guru99";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_03 = "guru99@";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_04 = "guru99gmail.";
		public static final String EMAIL_DATA_NOT_CORRECT_FORMAT_05 = "guru99gmail.com";
		public static final String EMAIL_DATA_HAVE_CHARACTER_AS_SPACE = "guru 99@gmail.com";

	}

	public class Delete_Customer_Data {

		public static final String CUSTOMER_ID_DATA_HAVE_CHARACTER_01 = "1234Acc";
		public static final String CUSTOMER_ID_DATA_HAVE_CHARACTER_02 = "Acc1234";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_01 = "123!@#";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_02 = "!@#123";
		public static final String CUSTOMER_ID_DATA_HAVE_SPACE_CHARACTER = "123 1";
		public static final String CUSTOMER_ID_DATA_HAVE_FIRST_SPACE = " 134";
	}

}
