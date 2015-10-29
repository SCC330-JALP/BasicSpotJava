import com.firebase.client.*;
import java.util.*;
import java.util.concurrent.*;

public class History{

    private long timestamp;
    private double temp;
    private double light;
    private int zoneId;

    public History() {}

    public History(int zoneId, double temp, double light){
        this.zoneId = zoneId;
        this.temp = temp;
        this.light = light;
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp(){
        return timestamp;
    }

    public double getTemp(){
        return temp;
    }

    public double getLight(){
        return light;
    }

    public int getZoneId(){
        return zoneId;
    }
}