package com.indra.actions;

import com.indra.pages.SelectArticuloPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class SelectArticuloActions extends SelectArticuloPage {

    public SelectArticuloActions(WebDriver driver) {
        super(driver);
    }

    public void addLogin(){
        clicSignInIcono();
        getCargaEnMenu().waitUntilNotVisible();
        getBtnLoginIcono().waitUntilClickable();
        infoLogin("manuel2020","Mde%42fggre");
        clicBtnSignI();
    }

    public void clicSignInIcono(){
        getBtnLoginIcono().click();
    }

    public void clicBtnSignI(){
        getBtnSignIn().waitUntilPresent();
        getBtnSignIn().click();
    }

    public void infoLogin(String user, String password){
        enter(user).into(getUserName());
        enter(password).into(getPassword());
    }

    public void vizualizarVistasProducto (){
        MatcherAssert.assertThat("Vista de 1 solo producto", getVistasDelArticulo().size(),
                Matchers.greaterThan(0));
    }

    public void selectColorProduct (){
        MatcherAssert.assertThat("Seleccionar un 1 color", getColoresDelArticulo().size(),
                Matchers.greaterThan(0));
    }

    public void aumentarCantidadProduct (){
        getCantidadDeArticulos().clear();getCantidadDeArticulos().sendKeys("3");
        MatcherAssert.assertThat("La cantidad de articulos es de 3", String.valueOf(getCantidadDeArticulos().getValue()),Matchers.equalTo("3"));
    }

    public void vizualizaBtnAddToCart (){
        MatcherAssert.assertThat("El btn Buy Now es visible",
                String.valueOf(getBotonAddToCart().isEnabled()),
                Matchers.equalTo("true"));
    }

    public void addProductAlCarrito (){
        getBotonAddToCart().click();
    }

    public void verProductoSiEstaAdicionado(){
        MatcherAssert.assertThat("La cantidad de productos es de 1", getCantidadDeProductosEnElCarrito().getText(),
                Matchers.equalTo("1"));
    }

    public void visualizarLasEspecificacionesDelProducto(){
        MatcherAssert.assertThat("Lista contiene una sola informacion",
                getEspecificacionesDelProducto().size(),
                Matchers.greaterThan(0));
    }

    public void ingresarACategoriaSeleccionada (String seleccionarCategoria){
        for(int i=0; i< getCategoriasDeLosProductosEnElHome().size(); i++) {
            if (getCategoriasDeLosProductosEnElHome().get(i).getText().equals(seleccionarCategoria)){
                getCategoriasDeLosProductosEnElHome().get(i).click();
                break;
            }
        }
    }

    public void vistaDelBtnBuyNow (){
        MatcherAssert.assertThat("El btn Buy Now es visible", String.valueOf(getBotonBuyNow().isVisible()),
                Matchers.equalTo("true"));
    }

    public void aggAlProductoSelect (String productoASeleccionar){
        for(int i=0; i< getProductosEnLaCategoria().size(); i++) {
            if (getProductosEnLaCategoria().get(i).getText().equals(productoASeleccionar)){
                getProductosEnLaCategoria().get(i).click();
                break;
            }
        }
    }
}
