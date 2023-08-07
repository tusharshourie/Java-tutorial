public class introtoarrays {
    public static void main(String[] args) {
        // int [] marks = new int[5];       //method 1

        // int [] marks;
        // marks = new int[5];              //method 2

        // marks[0] = 100;
        // marks[1] = 50;
        // marks[2] = 89;
        // marks[3] = 69;
        // marks[4] = 55;

        // int [] marks = { 33, 56, 34, 69, 42};    // method 3
        // System.out.println(marks.length);       // gives array length


        // float [] marks1 = { 33, 56, 34, 69, 42};
        // System.out.println(marks1[2]); 

        // String [] students = {"tushar", "teo", "kair"};
        // System.out.println(students.length);

        // int [] num = { 98, 79, 44, 58, 23, 9};
        // int n = num.length;
        // System.out.println("PRINTING USING FOR LOOP");
        // for(int i=0; i<n; i++){
        //     System.out.printf("%d and %d \n", i, num[i]);
        // }

        //for each loop
        // for(int element: num){
        //     System.out.println(element);
        // }

        System.out.println("MULTIDIMENSIONAL ARRAY");
        int [][] flats;
        flats = new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;
        for(int i =0; i<flats.length; i++)
        {
            for(int j =0; j<flats[i].length; j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
