package shop;

import exception.MyInvalidateInputException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

// Demo for error handling
@WebService
public class MyShopInfo {
  @WebMethod
  @WebResult(partName = "lookupOutput")
  public String getMyShopInfo(@WebParam(partName = "lookupInput") String property) throws MyInvalidateInputException {
      // String response = "Invalid property";
      String response = null;
      if(property.equalsIgnoreCase("shopName")) {
          response = "TEST MART";
      }else if (property.equalsIgnoreCase("since")) {
          response = "since 2012";
      } else {
          throw new MyInvalidateInputException("Invalid Input error", property + " is not a valid input");
      }
      return "response is " + response;
  }
}
