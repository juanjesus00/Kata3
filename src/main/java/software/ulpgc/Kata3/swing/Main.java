package software.ulpgc.Kata3.swing;

import software.ulpgc.Kata3.HistogramDisplay;
import software.ulpgc.Kata3.Histograma;

public class Main {
    public static void main(String[] args) {
        Histograma histogram = new Histograma(4, 3, 2, 4, 1, 6, 2, 8, 10, 5, 3, 5);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
