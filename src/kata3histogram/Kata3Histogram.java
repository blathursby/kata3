package kata3histogram;

public class Kata3Histogram {

    public static void main(String[] args) {
        MailReader mailReader = new MailReader("mails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder();
        Histogram<String> histogram = builder.build(mailReader.readDomains());
        new HistogramViewer<String>().print(histogram);
    }
}