package example;

public class Product {
    protected int stock;

    public void sell(int quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
            System.out.println(this.getProductName() + " vendido. Stock actualizado: " + this.stock);
        } else {
            System.out.println("Stock insuficiente para " + this.getProductName() + ".");
        }
    }
    
    protected String getProductName() {
        return "Producto"; // Este valor puede ser sobrescrito por las clases hijas para reflejar el nombre del producto.
    }
}


// La superclase Product encapsula la lógica común de gestión de ventas y stock.
// Al heredar de Product, las subclases Book, Game, y cualquier otra clase de producto futura,
// utilizan el método sell() común sin duplicación de código. Esto sigue el principio DRY,
// ya que centraliza la lógica de actualización de stock en un solo lugar, facilitando el mantenimiento y la expansión.