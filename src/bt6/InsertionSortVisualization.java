package bt6;

import java.util.Scanner;

public class InsertionSortVisualization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Hiển thị mảng trước khi sắp xếp
        System.out.println("Mảng trước khi sắp xếp:");
        displayArray(arr);

        // Sắp xếp mảng bằng thuật toán sắp xếp chèn
        insertionSort(arr);

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        displayArray(arr);
    }

    // Phương thức sắp xếp mảng bằng thuật toán sắp xếp chèn
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Hiển thị mảng sau mỗi lượt sắp xếp
            System.out.println("Bước " + i + ":");
            displayArray(arr);
        }
    }

    // Phương thức hiển thị mảng
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


