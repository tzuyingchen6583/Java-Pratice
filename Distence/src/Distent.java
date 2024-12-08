import java.util.HashMap;
import java.util.Map;

class Distent {
    String[] cities = {"NewYork", "LosAngeles", "Chicago", "Miami", "Houston", "Phoenix", "SanFrancisco", "Seattle", "Denver", "Atlanta"};
    int[][] distances = {
        {0, 2800, 800, 1200, 1600, 2400, 3000, 2850, 1500, 850},      // NewYork
        {2800, 0, 1400, 2300, 1200, 2100, 2700, 2600, 1300, 700},     // LosAngeles
        {800, 1400, 0, 1300, 900, 1700, 2400, 2300, 1100, 600},       // Chicago
        {1200, 2300, 1300, 0, 900, 1800, 2500, 2400, 1200, 650},      // Miami
        {1600, 1200, 900, 900, 0, 1400, 2000, 1900, 900, 500},        // Houston
        {2400, 2100, 1700, 1800, 1400, 0, 800, 850, 500, 250},        // Phoenix
        {3000, 2700, 2400, 2500, 2000, 800, 0, 350, 400, 200},        // SanFrancisco
        {2850, 2600, 2300, 2400, 1900, 850, 350, 0, 750, 300},        // Seattle
        {1500, 1300, 1100, 1200, 900, 500, 400, 750, 0, 400},         // Denver
        {850, 700, 600, 650, 500, 250, 200, 300, 400, 0}              // Atlanta
    };

    // 创建城市到索引的映射
    public Map<String, Integer> getMap(){
        Map<String, Integer> cityIndexMap = new HashMap<>();
        for (int i = 0; i < cities.length; i++) {
            cityIndexMap.put(cities[i], i);
        }
        return cityIndexMap;
    }
}
