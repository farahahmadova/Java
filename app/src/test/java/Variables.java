import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println(5 *2);
        int x=30;
        int y=10;
        y=2;
        //y="Farah" string veremeyiz
        System.out.println(x/y);
        String name="Farah";
        String surname="Ahmadova";
        String fullname= name + " " + surname;
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);
        double pi=3.14;
        int r=5;
        System.out.println(pi*2*r);
        boolean isalive= true;
        isalive=false;
        System.out.println(isalive);
        final int myInteger =5;
        System.out.println("myInteger:"+ myInteger);
        //myInteger=4;
        System.out.println("myInteger:"+ myInteger);
    }
}
