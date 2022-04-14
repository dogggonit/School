import java.sql.Connection;
import java.sql.DriverManager;

public class InsertRecords {
    private static final String USERNAME = "coms363";
    private static final String PASSWORD = "password";
    private static final String SERVER = "jdbc:mysql://localhost:3306";

    private static String STUDENTS = "INSERT INTO students VALUES (1001, 654651234, 'Randy', 'M', '20001201', '301 E Hall', '5152700988', '121 Main', '7083066321'),(1002, 123097834, 'Victor', 'M', '20000506', '270 W Hall', '5151234578', '702 Walnut', '7080366333'),(1003, 978012431, 'John', 'M', '19990708', '201 W Hall', '5154132805', '888 University', '5152012011'),(1004, 746897816, 'Seth', 'M', '19981230', '199 N Hall', '5158891504', '21 Green', '5154132907'),(1005, 186032894, 'Nicole', 'F', '20010401', '178 S Hall', '5158891155', '13 Gray', '5157162071'),(1006, 534218752, 'Becky', 'F', '20010516', '12 N Hall', '5157083698', '189 Clark', '2034367632'),(1007, 432609519, 'Kevin', 'M', '20000812', '75 E Hall', '5157082497', '89 National', '7182340772')";
    private static String DEPARTMENTS = "INSERT INTO departments VALUES (401, 'Computer Science', '5152982801', 'LAS'),(402, 'Mathematics', '5152982802', 'LAS'),(403, 'Chemical Engineering', '5152982803', 'Engineering'),(404, 'Landscape Architect', '5152982804', 'Design')";
    private static String DEGREES = "INSERT INTO degrees VALUES ('Computer Science', 'BS', 401),('Software Engineering', 'BS', 401),('Computer Science', 'MS', 401),('Computer Science', 'PhD', 401),('Applied Mathematics', 'MS', 402),('Chemical Engineering', 'BS', 403),('Landscape Architect', 'BS', 404)";
    private static String MAJOR = "INSERT INTO major VALUES (1001, 'Computer Science', 'BS'),(1002, 'Software Engineering', 'BS'),(1003, 'Chemical Engineering', 'BS'),(1004, 'Landscape Architect', 'BS'),(1005, 'Computer Science', 'MS'),(1006, 'Applied Mathematics', 'MS'),(1007, 'Computer Science', 'PhD')";
    private static String MINOR = "INSERT INTO minor VALUES (1007, 'Applied Mathematics', 'MS'),(1005, 'Applied Mathematics', 'MS'),(1001, 'Software Engineering', 'BS')";
    private static String COURSES = "INSERT INTO courses VALUES (113, 'Spreadsheet', 'Microsoft Excel and Access', 3, 'Undergraduate', 401),(311, 'Algorithm', 'Design and Analysis', 3, 'Undergraduate', 401),(531, 'Theory of Computation', 'Theorem and Probability', 3, 'Graduate', 401),(363, 'Database', 'Design Principle', 3, 'Undergraduate', 401),(412, 'Water Management', 'Water Management', 3, 'Undergraduate', 404),(228, 'Special Topics', 'Interesting Topics about CE', 3, 'Undergraduate', 403),(101, 'Calculus', 'Limit and Derivative', 4, 'Undergraduate', 402)";
    private static String REGISTER = "INSERT INTO register VALUES (1001, 363, 'Fall2015', 3),(1002, 311, 'Fall2015', 4),(1003, 228, 'Fall2015', 4),(1004, 363, 'Spring2015', 3),(1005, 531, 'Spring2015', 4),(1006, 363, 'Fall2015', 3),(1007, 531, 'Spring2015', 4)";
    private static final String[] QUERIES = {STUDENTS, DEPARTMENTS, DEGREES, COURSES, REGISTER, MAJOR, MINOR};

    public static void main(String... args) throws Exception {
        Connection sql = DriverManager.getConnection(SERVER, USERNAME, PASSWORD);
        for (String s : QUERIES) {
            sql.createStatement().executeUpdate(s);
        }
    }
}
