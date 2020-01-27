import java.io.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try {
            FileReader fr = new FileReader("C:\\Users\\Nastya\\VadimTasks\\Message.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                String s;
                while ((s = br.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                br.close();
                System.out.print(sb);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
