import com.firebase.client.*;
import java.util.*;
import java.util.concurrent.*;

public class Driver {

        public static void main(String[] args) throws InterruptedException {
            
            SPOTDBcommunication zone1 = new SPOTDBcommunication("zone1");
            SPOTDBcommunication zone2 = new SPOTDBcommunication("zone2");
            SPOTDBcommunication zone3 = new SPOTDBcommunication("zone3");

            while(true){
                zone1.update(1, Math.random() * 30, Math.random() * 500);
                zone2.update(2, Math.random() * 30, Math.random() * 500);
                zone3.update(3, Math.random() * 30, Math.random() * 500);
                // Thread.sleep(2000);
                // zone1.remove(10000);
                // zone2.remove(10000);
                // zone3.remove(10000);
                Thread.sleep(5000);
            }
            
    }

}