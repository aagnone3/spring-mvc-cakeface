package org.lifewithdata.cakeface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class CakefaceController {
    
    public static final String COMPANY_NAME = "Cake Factory";
    private static final Logger logger = LoggerFactory.getLogger(CakefaceController.class);
    
    @GetMapping
    public String getHomePage(final Model model) {
        model.addAttribute("companyName", COMPANY_NAME);
        return "index";
    }
}
