package Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {


    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();


    private Plec plec;
    @Autowired
    public GreetingController(Plec plec){
        this.plec=plec;
    }



    @RequestMapping(path="/bye", method = GET) // odpowiada endpoint’om http
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String name,
                        @RequestParam(value = "wiek", defaultValue = "World") String wiek
                        )
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, wiek),String.format(template, plec.Sprawdzenie(name)));
    }
    @RequestMapping("/byebye") // odpowiada endpoint’om http
    public Greeting byebye(@RequestParam(value = "name", defaultValue = "World") String
                                     name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name)," ", String.format(template, plec.Sprawdzenie(name)));
    }

}