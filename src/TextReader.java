
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    public enum Mark{
    	START,END };

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List<Integer> valueList = new ObjectList<>();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                valueList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                }
            }
        }
        
        for (int value : valueList) {
        	System.out.println(value);
        }
    }

    public static void main(String[] args) {
        logger.info(Mark.START.name());
        new TextReader("C:\\pleiades\\2023-12\\workspace\\JavaApplication\\src\\number.txt").execute();
        logger.info(Mark.END.name());
    }

}