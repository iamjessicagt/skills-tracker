package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String languages () {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Phyton</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm () {
        return "<html>" +
                    "<body>" +
                        "<form action='form' method='post'>" +
                            "<label>Name:</label>" +
                            "<br>" +
                            "<input type='text' name='name'>" +
                            "<br>" +
                            "<label for='language'>My favorite language:</label>" +
                            "<br>" +
                            "<select name='first' id='skill'>" +
                                "<option value='JAVA'>Java</option>" +
                                "<option value='JAVASCRIPT'>JavaScript</option>" +
                                "<option value='PHP'>PHP</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for='language'>My second favorite language:</label>" +
                            "<br>" +
                            "<select name='second' id='skill'>" +
                                "<option value='JAVA'>Java</option>" +
                                "<option value='JAVASCRIPT'>JavaScript</option>" +
                                "<option value='PHP'>PHP</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for='language'>My third favorite language:</label>" +
                            "<br>" +
                            "<select name='third' id='skill'>" +
                                "<option value='JAVA'>Java</option>" +
                                "<option value='JAVASCRIPT'>JavaScript</option>" +
                                "<option value='PHP'>PHP</option>" +
                            "</select>" +
                            "<br>" +
                            "<input type='submit' value='Submit it'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String form(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return createMessage(name, first, second, third);
    }
    public static String createMessage(String name, String first, String second, String third) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
