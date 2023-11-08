package com.winsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.winsoft.model.Series;
import com.winsoft.service.SeriesService;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService seriesService;

    @PostMapping("/create")
    public Series createSeries(@RequestBody Series series) {
        return seriesService.createSeries(series);
    }

    @PutMapping("/{seriesId}")
    public Series updateSeries(@PathVariable Long seriesId, @RequestBody Series updatedSeries) {
        return seriesService.updateSeries(seriesId, updatedSeries);
    }

    @DeleteMapping("/{seriesId}")
    public void deleteSeries(@PathVariable Long seriesId) {
        seriesService.deleteSeries(seriesId);
    }

    @GetMapping("/getSeries")
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }

    @GetMapping("/{seriesId}")
    public Series getSeriesById(@PathVariable Long seriesId) {
        return seriesService.getSeriesById(seriesId);
    }
}
