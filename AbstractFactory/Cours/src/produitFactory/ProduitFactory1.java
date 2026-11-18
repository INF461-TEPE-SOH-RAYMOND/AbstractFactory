package produitFactory;

import produits.ProduitA;
import produits.ProduitA1;
import produits.ProduitB;
import produits.ProduitB1;

public class ProduitFactory1 implements IProduit {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    

}
