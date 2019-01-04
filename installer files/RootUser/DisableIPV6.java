import java.io.*;
public class DisableIPV6
{
public static void main(String [] args)
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /root/Desktop/HadoopInstaller/disableIPV6.sh");
ProcessBuilder pb = new ProcessBuilder("/root/Desktop/HadoopInstaller/disableIPV6.sh");
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
