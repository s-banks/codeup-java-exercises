import java.util.Scanner;

public class MethodsExercises {

//    public static int getDifference (int num1, int num2) {
//        return num1-num2;
//    }
//
//        public static int getAdd ( int num1, int num2) {
//            return num1 + num2;
//        }
//
//            public static long getmultiply ( long num1, long num2) {
//                return num1 * num2;
//            }
//
//                public static double getDivide ( double num1, double num2) {
//                    return num1 / num2;
//                }
	//
	//public static int modulus ( int num1, int num2) {
// return num1 % num2;
//}

//    public static int getInteger(int min, int max);
//        System.out.format("Please enter an interger value from one to ten.");
//    Scanner scanner = new Scanner(System.in);

	// public static void main(String[] args) {
//                        System.out.println(getDifference(10, 5));
//                        System.out.println(getAdd(10, 5));
//                        System.out.println(getmultiply(10, 5));
//                        System.out.println(getDivide(10, 5));
//                        System.out.println(getDivide(10, 0));
//                        System.out.println(modulus(10, 0));

//        public static void main(String []args){
//            Scanner in = new Scanner(System.in);
//            int result;
//            do {
//                System.out.println("Enter a number between 1 and 10: ");
//                result = in.nextInt();
//            } while(result < 0 || result > 10);
//            System.out.println("correct "+ result);
//        }

	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		long result;
		do {
			System.out.println("Enter a number between 1 and 10: ");
			result = in.nextInt();
		} while(result < 0 || result > 10);

	}


}
