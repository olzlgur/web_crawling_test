package example.webcrwaling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import static example.webcrwaling.service.CrawlingService.getinfo;

@RestController
public class CrawlingController {

    @GetMapping("/crawling")
    public void getCrawling() throws IOException, ParseException {

        getinfo();

        return;
    }
}
