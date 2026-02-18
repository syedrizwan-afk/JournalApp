package net.engineeringdigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JournalApplication {

	public static void main(String[] args) {
//		System.setProperty("spring.data.mongodb.uri", "mongodb+srv://alirizwan05681_db_user:u34dQPkbPn4AOqMy@cluster0.68aofs7.mongodb.net/journaldb?retryWrites=true&w=majority");
		SpringApplication.run(JournalApplication.class, args);
	}
	@Bean
	public PlatformTransactionManager add(MongoDatabaseFactory dbFactory){
		return new MongoTransactionManager(dbFactory);
	}
}
