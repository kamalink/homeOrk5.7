package module5.homeOrk7;

import module5.homeOrk1and2.Room;
import module5.homeOrk3.API;
import module5.homeOrk6.Controller;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Room[]result;
        Controller control = new Controller();
        result = control.requstRooms(20,3,"Marseille", "Sofitel");
        System.out.println(Arrays.toString(result));

        result = control.requstRooms(12,9, "Itaituba", "Sao Tome");
        System.out.println(Arrays.toString(result));


        System.out.println("Check similar rooms in different APIes:");
        API[]apiArray = control.getApis();
        result = control.check(apiArray[0], apiArray[1]);
        System.out.println(Arrays.toString(result));

        result = control.check(apiArray[0], apiArray[2]);
        System.out.println(Arrays.toString(result));

        result = control.check(apiArray[2], apiArray[1]);
        System.out.println(Arrays.toString(result));

        System.out.println("Processing with DB:");

        result = control.dataBase.getAll();
        System.out.println(Arrays.toString(result));

    }
}
