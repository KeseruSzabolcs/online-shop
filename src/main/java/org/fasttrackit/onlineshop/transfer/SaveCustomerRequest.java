package org.fasttrackit.onlineshop.transfer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SaveCustomerRequest {

    @NotNull
    private String FirstName;
    @NotBlank
    private String LastName;



    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "SaveCustomerRequest{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
