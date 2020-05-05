public class InsertionSort {

    public static void insertionSort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++){
            int aux = array[i];
            for (j = i-1; j>=0 && aux < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = aux;
        }
    }

    public static void insertionSort(char[] array) {
        int j;
        for (int i = 1; i < array.length; i++){
            char aux = array[i];
            for (j = i-1; j>=0 && aux < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = aux;
        }
    }
}
