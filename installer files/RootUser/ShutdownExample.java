import java.io.IOException;
class MyClass
{

public static void shutdown() throws RuntimeException,IOException{
   String shutdownCommand;
    String operatingSystem = System.getProperty("os.name");
    if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
        shutdownCommand = "halt";
    }
else if ("Windows".equals(operatingSystem)) {
shutdownCommand = "shutdown -s -t 0";
}
else    
{
throw new RuntimeException("Unsupported operating system.");
}
Runtime.getRuntime().exec(shutdownCommand);
System.exit(0);
}
}
class ShutdownExample
{
public static void main(String [] arg)throws RuntimeException,IOException
{
MyClass.shutdown();
}
}
