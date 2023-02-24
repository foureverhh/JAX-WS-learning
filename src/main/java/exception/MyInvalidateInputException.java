package exception;

import javax.xml.ws.WebFault;

// @WebFault(name = "MyInvalidateInput", targetNamespace = "http://exceptions/")
public class MyInvalidateInputException extends Exception {
    private String errorDetails;


    public MyInvalidateInputException() {}

    public MyInvalidateInputException(String reason, String errorDetails) {
        super(reason);
        this.errorDetails = errorDetails;
    }

    public String getFaultInfo() {
        return errorDetails;
    }

}
