// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(String.format("%10s %20s %20s %20s %20s", "counter","square", "cube", "2exponent", "fibonacci"));
        long number = -1;
        long number2 = 1;
        for(int counter =  1; counter <= 24; counter++) {
            long fibonacciIs = number+number2;
            number = number2;
            number2 = fibonacciIs;
            System.out.println(String.format("%10d %20d %20d %20d %20d", 
            counter, 
            (long)Math.pow(counter, 2), 
            (long)Math.pow(counter, 3),
            (long)Math.pow(2, counter),
            fibonacciIs));
        }
    }
}