import java.util.Random;

public class ReverseArray {
    public static int[] reverseRandomArray(int sizeArray) {
        //создаем массив и заполняем его случайными значениями
        int[] originalArray = new int[sizeArray];
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < sizeArray; i++) {
            originalArray[i] = random.nextInt(0, 100);
            System.out.print(originalArray[i] + " ");
        }

        //создаем обратный массив
        System.out.println("\nМассив в обратном порядке:");
        int[] reverseArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            reverseArray[i] = originalArray[sizeArray-1-i];
            System.out.print(reverseArray[i] + " ");
        }

        System.out.println();
        return reverseArray;
    }
}
