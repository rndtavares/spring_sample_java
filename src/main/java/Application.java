import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsigth.service.CustumerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustumerService service = new CustumerServiceImpl();
		
		CustumerService service = appContext.getBean("custumerService", CustumerService.class);
		
		System.out.println(service);

		CustumerService service2 = appContext.getBean("custumerService", CustumerService.class);
		
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());
		
	}

}
