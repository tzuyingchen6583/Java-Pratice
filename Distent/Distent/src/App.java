import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        List<String> cities = new ArrayList<>();
        while(true){
            String city = scanner.next();
            if (city.equals("###")) { // 终止输入
                break;
            }
            cities.add(city); 
        }
        Distent distent = new Distent();
        Map<String, Integer> map = distent.getMap();
        int[][] distances = distent.distances;
        
        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < cities.size(); j++) {
                String city1 = cities.get(i);
                String city2 = cities.get(j);
                if (i != j) { // Avoid self-loops
                    int distance = distances[i][j];
                    System.out.println("From " + city1 + " to " + city2 + " -> Distance: " + distance + " km");
                } else{
                    System.out.println("From " + city1 + " to " + city2 + " -> Distance: " + 0 + " km");
                }
            }
        }
    }
}
