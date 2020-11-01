package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String fistPage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Programming Languages</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Phyton</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'POST' action = '/form'>" +
                        "<label for='name'>Name:</label>" +
                        "<br>" +
                        "<input type = 'text' name = 'name'>" +
                        "<br>" +
                        "<label for='language1'>My favorite language:</label>" +
                        "<br>" +
                        "<select name='language1'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Phyton'>Phyton</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='language2'>My second favorite language:</label>" +
                        "<br>" +
                        "<select name='language2'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Phyton'>Phyton</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='language3'>My third favorite language:</label>" +
                        "<br>" +
                        "<select name='language3'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Phyton'>Phyton</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit' value = 'Submit'>" +
                        "<br>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    public String form(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return message(name, language1, language2, language3);
    }

    public static String message(String name, String language1, String language2, String language3) {
        return  "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 +"</li>" +
                "<li>" + language2 +"</li>" +
                "<li>" + language3 +"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
