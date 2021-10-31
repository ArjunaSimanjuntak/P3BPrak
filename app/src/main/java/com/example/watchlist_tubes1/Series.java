package com.example.watchlist_tubes1;

public class Series {
    protected String title, synopsis, review, episodeDetail;
    protected boolean status;
    protected int star;

    public Series(String title, String synopsis, String episodeDetail) {
        this.title = title;
        this.synopsis = synopsis;
        this.episodeDetail = episodeDetail;
        this.review = "";
        this.status = false;
        this.star= 0;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getReview() {
        return review;
    }

    public boolean isStatus() {
        return status;
    }

    public int getStar() {
        return star;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
