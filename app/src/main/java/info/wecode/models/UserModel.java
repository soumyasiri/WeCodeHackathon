package info.wecode.models;

import java.util.ArrayList;

public class UserModel
{
    private String firstName;
    private String lastName;
    private int id;
    private String email;
    private String userType;
    private String phoneNumber;
    private ArrayList<DonationModel> donations;


    /**
     * Constructor
     *
     * @param firstName - first name of the user
     * @param lastName - last name of the user
     * @param id - id of the user
     * @param email - email address of the user
     * @param userType - type of user (donor or admin)
     * @param phoneNumber - phone number of the user
     */
    public UserModel(String firstName, String lastName, int id, String email, String userType, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        this.email = email;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
        this.donations = new ArrayList<DonationModel>();
    }

    /**
     * Adds a donation to the donation list for the user
     *
     * @param donation - donation to be added to the donation list
     */
    public void addDonation(DonationModel donation)
    {
        this.donations.add(donation);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUserType()
    {
        return userType;
    }

    public void setUserType(String userType)
    {
        this.userType = userType;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
