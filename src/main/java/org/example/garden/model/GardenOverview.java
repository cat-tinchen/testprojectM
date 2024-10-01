package org.example.garden.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GardenOverview {

    @GetMapping("/garden/list")
    public String showOverview(Model model) {
        return "garden-list";
    }
}
