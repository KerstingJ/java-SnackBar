package snackbar;;

public class Snack
{
    private int id;
    private static int maxId;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void buy(int quantity)
    {
        this.quantity -= quantity;
    }

    public double getCost(int quantity)
    {
        return cost * quantity;
    }

    @Override
    public String toString()
    {
        return this.getName()
                + ", qty: " + this.getQuantity()
                + ", total value: " + this.getQuantity() * this.getCost() + ".";
    }

}