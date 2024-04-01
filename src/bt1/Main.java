package bt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng số nguyên ngẫu nhiên từ 0 đến 99
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        // Bước 2: In ra mảng số nguyên đó
        System.out.println("Mảng số nguyên: " + Arrays.toString(arr));

        // Bước 3: Cài đặt thuật toán tìm kiếm tuyến tính để tìm số lớn nhất
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Bước 4: In số lớn nhất ra
        System.out.println("Số lớn nhất trong mảng: " + max);
    }
}
