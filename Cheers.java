public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            name = name.toUpperCase();
            int num = Integer.parseInt(args[1]);
            String special = "AEFHILMNORSX";
            
                for (int i = 0; i < name.length(); i++) {
                        char c1 = (name.charAt(i));
                                if (special.indexOf(c1) != -1) { 
                                        System.out.println("Give me an " + c1 + ": " + c1 + "!");
                                } else {
                                                System.out.println("Give me a  " + c1 + ": " + c1 + "!");
                                        }     
                }  
                        
                System.out.println("What does that spell?");

                for (int j = 0; j < num; j++) {
                        System.out.println(name + "!!!"); 
                }
        }
}

