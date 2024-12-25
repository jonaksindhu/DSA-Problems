public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        if (len == 0) { // Check if the array is empty
            return;
        }
        k = k % len; // Handle cases where k > len

        reverse(nums, 0, len - 1); // Reverse the entire array
        reverse(nums, 0, k - 1);   // Reverse the first k elements
        reverse(nums, k, len - 1); // Reverse the rest
    }

    public void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();

        // Test Case 1: Basic rotation
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotateArray.rotate(nums1, k1);
        System.out.println("Test Case 1: " + arrayToString(nums1)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        // Test Case 2: Rotate by array length
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 5;
        rotateArray.rotate(nums2, k2);
        System.out.println("Test Case 2: " + arrayToString(nums2)); // Expected: [1, 2, 3, 4, 5]

        // Test Case 3: Rotate by more than array length
        int[] nums3 = {10, 20, 30, 40, 50};
        int k3 = 8;
        rotateArray.rotate(nums3, k3);
        System.out.println("Test Case 3: " + arrayToString(nums3)); // Expected: [40, 50, 10, 20, 30]

        // Test Case 4: Single element array
        int[] nums4 = {100};
        int k4 = 3;
        rotateArray.rotate(nums4, k4);
        System.out.println("Test Case 4: " + arrayToString(nums4)); // Expected: [100]

        // Test Case 5: Empty array
        int[] nums5 = {};
        int k5 = 2;
        rotateArray.rotate(nums5, k5);
        System.out.println("Test Case 5: " + arrayToString(nums5)); // Expected: []
    }

    // Helper method to convert array to string
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
