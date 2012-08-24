import java.io.*;

public class Grep{
    public static void main(String[] args){
        String source = new String("source.txt");
        int argLength = args.length;
        if (argLength == 0){
            System.err.println("Need more arguments");
            System.exit(1);
        }
        int argCounter = 0;
        int patCounter = 0;
        CharSequence[] pattern = new CharSequence[argLength];
        for(argCounter = 0; argCounter < argLength; argCounter++){
            if (args[argCounter] == "-s") {
                source = args[argCounter+1];
                argCounter++;
            }
            else {
                pattern[patCounter] = (CharSequence) args[argCounter];
                patCounter++;
            }
        }
        if (patCounter == 0){
            System.err.println("Need patterns");
            System.exit(1);
        }
        SourceFile sFile;
        if(!sFile.getFile(source)) {
            exit(1);
        }
        StringComp sComp;
        sComp.compare(pattern, sFile.getStream());
    }
}
