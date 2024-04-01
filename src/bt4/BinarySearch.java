package bt4;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo mảng cho sẵn phần tử (lưu ý nhập đừng thứ tự tăng dần)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Mảng đã được sắp xếp tăng dần

        // Bước 2: Nhập số cần tìm từ bàn phím
        System.out.print("Nhập số cần tìm trong mảng: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm nhị phân và in ra vị trí nếu có
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        } else {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + result);
        }
    }

    // Phương thức thực hiện tìm kiếm nhị phân trong mảng đã sắp xếp
    public static int binarySearch(int[] arr, int target) {
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
