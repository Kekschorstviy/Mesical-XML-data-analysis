import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class NavigationData_Handler {
    private static ArrayList<NavigationData> data = new ArrayList<>();
    public static ArrayList<NavigationData> getData() {
        return data;
    }
    public static void readFromXML(){

            String filename = askUserForFilename();
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            File file = new File(filename);
            Document document = builder.parse(file);

            // Get the root element of the XML document
            Element root = document.getDocumentElement();

            // Get a list of all the NavigationData elements in the document
            NodeList navigationDataNodes = root.getElementsByTagName("NavigationData");

            for (int i = 0; i < navigationDataNodes.getLength(); i++) {

                Element navigationDataElement = (Element) navigationDataNodes.item(i);
                NavigationData nav = new NavigationData();

                nav.setTime(Integer.parseInt(navigationDataElement.getAttribute("Time")));
                nav.setSystemTime(Integer.parseInt(navigationDataElement.getAttribute("SystemTime")));
                nav.setTool(Integer.parseInt(navigationDataElement.getAttribute("Tool")));

                nav.setX (Double.parseDouble(navigationDataElement.getAttribute("X")));
                nav.setY (Double.parseDouble(navigationDataElement.getAttribute("Y")));
                nav.setZ (Double.parseDouble(navigationDataElement.getAttribute("Z")));
                nav.setQx(Double.parseDouble(navigationDataElement.getAttribute("QX")));
                nav.setQy(Double.parseDouble(navigationDataElement.getAttribute("QY")));
                nav.setQz(Double.parseDouble(navigationDataElement.getAttribute("QZ")));
                nav.setQr(Double.parseDouble(navigationDataElement.getAttribute("QR")));

                nav.setC01(Integer.parseInt(navigationDataElement.getAttribute("C01")));
                nav.setC02(Integer.parseInt(navigationDataElement.getAttribute("C02")));
                nav.setC03(Integer.parseInt(navigationDataElement.getAttribute("C03")));
                nav.setC04(Integer.parseInt(navigationDataElement.getAttribute("C04")));
                nav.setC05(Integer.parseInt(navigationDataElement.getAttribute("C05")));
                nav.setC10(Integer.parseInt(navigationDataElement.getAttribute("C10")));
                nav.setC11(Integer.parseInt(navigationDataElement.getAttribute("C11")));
                nav.setC12(Integer.parseInt(navigationDataElement.getAttribute("C12")));
                nav.setC13(Integer.parseInt(navigationDataElement.getAttribute("C13")));
                nav.setC14(Integer.parseInt(navigationDataElement.getAttribute("C14")));
                nav.setC15(Integer.parseInt(navigationDataElement.getAttribute("C15")));

                nav.setValid(Integer.parseInt(navigationDataElement.getAttribute("Valid")));
                nav.sethO(Integer.parseInt(navigationDataElement.getAttribute("hO")));
                nav.sethP(Integer.parseInt(navigationDataElement.getAttribute("hP")));

                data.add(nav);
            }

        }catch (Exception e){
            System.out.println("Invalid File name");
        }
        toString(data);
    }
    private static String askUserForFilename(){
        System.out.println("Filename:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        return fileName;
    }

    public static String toString(ArrayList<NavigationData> data){
        String s;
        s = "";
        for(int i=0; i<data.size(); i++){

            s += data.get(i).getSystemTime()+"\n";
        }
        return s;
    }
    public static void main(String[] args){
        NavigationData_Handler n = new NavigationData_Handler();
        n.readFromXML();

    }
    
    
}
