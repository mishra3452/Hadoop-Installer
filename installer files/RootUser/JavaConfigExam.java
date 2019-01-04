import java.io.*;
public class JavaConfigExam
{
public static void main(String [] args)
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /root/Desktop/HadoopInstaller/javaconfig.sh");
ProcessBuilder pb = new ProcessBuilder("/root/Desktop/HadoopInstaller/javaconfig.sh");
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
