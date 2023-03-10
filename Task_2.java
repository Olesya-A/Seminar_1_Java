/**
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

 public class Task_2 {
 
    public static void main(String[] args) {
        int arr[] = new int[] {1,1,0,1,1,1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
    System.out.println(maxCount);

    }
 }

/**
 public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1};
        int count = 0;
        int max_count = 0;
        for(int item : arr) {
            if (item == 1) {
                count++;
                if (max_count < count) max_count = count;
            }
            else count = 0;
        }
        System.out.println("Количество повторов :"+max_count);
    }
    
    }
*/