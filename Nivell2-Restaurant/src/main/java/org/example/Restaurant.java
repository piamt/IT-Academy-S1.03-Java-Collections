package org.example;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return getScore() == that.getScore() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }

    @Override
    public String toString() {
        return "nom:" + name + ", score:" + score;
    }

    @Override
    public int compareTo(Restaurant o) {
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        } else if (this.score != o.getScore()) {
            return o.score - this.getScore();
        } else {
            return 0;
        }
    }
}
