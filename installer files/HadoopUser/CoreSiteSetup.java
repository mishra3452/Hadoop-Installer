import java.io.*;
public class CoreSiteSetup
{
public static void main(String [] args)
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /home/hadoop/Desktop/HadoopUser/CoreSiteSetup.sh");
ProcessBuilder pb = new ProcessBuilder("/home/hadoop/Desktop/HadoopUser/CoreSiteSetup.sh");
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
