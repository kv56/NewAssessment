import java.io.BufferedReader;
import java.io.FileReader;
import java.util.NavigableSet;
import java.util.TreeSet;

public  class homes{
    public static void main(String[] args){
        String file = "homes.csv";
        String line;
        int i=0;
         NavigableSet<Integer> St =new TreeSet<Integer>();
         try (BufferedReader br =new BufferedReader(new FileReader(file))){
            while((line = br.readLine()) != null){
                if(i!=0){
                String[] key= line.split(",");
                int p=(Integer.parseInt(key[1].trim()) - Integer.parseInt(key[0].trim()))*1000 - Integer.parseInt(key[8].trim());
                St.add(p);
            }
            else{
                i=i+1;
            }

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Largest profit: "+St.pollLast()+" \nSecond Largest Profit: "+St.pollLast()+"\n Third Largest Profit: "+St.pollLast());
    }
}