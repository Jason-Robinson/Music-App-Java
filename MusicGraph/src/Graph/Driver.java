package Graph;
import java.util.*;
import java.awt.*; 
import javax.swing.*;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
public class Driver {

	static UserInput UI = new UserInput(); 
	
	public static void main(String[] args) {
			UI.initUI();
			
			Chart chart = new Chart("Browser Usage Statistics", "Which Browser are you using?");
		      chart.pack( );          
		      RefineryUtilities.centerFrameOnScreen( chart );          
		      chart.setVisible( true ); 
	}

	

}
