import java.io.*;

public class StringComp {

    public StringComp() {
    }

    public void compare (CharSequence[] pattern, BufferedReader stream)  {
        int counter;
        System.out.println(pattern.length);
        try {
            String currentLine = new String(stream.readLine());             
            while( currentLine!=null) {                                     
                for(counter = 0; counter < pattern.length; counter++) {
                    //System.out.println(counter);
                    if(currentLine.contains(pattern[counter])) {            
                        System.out.println(currentLine);                    //} It seems to be the freakiest shit I ever wrote.
                        break;                                              
                    }                                                       //} Seriously.
                }
                currentLine = stream.readLine();
            }                                                               //} I don't even know what to do next
            stream.close();
        }
        catch (Exception e) { System.out.println("It's a trap"); System.exit(1); }
        
    }
}