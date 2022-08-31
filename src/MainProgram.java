public class MainProgram {
    public static void main (String[] args){
        PropertyProject p = new PropertyProject("Erzbergerstr.1", 23, 24.5);
        System.out.println(p.getAddress());
        System.out.println(p.getSize() + "m²");

        PropertyProject p1= new PropertyProject( "Nussbaumweg 85", 100, 100);
        System.out.println(p.getAddress());
        System.out.println(p.getSize() + "m²");

        PropertyProject p2= new PropertyProject( "Werderstr. 14", 100, 100);

        PropertyProject p3= new PropertyProject( "Jasminastr. 9", 100, 100);

        //Erweitern um Objekte der Klasse Person


    }