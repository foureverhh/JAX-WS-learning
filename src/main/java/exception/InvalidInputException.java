package exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebFault;

//@WebFault(name = "InvalidInputFault")
public class InvalidInputException extends Exception{
    private String errorDetails;
    public InvalidInputException(String reason, String errorDetails){
        super(reason);
        this.errorDetails = errorDetails;
    }

    //@XmlElement(name = "ErrorDetails")
    public String getErrorDetails() {
        return errorDetails;
    }
}
