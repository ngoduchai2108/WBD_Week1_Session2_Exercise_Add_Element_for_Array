import java.util.Scanner;

public class addElementForArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        //Enter value  for elements of array to element 8
        int size;
        do{
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size >= array.length){
                System.out.println("size wrong. You Enter size!!!");
            }
        }while (size >= array.length);

        for (int i = 0; i < size; i++){
            System.out.println("Enter Element "+(i+1)+" is:");
            array[i] = scanner.nextInt();
        }
        //Show Array
        System.out.print("Array is: ");
        for (int element:array){
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        // Add element for array
        int index;
        int value;
        System.out.println("Enter position you want add into array");
        index = scanner.nextInt();
        System.out.println("Enter element value you want add into array");
        value = scanner.nextInt();
        for (int i = size; i >= index; i--){
            array[i] = array[i-1];
        }
        array[index-1] = value;

        // Show array new
        System.out.print("Array new is: ");
        for (int element:array){
            System.out.print(element+"\t");
        }
    }
}
