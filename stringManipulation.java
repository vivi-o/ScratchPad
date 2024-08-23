// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String name = "Viviane Oesterer";
        int firstIndex = name.indexOf('r'); 
        int lastIndex = name.lastIndexOf('r'); 
        char char_at = name.charAt(10); 
        System.out.println(char_at);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        System.out.println(name.contains("Viv"));
        String firstName = name.substring(0, 7); 
        System.out.println(firstName); 
        
        String first = "Viviane";
        String last = "Oesterer";
        String full = first +" "+ last;
        System.out.println(full);
        System.out.println(first.toUpperCase());
        System.out.println(last.toLowerCase());
        String myString = "1234";
        String number = "5";
        int foo = Integer.parseInt(number);
        System.out.println(foo);
        
        String str = "Viviane Oesterer";
        String[] arrOfStr = str.split(" ", 3);

        for (String a : arrOfStr)
            System.out.println(a);
  
        
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(" ");
        for(int i = 0; i<name.length(); i++) {
            System.out.println(name.charAt(15-i));
        }
        System.out.println(" ");
        for(int i = 0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(" ");
        for(int i = name.length()-1; i>=0 ; i--) {
            System.out.println(name.charAt(i));
        }
        
    }
}