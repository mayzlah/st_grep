import java.io.*;

public class StringComp {

    public void compare (CharSequence[] pattern, BufferedReader stream) {
        int counter;
        try {
            String currentLine = new String(stream.readLine());             //}
            while( currentLine!=null) {                                     //}
                for(counter = 0; counter < pattern.length; counter++) {     //}
                    if(currentLine.contains(pattern[counter])) {            //}
                        System.out.println(currentLine);                    //} It seems to be the freakiest shit I ever wrote.
                        break;                                              //}
                    }                                                       //} Seriously.
                }                                                           //}
            }                                                               //} I don't even know what to do next
        }                                                                   //}
        stream.close();
    }
}