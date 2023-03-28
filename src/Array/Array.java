package Array;

public class Array {
    public static void main(String[] args) {
        int array[][] = new int[10][];
        for (int i =0;i< array.length;i++){
            array[i]= new int[i+1];
            System.out.println();
            for (int j = 0; j<array[i].length;j++){
                array[i][j] = i*j;
                System.out.print(array[i][j]);
            }
        }
        for (int[] elem: array) {
            for (int element:elem) {
                System.out.print(element);
                
            }

        }
    }
}
