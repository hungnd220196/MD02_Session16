package bt11;

import java.util.List;

public class Sorting {
    // Bubble Sort
    public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    // swap teams[j] and teams[j+1]
                    FootballTeam temp = teams.get(j);
                    teams.set(j, teams.get(j + 1));
                    teams.set(j + 1, temp);
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }
            // swap teams[i] and teams[maxIndex]
            FootballTeam temp = teams.get(maxIndex);
            teams.set(maxIndex, teams.get(i));
            teams.set(i, temp);
        }
    }

    // Insertion Sort
    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; ++i) {
            FootballTeam key = teams.get(i);
            int j = i - 1;

            // Di chuyển các phần tử của teams[0..i-1] > key về sau một vị trí
            // lớn hơn vị trí hiện tại của chúng
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }

    // Utility function to print a list of football teams
    public static void printTeams(List<FootballTeam> teams) {
        for (FootballTeam team : teams) {
            System.out.println("ID: " + team.getId() + ", Name: " + team.getName() + ", Score: " + team.getScore());
        }
    }


}
