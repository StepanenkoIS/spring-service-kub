package is.controllers;


import is.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/getString")
    public String getMsgString() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String nowTime = formatter.format(date);
        logger.info("In method getMsgString(). Output: " + nowTime);
        return "Testing, now time: " + nowTime;
    }

    @GetMapping("/getProduct")
    public Product getMsgProduct() {
        Product product = new Product("getMsgProduct", "lamp", "IEK", "E27, 11 watt", "200,00");
        logger.info("In method getMsgProduct(). Create : " + product);
        return product;
    }


}