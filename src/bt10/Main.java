package bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Tìm chuỗi không lặp lại các ký tự và chuỗi con có độ dài lớn nhất
        String longestSubstring = findLongestUniqueSubstring(input);

        // Hiển thị kết quả
        System.out.println("Chuỗi con không lặp lại các ký tự có độ dài lớn nhất: " + longestSubstring);
    }

    // Hàm tìm chuỗi không lặp lại các ký tự và chuỗi con có độ dài lớn nhất
    private static String findLongestUniqueSubstring(String input) {
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Nếu ký tự hiện tại không xuất hiện trong chuỗi con hiện tại
            if (currentSubstring.indexOf(currentChar) == -1) {
                currentSubstring += currentChar;
                // So sánh độ dài chuỗi hiện tại với chuỗi lớn nhất đã tìm được
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
            } else {
                // Nếu ký tự đã tồn tại trong chuỗi con hiện tại,
                // thì bắt đầu từ vị trí ký tự đó tạo chuỗi con mới
                currentSubstring = currentSubstring.substring(currentSubstring.indexOf(currentChar) + 1) + currentChar;
            }
        }

        return longestSubstring;
    }
}
