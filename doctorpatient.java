import java.util.*;
  
   class patient
 {
   int pt_id,pt_age;
   String pt_name,doc;

   void accept()
  {
  	   Scanner s = new Scanner(System.in);
    System.out.print("\nEnter the id of the patient:");
    pt_id=s.nextInt();  
    System.out.print("\nEnter the age of the patient:"); 
    pt_age=s.nextInt(); 
    System.out.print("\nEnter the name of the patient:");
    pt_name=s.next();
    System.out.print("\nEnter the doctor of the patient:");  
    doc=s.next();
  } 
   
   void display()
  {
      System.out.print("\n\nPatient Id:"+pt_id);
      System.out.print("\nName of the Patient:"+pt_name);
      System.out.print("\nThe Age of the Patient:"+pt_age);
      System.out.print("\nPatient's Doctor:"+doc);
  
  }
  
   public static void main(String args[])
  {
    int n;
       Scanner s = new Scanner(System.in);
    System.out.print("Enter the total number of Patients:");
    Scanner a = new Scanner(System.in);  
    n=a.nextInt(); 
    patient[] pnt = new patient[n];
    
    for(int i=0;i<n;i++)
     {
       pnt[i] = new patient();
       pnt[i].accept();
     }   
     for(int j=0;j<n;j++)
     {
     pnt[j].display();
     }
   } 
}     
