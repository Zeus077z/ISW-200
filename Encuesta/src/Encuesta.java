
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Daniel
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
         // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("1H a 8H", 60);
        data.setValue("9H a 15H", 25);
        data.setValue("16H a 24H", 10);
        data.setValue("24H en adelante",5);
        
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Pastel de rango de horas de estudiantes trabajadores", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Pastel - Horas", chart);
        frame.pack();
        frame.setVisible(true);      
    }

    private static void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
