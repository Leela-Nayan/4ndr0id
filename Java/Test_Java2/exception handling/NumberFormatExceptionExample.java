public class NumberFormatExceptionExample {  
    public static void main(String[] args) {  
        String str = "1abc"; // Initializing a String with non-numeric characters  
        try {  
            int num = Integer.parseInt(str); // Attempting to parse a non-numeric string to an integer  
            System.out.println("Parsed number: " + num);  
        } catch (Exception e) {  
            System.out.println(e);  
            // Additional error handling code can be added here  
        }  
    }  
}  