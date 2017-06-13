import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class OntoTxt
{
    public static void main (String [] args) throws IOException
    {
        FileWriter fW = new FileWriter ("U:\\Computer Science.txt",true);
        BufferedWriter bW = new BufferedWriter(fW);

        bW.newLine();
        bW.write (content);
    
}    
bW.close();
}
