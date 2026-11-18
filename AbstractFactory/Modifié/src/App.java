import produitFactory.IProduit;
import produitFactory.ProduitFactory1;
import produitFactory.ProduitFactory2;
import produits.ProduitA;
import produits.ProduitB;
import produits.ProduitC;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        System.out.println("Methode 2");

        ProduitFactory1 produitFactory1 = new ProduitFactory1();
        ProduitFactory2 produitFactory2 = new ProduitFactory2();

        ProduitA a1 = produitFactory1.getProduitA();
        ProduitB b1 = produitFactory1.getProduitB();
        ProduitC c1 = produitFactory1.getProduitC();

        a1.produitA();
        b1.produitB();
        c1.produitC();

        ProduitA a2 = produitFactory2.getProduitA();
        ProduitB b2 = produitFactory2.getProduitB();
        ProduitC c2 = produitFactory2.getProduitC();

        a2.produitA();
        b2.produitB();
        c2.produitC();
    }   
}
