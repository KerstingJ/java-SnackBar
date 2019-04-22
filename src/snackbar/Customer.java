package snackbar;;

public class Customer
{
    private int id;
    private static int maxId;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void addCash(double amount)
    {
        cashOnHand += amount;
    }

    public void buy(double cost)
    {
        cashOnHand -= cost;
    }



}