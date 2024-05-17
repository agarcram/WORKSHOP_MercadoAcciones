public class Main {
    public static void main(String[] args) {

        String datosXML = "<accion><nombre>Alexis</nombre><precio>200</precio></accion>";
        DatosFormatoXML datosFormatoXML = new AccionesXML(datosXML);

        DatosFormatoJSON datosFormatoJSON = new convertidorXMLAJSON(datosFormatoXML);

        LibreriaTerceros libreriaAnalitica = new LibreriaTerceros();
        libreriaAnalitica.analizar(datosFormatoJSON);
    }
}
