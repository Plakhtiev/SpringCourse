package hibernete_one_to_many_bidirection;

import hibernete_one_to_many_bidirection.entity.Department;
import hibernete_one_to_many_bidirection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Department dep =new Department("Sales", 300, 1500);
//            Employee employee1 = new Employee("Jaroslav", "Plakhtiev", 1500);
//            Employee employee2 = new Employee("Oleg", "Ivanov", 850);
//            Employee employee3 = new Employee("Anton", "Sidorov", 650);
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);
//            dep.addEmployeeToDepartment(employee3);
//            session.beginTransaction();
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//---------------------------------------------------------------------------
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 4);
            List<Employee> employeeList = department.getEmployeeList();
            System.out.println("Show department \n" + department);
            System.out.println("Show getEmployeeList \n" + department.getEmployeeList());


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
