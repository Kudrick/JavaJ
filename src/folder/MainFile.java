package folder;
import java.io.*;
import static java.lang.System.out;
import java.util.*;

public class MainFile {
    public static void showDir(File f, int level)
    {
        if (f.isDirectory())
        {
            out.println(f.getName().toUpperCase());
            File [] files = f.listFiles();
            for (File file : files)
            {
                if (file.isDirectory())
                    showDir(file, level+1);
            }
            for (File file : files)
            {
                if (file.isFile())
                {
                    out.printf("%s %s\n", file.getName().toLowerCase(),
                            new Date(file.lastModified()).toLocaleString());
                }
            }
        }
    }
        public static void showDir(File f)
        {
        showDir(f, 0);
        }
            public static void showDir (String path)
            {
                File f = new File (path);
                if (f.exists())
                showDir(f);
            }

    public static void main(String[] args) {
        showDir(".");
    }


            }
