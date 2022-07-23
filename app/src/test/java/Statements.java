public class Statements {
    public static  void main(String[] args){
        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*74;
        System.out.println(x);
        int y=4;
        System.out.println(x>y);
        System.out.println(x<y);
        y=444;
        System.out.println(x==y);
        System.out.println(x!=y);
        x=18;
        y=12;
        int z=21;
        System.out.println(x<y && y<z);
        System.out.println(x>y || y<z);
        //if statements
        if (x<y) {
            System.out.println("y is bigger");
        }
        else if (x>y){
            System.out.println("x is bigger");
        }
        else {
            System.out.println("x=y");

        }
        //switch
        int day=4;
        String dayString="";
/*
        if (day==1){
            dayString="Monday";
        }
        else if (day==2){
            dayString="Tuesday";
        }
        else if (day==3){
            dayString="Wednesday";
        }
        else {
            dayString="Sunday";
        }
        System.out.println(dayString);
        */
        switch (day){
            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Sunday";
                break;
        }
        System.out.println(dayString);

    }
}
