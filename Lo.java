public class Lo{
    public static void main(String[] args) {
        // Logical Operators = Use to connect two or more expressions
        //
        //                      && = (AND) both conditions must be true
        //                      || = (OR) either conditions must be true
        //                      ! = (NOT) = reverses boolean value condition

        int temp = 19;

        if(temp>30){
            System.out.println("Is hot outside!");
        }
        else if (temp < 30 && temp > 20){
            System.out.println("Is Perfect outside!");
        }
        else {
            System.out.println("Is cold outside!");
        }
    }
}