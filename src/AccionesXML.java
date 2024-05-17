public class AccionesXML implements DatosFormatoXML{
    private String datosXML;

    public AccionesXML(String datosXML) {
        this.datosXML = datosXML;
    }

    @Override
    public String obtenerDatosXML() {
        return datosXML;
    }
}
