package com.ufasoli.core.repositories;

import com.ufasoli.core.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * User: ufasoli
 * Date: 21/06/13
 * Time: 18:53
 * Project : spring-mongodb
 */
@Repository
public class BookRepositoryImpl implements BookRepositoryCustom {

    private MongoOperations mongoOperations;

    @Autowired
    public BookRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }



    @Override
    public Book findBySeriesNumberAndTitle(String title, Integer seriesNumber) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
