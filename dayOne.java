import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class dayOne {
    public static void main(String[] args) {
        ArrayList<ArrayList<Int>> locations = new ArrayList<ArrayList<Int>>();
        for(int i = 1; i < 10; i++){
            locations.add(txtToArray("dayOne.txt"));
        }

        for(int loops = 0; loops < 10; loops++){
            for(ArrayList<Int> i: locations){
                for(Int j: i){
                    System.out.println(j);
                }
            }
        }

    }

    /**
     * A static function that converts a text file into an ArrayList.
     * @param filename
     * @return ArrayList<Int>
     */
    public static ArrayList<Int> txtToArray(String filename){
        ArrayList<Int> array = new ArrayList<Int>();
        try (Scanner myFileReader = new Scanner(new File(filename))) {
            while (myFileReader.hasNextInt()) {
                Int line = myFileReader.nextInt();
                array.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return array;
    }
}