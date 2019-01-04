import java.io.*;
public class Untar
{
public static void main(String [] args)
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /root/Desktop/HadoopInstaller/untar.sh");
ProcessBuilder pb = new ProcessBuilder("/root/Desktop/HadoopInstaller/untar.sh");
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
