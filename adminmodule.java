Admin Module:
package HealthCare;
import java.util.Calendar;
import java.util.Scanner;
public class admin {
public static void main(String[] args) {
String months[] = {"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul",
"Aug","Sep", "Oct", "Nov", "Dec" };
Calendar calendar = Calendar.getInstance();
// System.out.println("---------------------------------------------------------");
int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 =
4;
System.out.println("-----------------------------------------------------------");
System.out.println(" ***HEALTH-CARE
MANAGEMENT SYSTEM***");
System.out.println("----------------------------------------------------------");
System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] +
" " + calendar.get(Calendar.DATE) + " “+
calendar.get(Calendar.YEAR));
System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) +
":" + calendar.get(Calendar.MINUTE)+ ":" +
calendar.get(Calendar.SECOND));
// insert1[] doc = new insert1[25];
// patient[] pat = new patient[100];
// int i;
// for (i = 0; i < 25; i++)
// doc[i] = new insert1();
// for (i = 0; i < 100; i++)
// pat[i] = new patient();
Scanner input = new Scanner(System.in);
int choice, j, c1, status = 1, s1 = 1;
while (status == 1) {
System.out.println("\n MAIN MENU");
System.out.println("-----------------------------------------------------------");
System.out.println("1. DOCTOR 2. PATIENT 3. APPOINTMENT 4.
BILLING 5. EXIT");
System.out.println("-----------------------------------------------------------");
choice = input.nextInt();

switch (choice) {
case 1:
insert1.DocInfo();
break;
case 2:
insert2.PatInfo();
break;

case 3:
insert3.AppInfo();
break;
case 4:
insert4.BillInfo();
break;
case 5:
break;
default:
System.out.println("Wrong Choice !!!");

}

System.out.println("RETURN BACK press (1/0) for

more");

s1 = input.nextInt();

}
}
// TODO Auto-generated method stub
// patient pot = new patient();
// pot.PatResult();
}