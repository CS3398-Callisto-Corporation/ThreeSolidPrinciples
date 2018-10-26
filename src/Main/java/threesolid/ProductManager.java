package threesolid;

/** @author Allen Van
 *
 *  ProductManager is a subclass of Manager and implements the IProduct interface.
 */


public class ProductManager extends Manager implements IProduct {
    @Override
    public String work() { return("Product Manager is Working on new products!"); }

    public void eat() { System.out.println("Product Manager is on lunch break!"); }

    public void sick() { System.out.println("Product Manager is sick today!"); }

    public void defineProduct() { System.out.println("Need to present the latest product to management. Showtime!"); }
}
