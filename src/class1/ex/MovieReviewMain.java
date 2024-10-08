package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();

        MovieReview[] movieReviews = new MovieReview[]{movie1, movie2};
        movieReviews[0].title = "인셉션";
        movieReviews[1].title = "어바웃 타임";

        movieReviews[0].review = "인생은 무한 루프";
        movieReviews[1].review = "인생 시간 영화!";

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + '"' + movieReview.title + '"' + " 리뷰: " + '"' + movieReview.review + '"');
        }
    }
}
