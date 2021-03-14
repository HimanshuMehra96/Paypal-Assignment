
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee resource
 * <p>
 * Employee resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "date_of_birth",
    "address"
})
public class Employee {

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("employee id")
    private Integer id;
    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("first name")
    @Size(min = 1, max = 255)
    @NotNull
    private String firstName;
    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("last name")
    @Size(min = 1, max = 255)
    @NotNull
    private String lastName;
    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "UTC")
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("date of birth")
    @NotNull
    private Date dateOfBirth;
    /**
     * Address object
     * <p>
     * address object
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("address object")
    @Valid
    @NotNull
    private Address address;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Employee withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Employee withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee withDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Address object
     * <p>
     * address object
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address object
     * <p>
     * address object
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee withAddress(Address address) {
        this.address = address;
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

    public Employee withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
