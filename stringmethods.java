public class stringmethods {
    public static void main(String[] args){
        String a = "Tushar";
        String a1 = new String("tushar is good");
        System.out.println(a);
        System.out.println(a1);

        System.out.println(a.length());
        System.out.println(a1.length());

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        String b ="   non trimmed string    ";  //removes trailing and leading spaces
        System.out.println(b.trim());

        System.out.println(a.substring(3));
        System.out.println(a.substring(2,4)); //includes start, does not include end

        System.out.println(a.replace('s', 'x'));
        System.out.println(a.replace("ushar", "eo"));

        System.out.println(a.startsWith("Tu"));
        System.out.println(a.endsWith("ar"));

        System.out.println(a.charAt(3));
        System.out.println(a1.charAt(12));

        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf("sh"));
        System.out.println(a1.indexOf('o')); //same letter then prints the index of the first occurence
        System.out.println(a1.indexOf("go", 4));

        String c = "HEELLOOOOOO";
        System.out.println(c.lastIndexOf("O"));
        System.out.println(c.lastIndexOf("O", 6));  //checks from the last index value

        System.out.println(a.equals("tushar"));
        System.out.println(a.equals("Tushar"));

        System.out.println(a.equalsIgnoreCase("tUsHAR"));

        System.out.println(c.concat(a));

        System.out.println("I am Tushar\'s Laptop and I want to let you know that \"You can learn JAVA\"");
        


    }
    
}
