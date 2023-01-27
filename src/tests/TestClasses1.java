package tests;

import org.junit.Test;
//import ratings.Rating;
//import ratings.Reviewer;
//import ratings.Song;

import static org.junit.Assert.assertTrue;

public class TestClasses1 {

    // These test are provided for you. As you complete the task, uncomment these tests to test your code
    // You should use these tests as reference as you write your own tests in the future

//    @Test
//    public void testSongClass() {
//        Song song = new Song("Come As You Are", "Nirvana", "vabnZ9-ex7o");
//
//        assertTrue(song.getSongID().equals("vabnZ9-ex7o"));
//        assertTrue(song.getArtist().equals("Nirvana"));
//        assertTrue(song.getTitle().equals("Come As You Are"));
//
//        song.setSongID("deleted");
//        song.setArtist("removed");
//        song.setTitle("redacted");
//
//        assertTrue(song.getSongID().equals("deleted"));
//        assertTrue(song.getArtist().equals("removed"));
//        assertTrue(song.getTitle().equals("redacted"));
//    }
//
//    @Test
//    public void testReviewerClass() {
//        Reviewer jesse = new Reviewer("jesse");
//        Reviewer paul = new Reviewer("Paul");
//
//        assertTrue(jesse.getReviewerID().equals("jesse"));
//        assertTrue(paul.getReviewerID().equals("Paul"));
//
//        jesse.setReviewerID("Jesse");
//        assertTrue(jesse.getReviewerID().equals("Jesse"));
//
//        Rating paulsRating = paul.rateSong(3);
//        Rating jessesRating = jesse.rateSong(5);
//
//        assertTrue(paulsRating.getRating() == 3);
//        assertTrue(paulsRating.getReviewerID().equals("Paul"));
//
//        assertTrue(jessesRating.getRating() == 5);
//        assertTrue(jessesRating.getReviewerID().equals("Jesse"));
//
//        jessesRating = jesse.rateSong(10);
//
//        assertTrue(jessesRating.getRating() == -1);
//    }
//
//
//    @Test
//    public void testRatingClass() {
//        Rating rating = new Rating("Jesse", 5);
//
//        assertTrue(rating.getReviewerID().equals("Jesse"));
//        assertTrue(rating.getRating() == 5);
//
//        rating.setReviewerID("Paul");
//        assertTrue(rating.getReviewerID().equals("Paul"));
//
//        rating.setRating(1);
//        assertTrue(rating.getRating() == 1);
//        rating.setRating(2);
//        assertTrue(rating.getRating() == 2);
//        rating.setRating(3);
//        assertTrue(rating.getRating() == 3);
//        rating.setRating(4);
//        assertTrue(rating.getRating() == 4);
//        rating.setRating(5);
//        assertTrue(rating.getRating() == 5);
//        rating.setRating(6);
//        assertTrue(rating.getRating() == -1);
//        rating.setRating(0);
//        assertTrue(rating.getRating() == -1);
//        rating.setRating(10);
//        assertTrue(rating.getRating() == -1);
//        rating.setRating(-100);
//        assertTrue(rating.getRating() == -1);
//        rating.setRating(3);
//        assertTrue(rating.getRating() == 3);
//
//        rating = new Rating("Jesse", 6);
//        assertTrue(rating.getRating() == -1);
//
//        rating = new Rating("Jesse", 0);
//        assertTrue(rating.getRating() == -1);
//    }

}