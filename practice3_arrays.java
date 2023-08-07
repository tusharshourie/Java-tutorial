public class practice3_arrays {
    public static void main(String[] args) {

        //Question 1= sum of all the elements of a float array
        // float [] num = {1.6f, 2.2f, 3.4f, 4.65f, 5.0f};
        // float sum =0;
        // for (float f : num) {
        //     sum=sum+f;
        // }
        // System.out.printf("The value of sum is %f", sum);

        //QUESTION 2 = TO find whether a given interger is present in an array or not
        // int [] marks = {1, 233, 32, 41, 59, 67};
        // int m1 = 59;
        // boolean isInArray = false;
        // for (int i : marks) {
        //     if(i==m1){
        //     isInArray = true;
        //     break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("the element is present inside the array");
        // }
        // else{
        //     System.out.println("the element is not present inside the array");
        // }

        //QUESTION 3 = calc the avg marks of all students in phy using for each loop
        // float [] marks = {1.6f, 2.2f, 3.4f, 4.65f, 5.0f};
        // float sum =0;
        // float avg=1;
        // for (float f : marks) {
        //     sum=sum+f;
        //     avg= sum/marks.length;
        // }
        // System.out.printf("The value of sum is %f \n", sum);
        // System.out.printf("The value of avg marks is: %f", avg);

        //QUESTION 4 = to add two matrices of 2x3
        // int [][] mat1 ={ {1, 2, 3},
        //                  {4, 5, 6}};
        
        // int [][] mat2 ={ {7, 8, 9},
        //                  {10, 11, 12}};
        
        // int [][] result ={ {0, 0, 0},
        //              {0, 0, 0}};
        
        // for(int i = 0; i<mat1.length; i++){   //row no. of times
        //     for(int j =0; j<mat1[i].length; j++){  //col no. of times
        //         result[i][j]= mat1[i][j]+ mat2[i][j];
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

    
        //QUESTION 5 = reverse an array
        // int [] arr = {1, 2, 3, 4, 5, 6};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // for(int i=0; i<n; i++){
        //     //SWAP a[i] and a[l-i-1]
        //     int temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }
        // for (int i : arr) {
        //     System.out.println(i);
        // }

        //QUESTION 6 = max element in an array
        // int [] arr = {190, 222, 378, 412, 553, 666};
        // int max=0;
        // for (int i : arr) {
        //     if(i>max){
        //         max=i;
        //     }
        // }
        // System.out.printf("the max element in this array is: %d", max);

        //QUESTION 7 = FIND WHETHER ARRAY IS SORTED OR NOT
        int [] arr = {190, 22, 36, 43, 55, 76};
        boolean isSorted=true;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
