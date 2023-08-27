package com.example.project_2.controllers.RestControllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    //@Autowired
    //private StripeService stripeService;

    @GetMapping("/GetInfo")
    public String getInfo() {
        return "hello Spring Rest Java";
    }

    @GetMapping("TestMethod")
    public String testMethod() {
        return "TestMethod";
    }

   /* @PostMapping("/GetInfo")
    public StripeChargeDto getInfoPOST(@RequestBody StripeChargeDto model) {
        System.out.println(model.getChargeId());
        System.out.println(model.getUsername());
        System.out.println(model.getAmount());
        System.out.println(model.getStripeToken());
        System.out.println(model.getMessage());
        return stripeService.charge(model);
    } */
}
