package installerproject;

import java.io.*;
public class AddUserExam
{
public static void adduserexam()
{
try
        {
Process r = Runtime.getRuntime().exec("chmod 777 /root/Desktop/HadoopInstaller/adduserExam.sh");
ProcessBuilder pb = new ProcessBuilder("/root/Desktop/HadoopInstaller/adduserExam.sh");
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
