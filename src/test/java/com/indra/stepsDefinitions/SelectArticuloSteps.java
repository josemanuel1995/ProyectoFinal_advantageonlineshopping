package com.indra.stepsDefinitions;

import com.indra.actions.SelectArticuloActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectArticuloSteps {
    @Managed
    WebDriver driver;
    SelectArticuloActions CartArticuloActions = new SelectArticuloActions(driver);

    @Given("^el usuario se loguea para ingresar a la pagina principal$")
    public void elusuarioselogueaparaingresaralapaginaprincipal() {
        CartArticuloActions.open();
        CartArticuloActions.addLogin();
    }

    @When("^el usuario entra a la categoria (.*)$")
    public void elusuarioentraalacategoria(String categoriaASeleccionar) {
        CartArticuloActions.ingresarACategoriaSeleccionada(categoriaASeleccionar);
    }

    @Then("^se debe visualizar el boton de BUY NOW del producto favorito$")
    public void sedebevisualizarelbotondeBUYNOWdelproductofavorito() {
        CartArticuloActions.vistaDelBtnBuyNow();
    }

    @When("^el usuario ingresa a el producto (.*)$")
    public void elusuarioingresaaelproducto(String productoASeleccionar) {
        CartArticuloActions.aggAlProductoSelect(productoASeleccionar);
    }

    @Then("^se debe visualizar las vistas del articulo$")
    public void sedebevisualizarlasvistasdelarticulo() {
        CartArticuloActions.vizualizarVistasProducto();
    }

    @Then("^se puede seleccionar el color del producto$")
    public void sepuedeseleccionarelcolordelproducto() {
        CartArticuloActions.selectColorProduct();
    }

    @Then("^se puede seleccionar la cantidad que se desea comprar$")
    public void sepuedeseleccionarlacantidadquesedeseacomprar() {
        CartArticuloActions.aumentarCantidadProduct();
    }

    @Then("^se debe visualizar el boton ADD TO CART$")
    public void sedebevisualizarelbotonADDTOCART() {
        CartArticuloActions.vizualizaBtnAddToCart();
    }

    @When("^adiciona el producto a el carrito$")
    public void adicionaelproductoaelcarrito() {
        CartArticuloActions.addProductAlCarrito();
    }

    @Then("^el carrito tiene el producto adicionado$")
    public void elcarritotieneelproductoadicionado() {
        CartArticuloActions.verProductoSiEstaAdicionado();
    }

    @Then("^se debe visualizar las especificaciones del producto$")
    public void sedebevisualizarlasespecificacionesdelproducto() {
        CartArticuloActions.visualizarLasEspecificacionesDelProducto();
    }
}
