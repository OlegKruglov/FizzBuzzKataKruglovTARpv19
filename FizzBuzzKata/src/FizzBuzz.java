public class FizzBuzz {

	public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            System.out.println(of(i));
        }
    }

    public static String of(int i) {
    	if(i % 3 == 0) return "Fizz";
        return String.valueOf(i);
    }
    
    

}