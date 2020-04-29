import java.util.Arrays;

/*Inside the method setFavoriteArticle(),
set the value of the favoriteArticles array at index favoriteIndex to be the value of newArticle.


For example, if I called setFavoriteArticle(2, "Celebrity Hands Throughout the Decades"),
the value of favoriteArticles at index 2 would be set to "Celebrity Hands Throughout the Decades".
*/
public class ExampleofArray {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
        int[] views = {0, 0, 0, 0};
        String[] favoriteArticles;

        public ExampleofArray(){
            // Initialize favoriteArticles here:
            favoriteArticles = new String[10];
        }

        public void setFavoriteArticle(int favoriteIndex, String newArticle){
            // Add newArticle to favoriteArticles:
            favoriteArticles[favoriteIndex] = newArticle;

        }

        public static void main(String[] args){
            ExampleofArray sampleFeed = new ExampleofArray();

            sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
            sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
            sampleFeed.setFavoriteArticle(0, "Oil News");

            System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
            System.out.println(sampleFeed.favoriteArticles.length);

        }
    }

/*
declaring an array
  double[] mathScores = new double[4];

  ArrayList operations:
  Creating an ArrayList.
Adding a new ArrayList item using add().
Accessing the size of an ArrayList using size().
Finding an item by index using get().
Changing the value of an ArrayList item using set().
Removing an item with a specific value using remove().
Retrieving the index of an item with a specific value using indexOf().

    So how can you pass arguments to main()? Let’s say we have this class HelloYou:

public class HelloYou {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
    When we run the file HelloYou in the terminal with an argument of "Laura":

        java HelloYou Laura
        We get the output:

        Hello Laura
        The String[] args would be interpreted as an array with one element, "Laura".

        When we use args[0] in the main method, we can access that element like we did in HelloYou.
    We want to give the user an option to make a Newsfeed object for robots or for humans.

        We will take either "Robot" or "Human" as an argument to the main() method when the Newsfeed.java file is run.

        If the args array holds "Human", we will initialize the feed with human topics.
        If the args array holds "Robot", we will initialize the feed with robot topics.
        Replace the blank in the conditional statement to reflect this expected control flow.

        import java.util.Arrays;

public class Newsfeed {

    String[] topics;

    public Newsfeed(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        Newsfeed feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Newsfeed(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Newsfeed(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Newsfeed(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

*/

