package com.example.project_2.entitys.stripeEntitys;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
public class StripeChargeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String  stripeToken;
    private String  username;
    private Double  amount;
    private Boolean success;
    private String  message;
    private String chargeId;


    //private Map<String,Object> additionalInfo = new HashMap<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStripeToken() {
        return stripeToken;
    }

    public void setStripeToken(String stripeToken) {
        this.stripeToken = stripeToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    //public Map<String, Object> getAdditionalInfo() {
        //return additionalInfo;
    //}

    //public void setAdditionalInfo(Map<String, Object> additionalInfo) {
        //this.additionalInfo = additionalInfo;
    //}
}
