package com.ufasoli.core.repositories;

import com.ufasoli.core.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User: ufasoli
 * Date: 21/06/13
 * Time: 18:50
 * Project : spring-mongodb
 */

public interface BookRepository extends CrudRepository<Book, String>, BookRepositoryCustom {

    public Book findByTitle(String title);

}
