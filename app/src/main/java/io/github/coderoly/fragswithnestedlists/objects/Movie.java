package io.github.coderoly.fragswithnestedlists.objects;


public class Movie {
    private String name, actor;

    public Movie() {
    }

    public Movie(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public String getActor() {
        return actor;
    }


}