package threesolid;

// Author: Allen Van
// ProductManager is a subclass of Manager and implements the IProduct interface.

public class ProductManager extends Manager implements IProduct {

    public void manage() {  // Utilize the same method manage() parent class Manager.
        worker.work();
    }

    public void defineProduct() {  // Define method from IProduct specifically for ProductManager.
        System.out.println("Need to present the latest product to management...");

    }
}
