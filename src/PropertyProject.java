public class PropertyProject {
    private String address;
    private double width;
    private double length;

    public PropertyProject(String address, double width, double length){
        this.address = address;
        this.width = width;
        this.length = length;
    }

    public String getAddress() {
        return address;
    }
    public double getSize() {
        return width*length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
}
