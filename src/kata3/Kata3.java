package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("email.com");
        histogram.increment("gmail.com");
        histogram.increment("email.com");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        
        
        HistogramDisplay histDisplay = new HistogramDisplay(histogram);
        histDisplay.excute();
    }

}
