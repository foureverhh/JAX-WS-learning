package shop;

import exception.InvalidInputException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
//@SOAPBinding(style = SOAPBinding.Style.RPC)
// @BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class ShopInfo {
   /*
    @WebMethod
    @WebResult(partName = "lookupOutput")
    public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws Exception {
        //String response = "Invalid property";
        //Test xml exception handling
        String response = "";
        if("shopName".equals(property)){
            response = "Test Mart";
        }else if("since".equals(property)){
            response = "since 2012";
        }else {
            response = "error";
            //throw new InvalidInputException("Invalid input", " not a valid input");
            throw new Exception("Invalid input");
        }
        return response;
    }

    */
    @WebMethod
    public String getShopInfoSample1(String property) {
        String response = "Invalid property";
        if("shopName".equals(property))
            response = "shopName";
        else if ("since".equals(property))
            response = "since";
        return response;
    }
}
