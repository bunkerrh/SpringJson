package json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryanh on 5/20/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = tru)
public class Address
{
    private String street;
    private String city;
    private String state;

    private String zip;

    public Address(){}

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }



    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }
}
