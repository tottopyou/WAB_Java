
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main  {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write the file name");
            String file_name = scanner.nextLine();
            File studentFile = new File(file_name);
            if (studentFile.exists()) {
                Read_the_file(file_name);
                break;
            }
            else {
                System.out.println("Name of a file that does not exist");
            }
        }
    }

    private static void splite_the_data(String data) {
        String[] array = data.split(" ");
        String name = array[0];
        int hours = Integer.parseInt(array[1]);
        double points = Double.parseDouble(array[2]);
        GPA(name, hours, points);

    }
    private static void Read_the_file(String fname) {
        try {
            File student_data = new File(fname);
            Scanner myReader = new Scanner(student_data);
            FileWriter myWriter = new FileWriter("output.dat");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                splite_the_data(data);
            }
            myReader.close();
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error in file format.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error writing to the output file.");
            e.printStackTrace();
        }
    }
    private static void GPA(String name, int hours, double points) {
        double gpa = points / hours;
        System.out.println(gpa);
        if (gpa < 1.5  && hours < 30){academic_warning(name,hours,gpa);}
        else if (gpa < 1.75  && hours < 60){academic_warning(name,hours,gpa);}
        else if (gpa < 2 ){academic_warning(name,hours,gpa);}
    }

    private static void academic_warning(String name, int hours, double gpa) {
        try {
            FileWriter myWriter = new FileWriter("output.dat", true);
            myWriter.write(name + ' ' + hours + ' ' + gpa + '\n');
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}