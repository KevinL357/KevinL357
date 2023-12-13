public class Arrays {
    public static void main(String[] args) {
        
        int[] values = new int[4]; //makes an array called "values" with integer values able to be stored in it

        System.out.println(values[2]); //prints the third value of the array, because it isn't defined, it is auto set to 0

        values[0]=10; //sets the first value of "values" to 10
        values[1]=20; //sets the second value of "values" to 20
        values[3]=295; //sets the third value of "values" to 295
        System.out.println(values[0]); //prints the first value of "values", 10
        System.out.println(values[1]); //prints the second value of "values", 0
        System.out.println(values[2]); //prints the third value of "values", 0


        for (int i=0; i<values.length; i++) { //sets integer "i", gets lenght of "values", repeats as long as "i" is less
            System.out.println(values[i]);
        }
   }
}