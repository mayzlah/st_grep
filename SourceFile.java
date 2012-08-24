import java.io.*;

public class SourceFile {
    public SourceFile() {
    }
    
    private File sFile;
    
    public boolean openFile(String source){
        sFile = new File(source);
        if (!sFile.exists()){
            System.err.println("There's no any file with that name: " + source);
            return false;
        }
        if(!sFile.canRead()) {
            System.out.println("Oops! Can't read that file: " + source);
            return false;
        }
        return true;
    }
    
    public BufferedReader getStream() throws FileNotFoundException {
        BufferedReader getStream = new BufferedReader( new FileReader( sFile));
        return getStream;
    }
}