package bt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 2: Tạo mảng 2 chiều và gán giá trị từ hàm getArr()
        int[][] arr = getArr();

        // Bước 3: Nhập số từ bàn phím để tìm kiếm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Bước 4: Sử dụng thuật toán tìm kiếm và in ra kết quả
        boolean found = searchArray(arr, target);
        System.out.println(found ? "Số đã được tìm thấy." : "Số không tồn tại trong mảng.");
    }

    // Bước 1: Hàm tìm kiếm trả về true nếu số được tìm thấy, ngược lại trả về false
    private static boolean searchArray(int[][] arr, int target) {
        // Khởi tạo List để lưu vị trí của số trong mảng
        List<Integer> rowIndexes = new ArrayList<>();
        List<Integer> colIndexes = new ArrayList<>();

        // Biến kiểm tra số có tồn tại trong mảng hay không
        boolean found = false;

        // Duyệt qua tất cả phần tử của mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Nếu số được tìm thấy, thêm vị trí vào List và đặt biến found = true
                if (arr[i][j] == target) {
                    rowIndexes.add(i);
                    colIndexes.add(j);
                    found = true;
                }
            }
        }

        // In ra các vị trí nếu số được tìm thấy
        if (found) {
            System.out.print("Vị trí của số " + target + " trong mảng: ");
            for (int k = 0; k < rowIndexes.size(); k++) {
                System.out.print("(" + rowIndexes.get(k) + "," + colIndexes.get(k) + ") ");
            }
            System.out.println();
        }

        // Trả về kết quả
        return found;
    }

    // Hàm trả về mảng 2 chiều 20x20 với các phần tử ngẫu nhiên từ 0 đến 99
    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
}

