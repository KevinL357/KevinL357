public class StringBuildingAndStringFormatting {
    public static void main(String[] args) {
        //inefficient way to "do" Strings. Strings can not be changed after creation
        String info = ""; //creates empty String
        info += "My name is Bob."; //uses previous empty String and makes a new String with added terms and reassigns the "info" variable name
        info += " ";
        info += "I am a builder.";
        System.out.println(info); //Prints out: My names is Bob. I am a builder.


        //StringBuilders
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue."); //modifying existant StringBuilder instead of creating a new String.
        sb.append(" ");
        sb.append("I am a Lego Fortnite Professional.");
        System.out.println(sb.toString()); //prints out sb but converts it to a String (I think)
        

        //another variation on how to make StringBuilders >.<
        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
        .append(" ")
        .append("I am a divist");
        System.out.println(s.toString());

        //Formatting Strings
        System.out.print("Here is text. \t That was a tab! \n That was a new line!");
        System.out.println(" here more text on same line heehehehaw");

        //Foramtting integer values
        System.out.printf("Total cost %d, quantity is %d", 5, 5); //for each formatting value, printf will search for the next closest argument
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");

        
        }
        System.out.println();

        //Formatting float values
        System.out.printf("Total value: %.2f\n", 5.6); //%f means float, \n means new line

    }
}
