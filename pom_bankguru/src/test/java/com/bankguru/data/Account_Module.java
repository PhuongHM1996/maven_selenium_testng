package com.bankguru.data;

public class Account_Module {

	public class ErrorMessage {

		public static final String CUSTOMER_ID_CAN_NOT_BE_EMPTY = "Customer ID is required";
		public static final String CUSTOMER_ID_CAN_NOT_HAVE_CHARACTER = "Characters are not allowed";
		public static final String CUSTOMER_ID_CAN_NOT_HAVE_SPECIAL_CHARATER = "Special characters are not allowed";
		public static final String CUSTOMER_ID_CAN_NOT_HAVE_BLANK_SPACE = "Characters are not allowed";
		public static final String CUSTOMER_ID_CAN_NOT_HAVE_FIRST_BLANK_SPACE = "First character can not have space";

		public static final String DEPOSIT_CAN_NOT_BE_EMPTY = "Initial Deposit must not be blank";
		public static final String DEPOSIT_CAN_NOT_HAVE_CHARACTER = "Characters are not allowed";
		public static final String DEPOSIT_CAN_NOT_HAVE_SPECIAL_CHARATER = "Special characters are not allowed";
		public static final String DEPOSIT_CAN_NOT_HAVE_BLANK_SPACE = "Characters are not allowed";
		public static final String DEPOSIT_CAN_NOT_HAVE_FIRST_BLANK_SPACE = "First character can not have space";
		
		public static final String ACCOUNT_NO_CAN_NOT_BE_EMPTY = "Account Number must not be blank";
		public static final String ACCOUNT_NO_CAN_NOT_HAVE_CHARACTER = "Characters are not allowed";
		public static final String ACCOUNT_NO_CAN_NOT_HAVE_SPECIAL_CHARATER = "Special characters are not allowed";
		public static final String ACCOUNT_NO_CAN_NOT_HAVE_BLANK_SPACE = "Characters are not allowed";
		public static final String ACCOUNT_NO_CAN_NOT_HAVE_FIRST_BLANK_SPACE = "First character can not have space";
		
	}

	public class New_Account_Data {

		public static final String CUSTOMER_ID_DATA_HAVE_CHARATERS_01 = "customer123";
		public static final String CUSTOMER_ID_DATA_HAVE_CHARATERS_02 = "123customer";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARATERS_01 = "custome!@#$";
		public static final String CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String CUSTOMER_ID_DATA_HAVE_CHARACTER_AS_SPACE = "123 1";
		public static final String CUSTOMER_ID_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

		public static final String DEPOSIT_DATA_HAVE_CHARATERS_01 = "deposit123";
		public static final String DEPOSIT_DATA_HAVE_CHARATERS_02 = "123deposit";
		public static final String DEPOSIT_DATA_HAVE_SPECIAL_CHARATERS_01 = "deposit!@#$";
		public static final String DEPOSIT_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String DEPOSIT_DATA_HAVE_CHARACTER_AS_SPACE = "123 1";
		public static final String DEPOSIT_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

	}

	public class Edit_Customer_Data {
		
		public static final String ACCOUNT_NO_DATA_HAVE_CHARATERS_01 = "account123";
		public static final String ACCOUNT_NO_DATA_HAVE_CHARATERS_02 = "123account";
		public static final String ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01 = "account!@#$";
		public static final String ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String ACCOUNT_NO_DATA_HAVE_CHARACTER_AS_SPACE = "123 1";
		public static final String ACCOUNT_NO_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";

	}

	public class Delete_Customer_Data {

		public static final String ACCOUNT_NO_DATA_HAVE_CHARATERS_01 = "account123";
		public static final String ACCOUNT_NO_DATA_HAVE_CHARATERS_02 = "123account";
		public static final String ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01 = "account!@#$";
		public static final String ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_02 = "!@#$";
		public static final String ACCOUNT_NO_DATA_HAVE_CHARACTER_AS_SPACE = "123 1";
		public static final String ACCOUNT_NO_DATA_HAVE_FIRST_CHARACTER_AS_SPACE = " ";
	}

}
