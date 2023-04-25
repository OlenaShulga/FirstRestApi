package pl.edu.vistula.fisrstrestappi.product.support;
import pl.edu.vistula.fisrstrestappi.shared.api.response.ErrorMessageResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.edu.vistula.fisrstrestappi.product.support.exception.ProductNotFoundException;
//import java.util.logging.Logger;

@ControllerAdvice
public class ProductExceptionAdviser {
    private static final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdviser.class);

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound(Exception e){
        LOG.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }

}
