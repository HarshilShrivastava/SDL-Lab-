  
import java.util.Scanner;  // Import the Scanner class
import java.util.Stack;

class Student{  
 int prn;
 String name;
 String Email;


 public Student(int prn,String name,String Email) {
    this.prn=prn;
    this.name=name;
    this.Email=Email;
  }

} 



class StackSDL{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student[] arr; 
        
        System.out.println("Enter the no of entry: ");
        int num = scan.nextInt();
        arr = new Student[num]; 
        Stack <Student> s= new Stack<>();


        
        for (int i=0;i<num;i++){
            
            System.out.println("Enter the Name: ");
            String Name = scan.next();
            System.out.println("Enter the PRN: ");
            int prn = scan.nextInt();
            System.out.println("Enter the Email: ");
            String Email = scan.next();

            arr[i]= new Student(prn, Name,Email);
            s.push(arr[i]); 

            System.out.println("Enter the Data of next candidate!   ");

        }
        
        System.out.println("Vector elements are: ");
        System.out.println("There are " + num +" elements in the  vector: ");
        for (int i=0; i<s.size() ; i++ ) {
          System.out.println("Data of "+num+"th element:");
            System.out.println("the P.R.N. is: " + s.get(i).prn);
            System.out.println("the Name is: " + s.get(i).name);
            System.out.println("the Email is:" + s.get(i).Email);

            System.out.println("Next Candidate");
        }
        System.out.println("End of code! ");


    }
}