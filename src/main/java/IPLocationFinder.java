import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
public class IPLocationFinder {
    public static void main(String[] args) throws IOException {

             System.out.println("read ip");
             BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/foureverhh/soap/IPLocationFinder/src/main/resources/ip.txt"));
             String ipAddress = reader.readLine();
             GeoIPService ipService = new GeoIPService();
             GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
             String location = geoIPServiceSoap.getIpLocation(ipAddress);
             System.out.println("location is " + location);
             String countryName = location.substring(16,18);
             String code = location.substring(35,37);
             System.out.println(countryName);
             System.out.println(code);
        // }
    }
}
*/