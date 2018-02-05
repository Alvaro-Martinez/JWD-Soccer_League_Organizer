package com.alvaro.model;

import java.util.Set;
import java.util.TreeSet;

public class Team implements Comparable<Team> {
    public String teamName;
    public String coachName;
    public Set<Player> players;

    public Team(String teamName, String coach) {
        this.teamName = teamName;
        this.coachName = coach;
        players = new TreeSet<>();
    }

    @Override
    public int compareTo(Team other) {
        return (this.teamName).compareTo(other.teamName);
    }

    @Override
    public String toString() {
        return String.format("Team %s coached by %s", teamName, coachName);
    }
}
