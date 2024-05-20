package easymytrip.example.easymytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Railway

    {
        @GetMapping("/railway")
        public String getdata()  {return  "Please book your train ticket on vande bharat 45% discount" ; }
    }



