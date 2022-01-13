package Arrays.Exercise1;

public class ArraysExercise1 {
    public static void main(String[] args) {
        
    
    int[] numbers = {1,2,3,4,5};
    double sum = 0.0;
    for(int number:numbers){
        sum=(1/number)+sum;//Calculate sum of harmonic numbers
    } 
    System.out.println(sum/numbers.length);//Average of array
}
}