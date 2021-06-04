Patients Module:
package HealthCare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class patient extends doctor {
public static void PatResult() {
try (Connection con =

DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
"scott","tiger"); Statement stmt = con.createStatement();) {
ResultSet pro = stmt.executeQuery("SELECT*FROM PATIENT");

while (pro.next()) {
System.out.print(pro.getInt("PATIENT_ID"));
System.out.print("\t");
System.out.print(pro.getString("PATIENT_Name"));
System.out.print("\t");
System.out.print(pro.getString("SEX"));
System.out.print("\t");
System.out.print(pro.getString("TREATMENT"));
System.out.print("\t");

System.out.print(pro.getString("MEDICAL_HISTORY"));

System.out.println("\n");
}
} catch (SQLException e) {
System.out.println("Error with data retrieval- SQL" + e);
}
}
public static void PatInfo() {
System.out.println(“----------------------------------------------");
System.out.println(" **PATIENT SECTION**");
System.out.println("---------------------------------");
int s1 = 1, c1;
while (s1 == 1)
{
Scanner input = new Scanner(System.in);
System.out.println("1. Entry or Delete \t\n 2.patient list");
c1 = input.nextInt();
switch (c1)
{
case 1:

insert2 pro = new insert2();
pro.PatInsert(); // pro.DocResult();
break;
case 2:
insert2 tro = new insert2();
System.out.println("-----------------------------------------");
System.out.println("Patient_ID \t Patient_Name\t Sex \t Treatment
\t Medical_History");
System.out.println("----------------------------------");
// pro.DocInsert();

tro.PatResult();
break;
default: System.out.println("Wrong Choice");

}

System.out.println("RETURN BACK press (1/0) for more");
s1 = input.nextInt();

}
}
}