package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public String readFile(String fileSource)
    {
        String out = "";
        try
        {
            File file = new File(fileSource);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                out = out+data+"\n";
            }
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return out;
    }

    public boolean writeFile(String fileSource, String data)
    {
        boolean success = false;
        try
        {
            FileWriter writer = new FileWriter(fileSource);
            writer.write(data);
            writer.close();
            success = true;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            success = false;
        }
        return success;
    }
}
