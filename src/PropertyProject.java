public class PropertyProject {
    private String address;
    private double width;
    private double length;

    public PropertyProject(String adr, double w, double l){
        address = adr;
        width = w;
        length = l;
    }

    public String getAddress(){
        return address;
    }

    public double getSize() {
        return length*width;
    }
}
