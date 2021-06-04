Appointment Module:
package HealthCare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class appoint {
public static void AppResult() {

System.out.println("HELLO");
try (Connection con =

DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
"scott","tiger"); Statement stmt = con.createStatement();) {
ResultSet pro = stmt.executeQuery("SELECT*FROM
APPOINTMENT");

while (pro.next()) {
System.out.print(pro.getInt("APPOINTMENT_ID"));
System.out.print("\t");
System.out.print(pro.getInt("PATIENT_ID"));
System.out.print("\t");
System.out.print(pro.getString("APPOINTMENT_DATE"));

System.out.print("\t");
System.out.print(pro.getInt("DOCTOR_ID"));
System.out.print("\t");
System.out.print(pro.getString("STATUS"));
System.out.println("\n");
}
} catch (SQLException e) {
System.out.println("Error with data retrieval- SQL" + e);
}
}
public static void AppInfo() {
System.out.println("------------------------------------------------------------");
System.out.println(" **APPOINTMENT SECTION**");
System.out.println("---------------------------------------------------");
int s1 = 1, c1;
while (s1 == 1)
{
Scanner input = new Scanner(System.in);
System.out.println("1. Entry \n 2.Appointment list");
c1 = input.nextInt();
switch (c1)
{
case 1:
insert3 pro = new insert3();
pro.AppInsert();
// pro.DocResult();
break;
case 2:
insert3 tro = new insert3();

System.out.println("---------------------------------------------------");
System.out.println("Appointment_ID \t Patient_ID \t Appointment_Date
\t Doctor_ID \t Status");
System.out.println("---------------------------------------------------");

// pro.DocInsert();
tro.AppResult();
break;
default:
System.out.println("Wrong Choice");
}

System.out.println("RETURN BACK press (1/0) for more");

s1 = input.nextInt();
}
}
}