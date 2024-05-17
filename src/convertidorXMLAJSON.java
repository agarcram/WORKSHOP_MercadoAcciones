import org.json.JSONObject;
import org.json.XML;


public class convertidorXMLAJSON implements DatosFormatoJSON{
    private DatosFormatoXML datosFormatoXML;

    public convertidorXMLAJSON(DatosFormatoXML datosFormatoXML) {
        this.datosFormatoXML = datosFormatoXML;
    }

    @Override
    public String obtenerDatosJSON() {
        String datosXML = datosFormatoXML.obtenerDatosXML();
        JSONObject jsonObject = XML.toJSONObject(datosXML);
        return jsonObject.toString();
    }
}
