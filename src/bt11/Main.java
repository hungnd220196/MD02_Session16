package bt11;

import java.util.ArrayList;
import java.util.List;
import static bt11.Sorting.insertionSort;
import static bt11.Sorting.printTeams;

public class Main {
    public static void main(String[] args) {
        // Bước 2: Tạo danh sách các đội bóng và thêm các phần tử
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 80));
        teams.add(new FootballTeam(2, "Team B", 11, 75));
        teams.add(new FootballTeam(3, "Team C", 11, 90));
        teams.add(new FootballTeam(4, "Team D", 11, 85));

        // Bước 3: Gọi các hàm sắp xếp và truyền danh sách đội bóng vào để sắp xếp
        System.out.println("trước sắp xếp:");
        printTeams(teams);

        // Sắp xếp danh sách các đội bóng theo số điểm từ cao đến thấp
        // Sử dụng Insertion Sort
        insertionSort(teams);

        System.out.println("\n Sau sắp xếp: ");
        printTeams(teams);
    }
}
