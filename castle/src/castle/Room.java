package castle;

import java.util.HashMap;
import java.util.Map;

public class Room {
    public String description;
    private Map<String, Room> exits = new HashMap<String, Room>(); // 动态存储出口方向和对应房间

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String direction, Room room) 
    {
        if (direction != null && room != null) {
            exits.put(direction, room); // 动态添加出口方向和房间
        }
    }

    public String getExitDesc() 
    {
        if (exits.isEmpty()) {
            return "No exits available.";
        }

        StringBuilder sb = new StringBuilder("");
        for (String direction : exits.keySet()) {
            sb.append(direction).append(" ");
        }
        return sb.toString().trim(); // 去掉末尾多余的空格
    }

    public Room getRoom(String direction) {
        return exits.get(direction); // 从 Map 中直接获取房间
    }


    @Override
    public String toString()
    {
        return description;
    }
}
