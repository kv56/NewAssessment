import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
public class newoscar{
        public static void main(String[] args){
        String file = "oscar_age_male (2).csv";
        String line;
        int i=0;      
        TreeMap<Integer,String[]> sorted = new TreeMap<Integer,String[]>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
         while((line = br.readLine()) != null){
             String[] key = (line.split(","));
            if(i!=0){    
                String[] s={key[6],key[8],key[2]};
                sorted.put(Integer.parseInt(key[4]),s);
            }
        else{
            i=i+1;
            continue;
        }                                               
         }
        } catch (Exception e){
           System.out.println(e);
        }
            int j=sorted.firstKey();
            System.out.println("The Yongest Oscar winner age is: "+j+" name is: '"+ sorted.get(j)[0]+"' in year "+sorted.get(j)[2]+" for the film '"+sorted.get(j)[1]+"'");
            j=sorted.lastKey();
            System.out.println("The Oldest Oscar winner age is: "+j+" name is: '"+ sorted.get(j)[0]+"' in year "+sorted.get(j)[2]+" for the film '"+sorted.get(j)[1]+"'");
    }
}