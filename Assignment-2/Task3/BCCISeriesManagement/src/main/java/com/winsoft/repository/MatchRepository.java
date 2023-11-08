package com.winsoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winsoft.model.Match;
import com.winsoft.model.Series;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

	List<Match> findBySeries(Series series);

	List<Match> findBySeries_SeriesId(Long seriesId);

}
