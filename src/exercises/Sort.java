package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Sort {

	
	// TODO Auto-generated method stub

	/** Sort the array a[] in ascending order
     ** using an insertion sort.
     */
    static void sort(int a[], int size) {
        for (int i = 1; i < size; i++) {
            // a[0..i-1] is sorted
            // insert a[i] in the proper place
            int x = a[i];
            int j;
            for (j = i-1; j >=0; --j) {
                if (a[j] <= x)
                    break;
                a[j+1] = a[j];
            }
            // now a[0..j] are all <= x
            // and a[j+2..i] are > x
            a[j+1] = x;
        }
    }
    
    private static void usage() {
    	System.out.println("usage: sort array-size");
        System.exit(1);
    }

    /** Test program to test sort */
    public static void main(String argv[]) {
     /*   if (argv.length < 2) {
           usage();
        }
      //  int size = Integer.parseInt(argv[0]);
/*        if (size != argv.length-1){
        	usage();
        }
       
        File here = new File(".");
    	System.out.println(here.getAbsolutePath());*/
        try{
        	Scanner scanner = new Scanner(new File("C:\\Users\\gozde\\workspace\\exercises\\conf\\parameters.txt"));
        	int size = scanner.nextInt();
        	int test[] = new int[size];
        	
        	int i=0;
        	while(scanner.hasNextInt()){
        		test[i++] = scanner.nextInt();
        	}
        	System.out.println("before");
        	for (i = 0; i < size; i++)
                System.out.print(" " + test[i]);
            System.out.println();

            sort(test, size);
            
            System.out.println("after");
            for (i = 0; i < size; i++)
                System.out.print(" " + test[i]);
            System.out.println();

        	
        }
       catch(FileNotFoundException ex){
        	System.out.println("file not found");
       }
       catch(IOException ex){
        	
       }

   //      for (int i = 0; i < size; i++)
    //        test[i] = Integer.parseInt(argv[i+1]);
       
        System.exit(0);
    }
}


