package hibernete_one_to_many_unidirection;


import hibernete_one_to_many_unidirection.entity.Department;
import hibernete_one_to_many_unidirection.entity.Employee;
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


            session = factory.getCurrentSession();
//            Department dep =new Department("HR", 300, 1200);
//            Employee employee1 = new Employee("Oksana", "Kozlova", 800);
//            Employee employee2 = new Employee("Andrey", "Sidorov", 600);
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);
            session.beginTransaction();
//            session.save(dep);

            Department department = session.get(Department.class, 1);
            Department department2 = session.get(Department.class, 2);
            Department department3 = session.get(Department.class, 3);

            session.delete(department);
            session.delete(department2);
            session.delete(department3);


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
