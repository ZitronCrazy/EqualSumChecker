public class EqualSumChecker {
    public static boolean hasEqualSum(int firstSum, int secondSum, int thirdSum) {

        if (firstSum + secondSum == thirdSum) {
            System.out.println(firstSum + " + " + secondSum + " equal " + thirdSum);
            return true;
        } else {
            System.out.println(firstSum + " + " + secondSum + " does not equal " + thirdSum);
            return false;
        }
    }
}
