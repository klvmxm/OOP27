package OneMoreFirm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class ZavodDva {
    public static void main(String[] args) throws IOException{

        Firm zavod = new Firm("Шарашка", "Челябинск", 50000);
        FirmMenu menu = new FirmMenu(zavod);
        menu.start();
    }

}
