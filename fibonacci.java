// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        long number = -1;
        long number2 = 1;
        for(int counter =  1; counter <= 64; counter++) {
        long fibonacciIs = number+number2;
        number = number2;
        number2 = fibonacciIs;
        System.out.println(fibonacciIs);
        } 
    }
}