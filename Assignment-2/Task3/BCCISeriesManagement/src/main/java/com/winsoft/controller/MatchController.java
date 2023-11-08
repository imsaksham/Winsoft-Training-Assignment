package com.winsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.winsoft.model.Match;
import com.winsoft.service.MatchService;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @PostMapping("/create")
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @PutMapping("/{matchId}")
    public Match updateMatch(@PathVariable Long matchId, @RequestBody Match updatedMatch) {
        return matchService.updateMatch(matchId, updatedMatch);
    }

    @DeleteMapping("/{matchId}")
    public void deleteMatch(@PathVariable Long matchId) {
        matchService.deleteMatch(matchId);
    }

    @GetMapping("/series/{seriesId}")
    public List<Match> getMatchesForSeries(@PathVariable Long seriesId) {
        return matchService.getMatchesForSeries(seriesId);
    }

    @GetMapping("/{matchId}")
    public Match getMatchById(@PathVariable Long matchId) {
        return matchService.getMatchById(matchId);
    }
}
