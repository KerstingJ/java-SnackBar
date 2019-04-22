package snackbar;;

public class Main
{
    private static void doTheStuff()
    {
        //this is where i need to do some stuff
        // create some customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // create new vending machine
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        // create some snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 36, 1.00, drink.getId());

        // have them interact with each other
        System.out.println("\n\n\nCustomer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
        jane.buy(soda.getCost(3));
        soda.buy(3);

        System.out.println("janes cash on hand: " + jane.getCashOnHand());
        System.out.println("amount of soda left: " + soda.getQuantity());

        System.out.println("\n\nCustomer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
        jane.buy(pretzel.getCost(1));
        pretzel.buy(1);

        System.out.println("janes cash on hand: " + jane.getCashOnHand());
        System.out.println("amount of pretzels left: " + pretzel.getQuantity());

        System.out.println("\n\nCustomer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
        bob.buy(soda.getCost(2));
        soda.buy(2);

        System.out.println("bobs cash on hand: " + bob.getCashOnHand());
        System.out.println("amount of soda left: " + soda.getQuantity());

        System.out.println("\n\nCustomer 1 finds $10. Print Customer 1 Cash on Hand.");
        jane.addCash(10);
        System.out.println("janes cash on hand: " + jane.getCashOnHand());

        System.out.println("\n\nCustomer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");
        jane.buy(chocolateBar.getCost(2));
        chocolateBar.buy(2);

        System.out.println("janes cash on hand: " + jane.getCashOnHand());
        System.out.println("amount of chocolate bars left: " + chocolateBar.getQuantity());

        System.out.println("\n\nAdd 12 more items to snack 3. Print quantity of snack 3.");
        pretzel.addQuantity(12);
        System.out.println("amount fo pretzels: " + pretzel.getQuantity());

        System.out.println("\n\nCustomer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.");
        bob.buy(pretzel.getCost(3));
        pretzel.buy(3);
        System.out.println("bobs cash on hand: " + bob.getCashOnHand());
        System.out.println("aount of pretzels left" + pretzel.getQuantity());

        System.out.println("\n\n WE FRIGGEN GOT IT \n\n");
        //Issa comment
    }

    public static void main(String[] args)
    {
        doTheStuff();
    }
}