package tests;

//import ratings.Rating;
//import ratings.Reviewer;
//import ratings.Song;

import static org.junit.Assert.assertTrue;

public class TestDataStructures1 {

    // These test are provided for you. As you complete the task, uncomment these tests to test your code
    // You should use these tests as reference as you write your own tests in the future

    private final double EPSILON = 0.001;

    public void compareDoubles(double d1, double d2) {
        assertTrue(d1 + " and " + d2 + " are not within " + EPSILON, Math.abs(d1 - d2) < EPSILON);

    }

//    public void compareRatings(Rating computed, Rating expected) {
//        assertTrue(computed.getRating() == expected.getRating());
//        assertTrue(computed.getReviewerID().equals(expected.getReviewerID()));
//    }
//
//    public void checkRatingsList(LinkedListNode<Rating> computed, LinkedListNode<Rating> expected) {
//        if (expected == null) {
//            assertTrue(computed == null);
//        } else {
//            assertTrue(computed != null);
//            compareRatings(computed.getValue(), expected.getValue());
//            checkRatingsList(computed.getNext(), expected.getNext());
//        }
//    }
//
//    public void addAllRatings(Song song, LinkedListNode<Rating> ratings) {
//        if (ratings != null) {
//            song.addRating(ratings.getValue());
//            addAllRatings(song, ratings.getNext());
//        }
//    }
//
//    @Test
//    public void testAddRatingsWithoutDuplicateReviewerIDs() {
//        LinkedListNode<Rating> expected = new LinkedListNode<>(new Rating("Jesse", 3), null);
//        expected = new LinkedListNode<>(new Rating("Paul", 4), expected);
//        expected = new LinkedListNode<>(new Rating("Carl", 5), expected);
//
//        Song song = new Song("Enter Sandman", "Metallica", "CD-E-LDc384");
//        assertTrue(song.getRatings() == null);
//        addAllRatings(song, expected);
//
//        LinkedListNode<Rating> computed = song.getRatings();
//        checkRatingsList(computed, expected);
//    }
//
//    @Test
//    public void testDidReviewerRateSong() {
//        LinkedListNode<Rating> expected = new LinkedListNode<>(new Rating("Jesse", 5), null);
//        expected = new LinkedListNode<>(new Rating("Paul", 2), expected);
//        expected = new LinkedListNode<>(new Rating("Carl", 1), expected);
//
//        Song song = new Song("Jimmy, Brian, and Mike", "Eminem", "Jr7ytAtXTXw");
//
//        addAllRatings(song, expected);
//
//        assertTrue(song.didReviewerRateSong("Jesse"));
//        assertTrue(song.didReviewerRateSong("Paul"));
//        assertTrue(song.didReviewerRateSong("Carl"));
//        assertTrue(!song.didReviewerRateSong("Matt"));
//        assertTrue(!song.didReviewerRateSong(""));
//    }
//
//    @Test
//    public void testAddRatingsWithDuplicateReviewerIDs() {
//        LinkedListNode<Rating> expected = new LinkedListNode<>(new Rating("Jesse", 4), null);
//        expected = new LinkedListNode<>(new Rating("Paul", 5), expected);
//        expected = new LinkedListNode<>(new Rating("Carl", 3), expected);
//
//        Song song = new Song("Feel Good Inc.", "Gorillaz", "NxxjLD2pmlk");
//
//        addAllRatings(song, expected);
//        addAllRatings(song, expected);
//        addAllRatings(song, expected);
//
//        LinkedListNode<Rating> computed = song.getRatings();
//        checkRatingsList(computed, expected);
//    }
//
//    @Test
//    public void testAverageRatings() {
//        Song song = new Song("Counting Stars", "OneRepublic", "hT_nvWreIhg");
//
//        compareDoubles(song.averageRating(), 0.0);
//
//        song.addRating(new Rating("Jesse", 2));
//        compareDoubles(song.averageRating(), 2.0);
//
//        song.addRating(new Rating("Paul", 5));
//        compareDoubles(song.averageRating(), 3.5);
//
//        song.addRating(new Rating("Carl", 3));
//        compareDoubles(song.averageRating(), 3.333333);
//
//    }
//
//    @Test
//    public void testRemoveRatingByReviewer() {
//
//        LinkedListNode<Rating> expected = new LinkedListNode<>(new Rating("Jesse", 1), null);
//        expected = new LinkedListNode<>(new Rating("Paul", 2), expected);
//        expected = new LinkedListNode<>(new Rating("Carl", 3), expected);
//
//        Song song = new Song("Dynamite", "BTS", "o-YBDTqX_ZU");
//
//        song.addRating(new Rating("Jesse", 5));
//        song.addRating(new Rating("Paul", 5));
//        song.addRating(new Rating("Carl", 3));
//        song.addRating(new Rating("Matt", 5));
//
//        song.removeRatingByReviewer(new Reviewer("Matt"));
//        song.removeRatingByReviewer(new Reviewer("Paul"));
//        song.removeRatingByReviewer(new Reviewer("Jesse"));
//
//
//        song.addRating(new Rating("Paul", 2));
//        song.addRating(new Rating("Jesse", 1));
//
//        LinkedListNode<Rating> computed = song.getRatings();
//        checkRatingsList(computed, expected);
//    }

}