package net.engineeringdigest.journalApp.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AtlasConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;


    @Bean
   // @Primary  // <--- This forces Spring to use THIS connection, not the localhost one
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://alirizwan05681_db_user:u34dQPkbPn4AOqMy@cluster0.68aofs7.mongodb.net/journaldb?retryWrites=true&w=majority");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "journaldb");
    }
}