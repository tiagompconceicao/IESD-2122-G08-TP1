
package isos.tp1.isyiesd.cesvector.servector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ITransactionManagerAX", targetNamespace = "http://iesd21.isos.isyiesd.cestc.sertmserver")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ITransactionManagerAX {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ax_reg")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ax_reg", targetNamespace = "http://iesd21.isos.isyiesd.cestc.sertmserver", className = "isos.tp1.isyiesd.cesvector.servector.AxReg")
    @ResponseWrapper(localName = "ax_regResponse", targetNamespace = "http://iesd21.isos.isyiesd.cestc.sertmserver", className = "isos.tp1.isyiesd.cesvector.servector.AxRegResponse")
    @Action(input = "http://iesd21.isos.isyiesd.cestc.sertmserver/ITransactionManagerAX/ax_regRequest", output = "http://iesd21.isos.isyiesd.cestc.sertmserver/ITransactionManagerAX/ax_regResponse")
    public boolean axReg(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
