Billing Module:
package HealthCare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class billing {
public static void BillResult() {
try (Connection con =

DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
"scott","tiger"); Statement stmt = con.createStatement();) {
ResultSet pro = stmt.executeQuery("SELECT*FROM BILLING");

while (pro.next()) {
System.out.print(pro.getInt("PATIENT_ID"));
System.out.print("\t");

System.out.print(pro.getInt("MEDICINE_DOCTOR_FEES"));

System.out.print("\t");

System.out.print(pro.getString("LABORATORY_TESTS"));

System.out.println("\n");
}

} catch (SQLException e) {
System.out.println("Error with data retrieval- SQL" + e);
}
}
public static void BillInfo() {
System.out.println("---------------------------------------------");

System.out.println(" **BILLING SECTION**");
System.out.println("------------------------------------");
int s1 = 1, c1;
while (s1 == 1)
{
Scanner input = new Scanner(System.in);
System.out.println("1. Entry \n 2.Billing list");
c1 = input.nextInt();
switch (c1)
{
case 1:
insert4 pro = new insert4();
pro.BillInsert();
// pro.DocResult();
break;
case 2:
insert4 tro = new insert4();

System.out.println("----------------------------------------------");

System.out.println("Patient_ID \t Medicine_Doctor_Fees \t
Laboratory_Tests ");

System.out.println("------------------------------------");

// pro.DocInsert();
tro.BillResult();
break;
default:
System.out.println("Wrong Choice");
}
System.out.println("RETURN BACK press (1/0) for more");
s1 = input.nextInt();

}
}
}