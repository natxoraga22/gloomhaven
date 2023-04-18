package txraga.gloomhaven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.XSlf4j;


@XSlf4j
@Controller
@RequestMapping("/")
public class CampaignController {
    
    @GetMapping("")
    public ModelAndView campaign() {
        log.entry();
        return log.exit(new ModelAndView("campaign"));
    }

}
