package castle;

public class Room {
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    public String getExitDesc() 
    {
        StringBuilder sb = new StringBuilder("Exits: ");
        if(northExit != null)
            sb.append("north");
        if(eastExit != null)
            sb.append("east");
        if(southExit != null)
            sb.append("south");
        if(westExit != null)
            sb.append("west");
       return sb.toString();
    }


    @Override
    public String toString()
    {
        return description;
    }
}
