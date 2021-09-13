

class MinMaxFinder{
    static class UpperAndLowerBound{

        private int min;
        private int max;
    }

    static UpperAndLowerBound getMinAndMaxOfArray(int[] arr, int size) {
        UpperAndLowerBound c = new UpperAndLowerBound();
        int i;

        if (size == 1) {
            c.min = arr[0];
            c.max = arr[0];
            return c;
        }

        if (arr[0] > arr[1]) {
            c.max = arr[0];
            c.min = arr[1];
        } else {
            c.max = arr[1];
            c.min = arr[0];
        }

        for (i = 2; i < size; i++) {
            if (arr[i] > c.max) {
                c.max = arr[i];
            } else if (arr[i] < c.min) {
                c.min = arr[i];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        UpperAndLowerBound c;
        c = getMinAndMaxOfArray(arr, size);
        System.out.printf("\nminimum is %d", c.min);
        System.out.printf("\nmaximum is %d", c.max);
    }
}