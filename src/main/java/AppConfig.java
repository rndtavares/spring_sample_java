import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.pluralsigth"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	//@Bean(name = "custumerService")
	//public CustumerService getCustumerService(){
		//CustumerServiceImpl service = new CustumerServiceImpl(getCustumerRepository());
		
		//CustumerServiceImpl service = new CustumerServiceImpl();
		//service.setCustumerRepository(getCustumerRepository());
		
		//return service;
	//}
	
	//@Bean(name = "custumerRepository")
	//public CustumerRepository getCustumerRepository(){
	//	return new HibernateCustumerRepositoryImpl();
	//}
	
	
}
