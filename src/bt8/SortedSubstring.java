package bt8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Chuyển chuỗi thành mảng kí tự và sắp xếp
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        // Chuyển mảng kí tự đã sắp xếp thành chuỗi mới
        String sortedSubstring = new String(charArray);

        // Hiển thị chuỗi mới đã sắp xếp
        System.out.println("Chuỗi kí tự con được sắp xếp theo thứ tự tăng dần: " + sortedSubstring);
    }
}
