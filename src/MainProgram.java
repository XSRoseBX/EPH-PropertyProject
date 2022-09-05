public class MainProgram {
    public static void main(String[] args) {
        DetailsOfBuilding firstBuilding = new DetailsOfBuilding ("Frohlinderstr. 99", 20, 10,
                true, 17, 3, new String[] {"bedroom", "bedroom", "bedroom", "bedroom",
                "bedroom", "bedroom", "bathroom", "bathroom", "bathroom", "bathroom", "kitchen", "kitchen",
                "storing room", "storing room", "storing room", "storing room", "working room"});
        System.out.println (firstBuilding.getInfo());

    }
}