public class Student{

    String firstName,dateOfBirth;
    Address address;
    public Student(String firstName,String dateOfBirth)
    {
       this.firstName=firstName;
       this.dateOfBirth=dateOfBirth;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setDateOfBirth()
    {
        this.setDateOfBirth();
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }
}
