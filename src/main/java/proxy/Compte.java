
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="sode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "sode"
})
public class Compte {

    protected double code;
    protected double sode;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     */
    public double getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     */
    public void setCode(double value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� sode.
     * 
     */
    public double getSode() {
        return sode;
    }

    /**
     * D�finit la valeur de la propri�t� sode.
     * 
     */
    public void setSode(double value) {
        this.sode = value;
    }

}
