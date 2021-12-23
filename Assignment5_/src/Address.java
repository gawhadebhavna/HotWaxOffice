public class Address {

    String city,state,country;
    int pinCode;
    public Address(String city,String state,String country,int pinCode)
    {
        this.city=city;
        this.state=state;
        this.country=country;
        this.pinCode=pinCode;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getCity()
    {
        return city;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
    public void setPinCode(int pinCode)
    {
        this.pinCode = pinCode;
    }
    public int getPinCode()
    {
        return pinCode;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getCountry()
    {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
