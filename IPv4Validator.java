public class IPv4Validator {
    public static String isValidIPv4(String ipAddress)
    {
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        if (ipAddress.matches(ipPattern)) {
            return "True";
        }
        else {
            return "False";
        }
    }
    public static void main(String[] args) {
        String input1 = "222.111.111.111";
        String input2 = "5555..555";
        String input3 = "0.0.0.255";
        System.out.println("Input: " + input1 + " : " + isValidIPv4(input1));
        System.out.println("Input: " + input2 + " : " + isValidIPv4(input2));
        System.out.println("Input: " + input3 + " : " + isValidIPv4(input3));
    }
}
