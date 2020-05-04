public class SelectionSort {

    public static void selectionSort(int[] array){
        for (int i =0; i<array.length; i++){
            int minimumValue = i;
            for (int j=i+1; j<array.length; j++){
                if (array[minimumValue] > array[j]){
                    minimumValue = j;
                }
            }
            if (minimumValue != i){
                int aux = array[i];
                array[i] = array[minimumValue];
                array[minimumValue] = aux;
            }
        }
    }

    public static void selectionSort(char[] array){
        for (int i =0; i<array.length; i++){
            int minimumValue = i;
            for (int j=i+1; j<array.length; j++){
                if (array[minimumValue] > array[j]){
                    minimumValue = j;
                }
            }
            if (minimumValue != i){
                char aux = array[i];
                array[i] = array[minimumValue];
                array[minimumValue] = aux;
            }
        }
    }
}
