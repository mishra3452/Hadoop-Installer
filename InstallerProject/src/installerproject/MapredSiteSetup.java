package installerproject;

import java.io.*;
public class MapredSiteSetup
{
public static void mapredsitesetup()
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /home/hadoop/Desktop/HadoopUser/MapredSiteSetup.sh");
ProcessBuilder pb = new ProcessBuilder("/home/hadoop/Desktop/HadoopUser/MapredSiteSetup.sh");
Process p = pb.start();
BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
String line = null;
 while ((line = reader.readLine()) != null)
 {
System.out.println(line);
 }
 }
catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
