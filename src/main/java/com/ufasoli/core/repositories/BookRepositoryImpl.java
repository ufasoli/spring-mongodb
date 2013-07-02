package com.ufasoli.core.repositories;

import com.ufasoli.core.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
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

        Criteria findSeriesCriteria = Criteria.where("title").is(title);
        Criteria findSagaNumberCriteria = Criteria.where("books").elemMatch(Criteria.where("seriesNumber").is(seriesNumber));
        BasicQuery query = new BasicQuery(findSeriesCriteria.getCriteriaObject(), findSagaNumberCriteria.getCriteriaObject());

        return  mongoOperations.findOne(query, Book.class);

    }
}
