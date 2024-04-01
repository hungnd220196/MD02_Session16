package bt9;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng
        Arrays.sort(array);

        // Bước 3: Nhập số cần tìm từ bàn phím
        System.out.print("Nhập số cần tìm: ");
        int value = scanner.nextInt();

        // Bước 4: Gọi hàm tìm kiếm nhị phân
        int index = binarySearch(array, 0, n - 1, value);

        // Bước 5: Hiển thị kết quả
        if (index != -1) {
            System.out.println("Số " + value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + value + " trong mảng.");
        }
    }

    // Bước 3: Khai báo hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        // Bước 8: Kiểm tra điều kiện dừng
        if (left > right) {
            return -1; // Trả về -1 nếu không tìm thấy
        }

        // Bước 4: Tính middle
        int middle = (left + right) / 2;

        // Bước 5: Kiểm tra giá trị tại vị trí middle
        if (array[middle] == value) {
            return middle; // Trả về vị trí nếu tìm thấy
        } else if (array[middle] < value) {
            // Bước 6: Đệ quy với mảng bên phải của middle
            return binarySearch(array, middle + 1, right, value);
        } else {
            // Bước 7: Đệ quy với mảng bên trái của middle
            return binarySearch(array, left, middle - 1, value);
        }
    }
}

