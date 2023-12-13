public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] valoos = {3, 5, 29572}; //normal arrays
        System.out.println(valoos[2]);

        int[][] griddy = { //spiderverse arrays
            {3, 5, 23953},
            {2, 5, 28238},
            {2, 5, 52, 2, 74, 4683}//goes 0, 1, 2, 3, etc.
        };

        System.out.println(griddy[1][2]); //starts counting from 0

        String[][] tecksts = new String[2][3];
        tecksts[0][1] = "hi there";
        System.out.println(tecksts[0][1]);

        for(int i = 0; i < griddy.length; i++) {

            for(int x = 0; x < griddy[i].length; x++) {
                System.out.print(griddy[i][x] + "\t");
            }
            System.out.println();
        }
    }
}
