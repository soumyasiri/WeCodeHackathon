package info.wecode.models;

import java.util.Date;

/**
 * Model class for a donation
 */

public class DonationModel
{
    private Date date;
    private LocationModel location;
    private double amount;

    /**
     * Constructor
     *
     * @param date - date the milk was dropped off
     * @param location - location where the milk was dropped off
     * @param amount - amount of milk in ounces that was donated
     */
    public DonationModel(Date date, LocationModel location, double amount)
    {
        this.date = date;
        this.location = location;
        this.amount = amount;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public LocationModel getLocation()
    {
        return location;
    }

    public void setLocation(LocationModel location)
    {
        this.location = location;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}
