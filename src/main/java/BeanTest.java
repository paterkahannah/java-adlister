import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album testAlbum = new Album(1, "Led Zep", "Fire", 2018, "Metal", 3000);

        Author testAuthor = new Author();

        Author author = new Author(1, "Hannah", "Paterka");
        Author author2 = new Author(2, "Hannah2", "Paterka2");

        Quote testQuote1 = new Quote(1, "words", author);
        Quote testQuote2 = new Quote(3, "words2", author2);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(testQuote1);
        quotes.add(testQuote2);

        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor().getFirstName());
            System.out.println(quote.getContent());
        }
    }



}
