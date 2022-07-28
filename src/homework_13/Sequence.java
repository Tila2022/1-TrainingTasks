package homework_13;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        int[] filterArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (condition.isOk(array[i])) {
                filterArray[i] = array[i];
            }
        }
        return filterArray;
    }
}