public class TestPhoneNumber {
    private static PhoneNumber phoneNumber;
    public static final String[] validatePhone = new  String[]{"(84)-(0978489648)"};
    public static final String[] invalidatePhone = new  String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone: validatePhone
        ) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println(phone+ " is "+isvalid);
        }

        for (String phone: invalidatePhone
        ) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println(phone+ " is "+isvalid);
        }
    }
}
