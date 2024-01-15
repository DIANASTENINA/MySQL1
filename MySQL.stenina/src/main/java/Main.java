import db.MySQLConnector;
import objects.Curator;
import objects.Group;
import objects.Student;
import tables.CuratorTable;
import tables.GroupTable;
import tables.StudentTable;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
      try {

            StudentTable studentTable = new StudentTable();
            ArrayList<Student> students = studentTable.selectAll();
            if (students.size() < 15) {

                studentTable.insert(new Student(1,"Иванов Иван Иванович", "М", 1));
                studentTable.insert(new Student(2,"Петров Перт Петрович", "Ж", 2));
                studentTable.insert(new Student(3,"Семенов Семен Семенович", "М", 1));
                studentTable.insert(new Student(4,"Андреева Анастасия Андреевна", "Ж", 3));
                studentTable.insert(new Student(5 ,"Алексеев Алексей Алексеевич", "М", 2));
                studentTable.insert(new Student(6,"Игорев Игорь Игоревич", "М", 1));
                studentTable.insert(new Student(7,"Павлова Ирина Павловна", "Ж", 2));
                studentTable.insert(new Student(8,"Максимов Максим Максимович", "М", 1));
                studentTable.insert(new Student(9,"Сергеев Сергей Сергеевич", "М", 3));
                studentTable.insert(new Student(10,"Викторов Виктор Викторович", "М", 2));
                studentTable.insert(new Student(11,"Светова Светлана Светлановна", "Ж", 1));
                studentTable.insert(new Student(12,"Васильева Василиса Васильевна", "Ж", 2));
                studentTable.insert(new Student(13,"Еленова Елена Еленовна", "М", 1));
                studentTable.insert(new Student(14,"Надеждина Надежда Надеждовна", "Ж", 3));
                studentTable.insert(new Student(15,"Леонидов Леонид Леонидович ", "М", 2));
                students = studentTable.selectAll();
            }
            GroupTable groupTable = new GroupTable();
            ArrayList<Group> groups = groupTable.selectAll();
            if (groups.size() < 3) {
                groupTable.insert(new Group(1, "Фантазеры", 1));
                groupTable.insert(new Group(2, "Энтузиасты", 2));
                groupTable.insert(new Group(3, "Чемпионы", 3));
                groupTable.insert(new Group(4, "Полиглоты", 4));
                groups = groupTable.selectAll();
            }

            CuratorTable curatorTable = new CuratorTable();
            ArrayList<Curator> curators = curatorTable.selectAll();
            if (curators.size() < 4) {
                curatorTable.insert(new Curator(1,"Фантазеров Фантазер Фантазерович"));
                curatorTable.insert(new Curator(2,"Энтузиастов Энтузиаст Энтузиастович"));
                curatorTable.insert(new Curator(3,"Чемпионов Чемпион Чемпионович"));
                curatorTable.insert(new Curator(4,"Полиглотов Полиглот Полиглотович"));
          }

            studentTable.selectAllStudent();

            studentTable.selectSumm();

            studentTable.selectWomen();

            groupTable.selectCurator();

            groups.get(2).setId_curator(3);
            groupTable.updateCurator(groups.get(2));

            studentTable.selectStudentGroup();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MySQLConnector.close();
        }
    }
}



