package com.winsoft.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winsoft.model.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {

    List<Series> findByStartDateBetween(Date startDate, Date endDate);

}
