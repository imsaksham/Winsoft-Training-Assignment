package com.winsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winsoft.model.Series;
import com.winsoft.repository.SeriesRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class SeriesService {
    @Autowired
    private SeriesRepository seriesRepository;

    public Series createSeries(Series series) {
        return seriesRepository.save(series);
    }

    public Series updateSeries(Long seriesId, Series updatedSeries) {
    	
        Series existingSeries = seriesRepository.findById(seriesId).orElseThrow(() -> new EntityNotFoundException("Series not found"));

        existingSeries.setName(updatedSeries.getName());
        existingSeries.setStartDate(updatedSeries.getStartDate());
        existingSeries.setEndDate(updatedSeries.getEndDate());

        return seriesRepository.save(existingSeries);
    }

    public void deleteSeries(Long seriesId) {
        seriesRepository.deleteById(seriesId);
    }

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }

    public Series getSeriesById(Long seriesId) {
        return seriesRepository.findById(seriesId)
                .orElseThrow(() -> new EntityNotFoundException("Series not found"));
    }
}
