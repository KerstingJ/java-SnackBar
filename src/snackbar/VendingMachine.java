package snackbar;;

public class VendingMachine
{
    private int id;
    private static int maxId;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void buy(Customer customer, Snack snack, int amount)
    {
        customer.buy(snack.getCost(amount));
        snack.buy(amount);
    }
}