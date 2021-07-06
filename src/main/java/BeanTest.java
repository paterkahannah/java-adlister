import java.util.ArrayList;

public class BeanTest {



    public static void main(String[] args) {
        Album testAlbum = new Album();

        Author testAuthor = new Author();

        Author author = new Author(1, "Hannah", "Paterka");
        Author author2 = new Author(2, "Hannah2", "Paterka2");

        Quote testQuote1 = new Quote(1, "words", author);
        Quote testQuote2 = new Quote(3, "words2", author2);
//        Quote testQuote2 = new Quote(2, "2words", "2author");
//        Quote testQuote3 = new Quote(3, "2words", "2author");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(testQuote1);
        quotes.add(testQuote2);
//        quotes.add(testQuote3);

        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor().getFirstName());
//            System.out.println(quote.getAuthor().getLastName());
            System.out.println(quote.getContent());
        }
    }



}
