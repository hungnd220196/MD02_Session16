package bt5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo mảng từ hàm đã cho
        Integer[] arr = getArr();

        // Bước 2: Nhập hai số min và max từ bàn phím
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        // Bước 3: Tìm vị trí của số lớn hơn gần nhất với min và nhỏ hơn gần nhất với max
        int indexMin = binarySearch(arr, min);
        int indexMax = binarySearch(arr, max);

        // Bước 4: In ra số lượng số tìm thấy và chi tiết số đó
        int count = indexMax - indexMin - 1; // Số lượng số trong khoảng
        System.out.println("Số lượng số trong khoảng [" + min + ", " + max + "]: " + count);
        System.out.println("Các số trong khoảng:");
        for (int i = indexMin + 1; i < indexMax; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Hàm trả về mảng ngẫu nhiên đã sắp xếp
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // Phương thức thực hiện tìm kiếm nhị phân trong mảng đã sắp xếp
    public static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra xem phần tử ở giữa có phải là số cần tìm không
            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1; // Nếu số ở giữa nhỏ hơn số cần tìm, loại bỏ nửa bên trái của mảng
            } else {
                right = mid - 1; // Nếu số ở giữa lớn hơn số cần tìm, loại bỏ nửa bên phải của mảng
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy số trong mảng
    }
}
