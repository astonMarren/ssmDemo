import javax.security.auth.login.AppConfigurationEntry;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jshx.dao2.SchoolDao;
import com.jshx.entity.School;

public class SpringMybatisTest {
    /*
    * 1. 创建spring容器
           根据xml文件应用程序Context容器(上下文)
           classpath指配置文件的位置, 起点有java, resources. 写路径时相对这个起点去写
    * */
    //static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
 
    @Test
    public void test1(){
    	//AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("../classes/spring/applicationContext.xml");
    	SchoolDao schoolDao = (SchoolDao)context.getBean(SchoolDao.class);
    	School school = new School();
    	school.setId("4");
    	school.setName("第4中学");
    	school.setArea("南京");
		schoolDao.insertSchool(school );
    	
//    	StudentService service = (StudentService)context.getBean("studentService");
//    	GradeDao gradeDao = (GradeDao)context.getBean("gradeDao");
//    	List<Student> list = service.selectAllStudent();
//        for (Student student : list) {
//            System.out.println(student);
//            System.out.println(student.getGrade());
//        }
//        List<Grade> selectGrade = gradeDao.selectGrade();
//        for (Grade grade : selectGrade) {
//			System.out.println(grade);
//		}
   /*     Student st = new Student();
        st.setId(2);
        st.setName("李四");
        st.setPassword("222");
        service.insertStudent(st);*/
    }
}
