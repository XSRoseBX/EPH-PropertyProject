import java.util.*;

public class DetailsOfBuilding extends PropertyProject {
    private boolean gardenExists;
    private int numberRooms;
    private int floors;
    private String[] rooms;

    public DetailsOfBuilding(String address, double width, double length,
                             boolean gardenExists, int numberRooms, int floors, String[] rooms) {
        super(address, width, length);
        this.gardenExists = gardenExists;
        this.numberRooms = numberRooms;
        this.floors = floors;
        this.rooms = rooms;
        if (rooms.length != numberRooms) {
            this.rooms = new String[] {"incomplete list, deleted"};
        }
    }
    public boolean getGardenExists() {
        return gardenExists;
    }
    public int getNumberRooms() {
        return numberRooms;
    }
    public int getFloors() {
        return floors;
    }
    public String getRooms() {
       return Arrays.toString (rooms);
    }
    public String getInfo() {
        String gardenThere = "is not included";
        if (getGardenExists()) {
            gardenThere = "is included";
        }
        return "This house is located in " + getAddress() +
                ". \nIt has a space of " + getSize() + "m² with " + getNumberRooms() + " rooms on " + getFloors() + " floor(s)."
                + "\nListed, these rooms would be: " + getRooms() +
                "\nA garden " + gardenThere;
    }
}
