package AddressUtility;

import java.util.Scanner;

public class Utility {

        private static final Scanner SCAN=new Scanner(System.in);

        public static int readInteger()
        {

            return SCAN.nextInt(); 		//Scanner object to input Integer
        }
        public static double readDouble()
        {
            return SCAN.nextDouble();		//Scanner object to input Double
        }
        public static long readLong()
        {
            return SCAN.nextLong();		//Scanner object to input Long
        }
        public static String readString() {
            return SCAN.nextLine();        //Scanner object to input String
        }
}
