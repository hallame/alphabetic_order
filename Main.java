import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        String names[] = {"Said", "Ivan", "Marina", "Sid", "Maria", "Peter"};
        String temp;
        int n = names.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("The names in alphabetical order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}


//                String names[] = new String[]{"Said", "Ivan", "Marina", "Sid", "Maria", "Peter"};
//                int n = names.length;
//                Arrays.sort(names);
//
//                System.out.println("The names in alphabetical order are: ");
//                for (int i = 0; i < n; i++) {
//                    System.out.println(names[i]);
//                }
//            }
//        }




// or 



//public class Main {
//            static boolean checkSorted(int n, int arr[])
//            {
//
//                int first = 0, second = 0;
//                int count = 0;
//                for (int i = 1; i < n; i++)
//                {
//                    if (arr[i] < arr[i - 1])
//                    {
//                        count++;
//                        if (first == 0)
//                            first = i;
//                        else
//                            second = i;
//                    }
//                }
//
//                if (count > 2)
//                    return false;
//                if (count == 0)
//                    return true;
//
//                // Cases like {1, 5, 3, 4, 2}
//                // We swap 5 and 2.
//                if (count == 2)
//                    swap(arr, first - 1, second);
//
//                    //  {1, 2, 4, 3, 5}
//                else if (count == 1)
//                    swap(arr, first - 1, first);
//
//
//                for (int i = 1; i < n; i++)
//                    if (arr[i] < arr[i - 1])
//                        return false;
//
//                return true;
//            }
//
//            static int[] swap(int []arr, int i, int j)
//            {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                return arr;
//            }
//
//            // Driver Code
//            public static void main(String[] args)
//            {
//                int arr[] = { 3, 4, 2, 1 };
//                int n = arr.length;
//                if (checkSorted(n, arr))
//                    System.out.println("Yes");
//                else
//                    System.out.println("No");
//            }
//        }
//
//
//
//
