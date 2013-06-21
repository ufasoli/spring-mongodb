package com.ufasoli.core.repositories;

import com.ufasoli.core.model.Book;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * User: ufasoli
 * Date: 21/06/13
 * Time: 19:24
 * Project : spring-mongodb
 */
@NoRepositoryBean
public interface BookRepositoryCustom {
    public Book findBySeriesNumberAndTitle(String title, Integer seriesNumber);
}

