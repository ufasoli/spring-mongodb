package com.ufasoli.core.bootstrap;

import com.ufasoli.core.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * User: ufasoli
 * Date: 02/07/13
 * Time: 20:56
 * Project : spring-mongodb
 */
@Component
public class DatabaseBootstrapper implements ApplicationListener<ContextRefreshedEvent>{

    private MongoTemplate mongoTemplate;

    @Autowired
    public DatabaseBootstrapper(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        mongoTemplate.dropCollection(Book.class);

        //todo: add sample JSON

       /** {
            "id": "1",
                "series": "A song of ice and Fire",
                "author" : "George R.R. Martin",
                "books" : [
            {
                "title" : "A Game of Thrones",
                    "pubYear" : 1996,
                    "seriesNumber" : 1
            },
            {
                "title" : "A Clash of Kings",
                    "pubYear" : 1998,
                    "seriesNumber" : 2
            },
            {
                "title" : "A Storm of Swords",
                    "pubYear" : 2000,
                    "seriesNumber" : 3
            },
            {
                "title" : "A Feast for Crows",
                    "pubYear" : 2005,
                    "seriesNumber" : 4
            },
            {
                "title" : "A Dance with Dragons",
                    "pubYear" : 2011,
                    "seriesNumber" : 5
            },
            {
                "title" : "The Winds of Winter",
                    "pubYear" : 2014,
                    "seriesNumber" : 6
            },
            {
                "title" : "A Dream of Spring",
                    "pubYear" : 2100,
                    "seriesNumber" : 7
            }

            ]
        } **/
        System.out.println("**********");
        System.out.println("INITIALIZING MongoDB with some seed data");
        System.out.println("**********");
    }
}
