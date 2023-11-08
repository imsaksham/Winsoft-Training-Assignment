package com.winsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winsoft.model.Match;
import com.winsoft.repository.MatchRepository;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match updateMatch(Long matchId, Match updatedMatch) {
        Match existingMatch = matchRepository.findById(matchId)
                .orElseThrow(() -> new EntityNotFoundException("Match not found"));

        existingMatch.setMatchDate(updatedMatch.getMatchDate());
        existingMatch.setTeam1(updatedMatch.getTeam1());
        existingMatch.setTeam2(updatedMatch.getTeam2());
        existingMatch.setVenue(updatedMatch.getVenue());

        return matchRepository.save(existingMatch);
    }

    public void deleteMatch(Long matchId) {
        matchRepository.deleteById(matchId);
    }

    public List<Match> getMatchesForSeries(Long seriesId) {
        return matchRepository.findBySeries_SeriesId(seriesId);
    }

    public Match getMatchById(Long matchId) {
        return matchRepository.findById(matchId).orElseThrow(() -> new EntityNotFoundException("Match not found"));
    }
}
