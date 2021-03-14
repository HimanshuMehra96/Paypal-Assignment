
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Address object
 * <p>
 * address object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line1",
    "line2",
    "city",
    "country",
    "zip_code"
})
public class Address {

    /**
     * first line of address
     * (Required)
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("first line of address")
    @Size(min = 1, max = 1000)
    @NotNull
    private String line1;
    /**
     * second line of address
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("second line of address")
    private String line2;
    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("city")
    @Size(min = 1, max = 255)
    @NotNull
    private String city;
    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("country")
    @Size(min = 1, max = 255)
    @NotNull
    private String country;
    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip_code")
    @NotNull
    private Integer zipCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * first line of address
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * first line of address
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public Address withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * second line of address
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * second line of address
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Address withLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public Integer getZipCode() {
        return zipCode;
    }

    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Address withZipCode(Integer zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
