package javaapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaMap {
    public static void main(String[] args) {
        number1();
        number2();
        number3();
        number4();
        number5();
        number6();
        number7();
        number8();
    }
    
    public static void number1() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Aestherielle");
        nameList.add("Reniella");
        nameList.add("Thraia");
        nameList.add("Klare");
        nameList.add("Eurydice");
        
        System.out.println("\t' 1.SORTING A GIVEN ARRAY LIST '");
        Collections.sort(nameList);
        System.out.println("Sorted Array Ascending: \n\t" + nameList);

        Collections.sort(nameList, Collections.reverseOrder());
        System.out.println("\nSorted Array Descending: \n\t" + nameList);
        
        System.out.println("\n    ---------------------------------------------\n");
    }

    public static void number2(){
        List<String> nameList = new ArrayList<String>();
        nameList.add("Zamiel");
        nameList.add("Josiah");
        nameList.add("Lienzo");
        nameList.add("Elijah");
        nameList.add("Vincent");
        
        System.out.println("\t' 2.RANDOM ARRAY SORTING '");
        Collections.shuffle(nameList);
        System.out.println("Random Sorted Array: \n\t" + nameList);
        
        System.out.println("\n    ---------------------------------------------\n");
    }
    
    public static void number3(){
        
        System.out.println("\t' 3.MOVING MINIMUM VALUE OF LIST TO THE FRONT '");
        
        System.out.println("\n    ---------------------------------------------\n");
    }
    
    public static void number4(){
        
        System.out.println("\t' 4.isEmpty() VS size '");
        
        System.out.println("    The following are the reasons why we should opt for isEmpty() than size():\n"
                + "\t~ isEmpty() is more expressive (the code's easier to read and maintain);\n"
                + "\t~ faster, in some cases by orders of magnitude");
        
        System.out.println("\n    ---------------------------------------------\n");
    }
    
    public static void number5(){
        
        System.out.println("\t' 5.COMPARE AND CONTRAST CLASSIC for loop VS foreach '");
        System.out.println("COMPARISON:\n"
                + "     for loop:\n"
                + "\t   1.Executes based on the condition mentioned within for loop\n"
                + "\t   2.We can specify the increment or decrement counter variable.\n"
                + "\t   3.We can access array elements based on index value\n"
                + "\t   4.Able to iterate forward and reverse direction\n"
                + "\t   5.Available from JDK 1 onwards\n"
                + "\t   6.Can be used for any type like integer,strings, collection, array.\n"
                + "     foreach:\n"
                + "\t   1.Does not have any condition specified\n"
                + "\t   2.It automatically increments by 1 and we cannot specify the same\n"
                + "\t   3.We cannot access elements based on index value\n"
                + "\t   4.Able to iterate only in forward direction\n"
                + "\t   5.Available from JDK 5 onwards\n"
                + "\t   6.Can be used only for array and collection type.");
        System.out.println("PROS:\n"
                + "    for loop:\n"
                + "\t   ~ You need not to specify the initialization, condition and increment\n"
                + "\t       or decrement as you specify in the normal for loop;\n"
                + "\t   ~ It increases the readability of the code\n"
                + "\t   ~ we know exactly how many times the loop will execute before the loop starts"
                + "\n       foreach:\n"
                + "\t   ~ Easy to retrieve every element in an array or collection;\n"
                + "\t   ~ More convenient and concise when reading each element, one by one and in order;\n"
                + "\t   ~ Code is more readable;\n"
                + "\t   ~ When accessing collections, 'foreach' is significantly faster than for loop’s;\n"
                + "\t   ~ Does not work on any condition or boolean expression;\n"
                + "\t   ~ Less possibility of bugs or errors.");
        System.out.println("CONS:\n"
                + "    for loop:\n"
                + "\t   ~ Test if the program ever enters the loop and not needed if ever not,\n"
                + "\t       and is bad for code readability\n"
                + "\t   ~ Probably neeed to do some boundary-value analysis to check if the,\n"
                + "\t       boundary values are properly selected if such values are involved in\n"
                + "\t       the condition of a loop.\n"
                + "\t   ~ Executing more iterations than needed is a performance issue."
                + "\n       foreach loop:\n"
                + "\t   ~ Cannot retrieve elements based on an index;\n"
                + "\t   ~ It is not possible to traverse in reverse order;\n"
                + "\t   ~ Cannot modify array element values\n");
                
        System.out.println("\n    ---------------------------------------------\n");
    }

     public static void number6() {
        System.out.println("\t' 6.COMPARE AND RETURN COMMON VALUES OF 2 SETS '");
        
        Set<String> arr_set1 = new HashSet<String>();
        arr_set1.add("One");
        arr_set1.add("Two");
        arr_set1.add("Three");
        arr_set1.add("Four");
        
        System.out.println("First Set: " + arr_set1);

        Set<String> arr_set2 = new HashSet<String>();
        arr_set2.add("Five");
        arr_set2.add("Two");
        arr_set2.add("Six");
        arr_set2.add("Four");
        
        System.out.println("Second Set: " + arr_set2);
        
        Set<String> intersection = new HashSet<String>(arr_set1);
        arr_set1.retainAll(arr_set2);
        intersection.retainAll(arr_set2);

        System.out.println("First Set that intersects Second Set: " + intersection);
        
        System.out.println("\n    ---------------------------------------------\n");
    }

    public static void number7() {
        System.out.println("\t' 7.COMPARE AND RETURN UNIQUE VALUES BETWEEN 2 SETS '");
        
        Set<Integer> arr_set1 = new HashSet<Integer>();
        arr_set1.add(10);
        arr_set1.add(20);
        arr_set1.add(30);
        arr_set1.add(40);
        
        System.out.println("First Set: " + arr_set1);

        Set<Integer> arr_set2 = new HashSet<Integer>();
        arr_set2.add(20);
        arr_set2.add(30);
        arr_set2.add(50);
        arr_set2.add(60);
        arr_set2.add(10);
        
        System.out.println("Second Set: " + arr_set2);

        Set<Integer> result = new HashSet<Integer>(arr_set1);
        result.removeAll(arr_set2);
        Set<Integer> result2 = new HashSet<Integer>(arr_set2);
        result2.removeAll(arr_set1);

        result.addAll(result2);
        System.out.println("First Set that intersects Second Set: " + result);
        
        System.out.println("\n    ---------------------------------------------\n");
    }
    
    public static void number8() {
        System.out.println("\t' 8.COUNT NUMBER KEYS IN A MAP '");
        
        Map<String, String> keymap = new HashMap<String, String>();
        keymap.put("concordia", "Value given");
        keymap.put("acconcordia", "Test");
        keymap.put("condensada", "Sweet");
        System.out.println("Number of keys in a map: " + keymap.size());
        
        System.out.println("\n    ---------------------------------------------\n");
    }

   
}
