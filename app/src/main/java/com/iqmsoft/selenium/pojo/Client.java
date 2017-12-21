package com.iqmsoft.selenium.pojo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public Date dob;
    public String firstName;
    public String lastName;
    public Map<String, Address> addresses = new HashMap<>();

}
