package produitFactory;

import produits.ProduitA;
import produits.ProduitB;
import produits.ProduitA2;
import produits.ProduitB2;
import produits.ProduitC;
import produits.ProduitC2;

public class ProduitFactory2 implements IProduit {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC2();
    }
}
