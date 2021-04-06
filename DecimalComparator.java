public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2){
        double nums1 = parameter1 * 1000;
        double nums2 = parameter2 * 1000;

        int num1 = (int)nums1;
        int num2 = (int) nums2;

        if(num1 == num2){
            return true;
        }
        else {
            return false;
        }
    }
}
