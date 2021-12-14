public class FizzBuzz {

	public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            System.out.println(of(i));
        }
    }

    public static String of(int number) {
    	if(number % 5 == 0 && number % 3 == 0) return "FizzBuzz";
    	if(number % 3 == 0) return "Fizz";
    	if(number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }
    
    

}
