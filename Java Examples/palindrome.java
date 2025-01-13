
    public class palindrome {
        public static void main(String[] args) {
            String a = "yash";
            String reverse = "";
    
            for (int i = a.length() - 1; i >= 0; i--) {
                reverse += a.charAt(i);
            }
    
            if (a.equals(reverse)) {
                System.out.println("Word is palindrome");
            } else {
                System.out.println("Word is not palindrome");
            }
        }
    }
    
