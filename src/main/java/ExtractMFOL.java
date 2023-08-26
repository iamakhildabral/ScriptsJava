import java.io.*;

public class ExtractMFOL {
    public static void main(String[] args) throws IOException {
        File mfol = new File("D:\\Codes\\Java\\OfficeScriptsJava\\extraction\\src\\main\\java\\mfol.txt");
        File docList = new File("D:\\Codes\\Java\\OfficeScriptsJava\\extraction\\src\\main\\java\\DocList.txt");
        BufferedReader br = new BufferedReader(new FileReader(mfol));
        BufferedWriter bw = new BufferedWriter(new FileWriter(docList));
        String line, doclist;
        String newline = "";
        try{
            while((line = br.readLine()) != null){
                doclist = line.substring(11,23);
                bw.write(newline+doclist);
                newline= "\n";
            }
        }catch (IOException ex){
            System.out.println(ex);
        }
        br.close();
        bw.close();
    }
}
