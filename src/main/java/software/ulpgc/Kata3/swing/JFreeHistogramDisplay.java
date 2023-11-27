package software.ulpgc.Kata3.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import software.ulpgc.Kata3.Histograma;
import software.ulpgc.Kata3.Histograma;
import software.ulpgc.Kata3.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class JFreeHistogramDisplay extends JPanel implements HistogramDisplay {
    public JFreeHistogramDisplay(){
        setLayout(new BorderLayout());
    }

    @Override
    public void show(Histograma histograma) {
        add(new ChartPanel(chart(dataset(histograma.values(), histograma.bins()))));
    }

    private JFreeChart chart(HistogramDataset dataset){
        return ChartFactory.createHistogram(
                "",
                "values",
                "count",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
    }

    private HistogramDataset dataset(double[] values, int bins) {
        HistogramDataset result = new HistogramDataset();
        result.addSeries("x", values, bins);
        return result;
    }
}
