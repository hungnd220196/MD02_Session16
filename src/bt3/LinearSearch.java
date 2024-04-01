package bt3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo mảng cho sẵn phần tử
        int[] arr = {1,2,3,4,5,6,7,8};

        // Bước 2: Nhập số cần tìm từ bàn phím
        System.out.print("Nhập số cần tìm trong mảng: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm tuyến tính và in ra vị trí nếu có
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí " + i);
                found = true;
                break; // Thoát vòng lặp nếu đã tìm thấy số cần tìm
            }
        }

        // Hiển thị thông báo nếu không tìm thấy số trong mảng
        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }
}

