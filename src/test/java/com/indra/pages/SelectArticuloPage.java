package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/")

public class SelectArticuloPage extends PageObject {

    public SelectArticuloPage(WebDriver driver) {
        super(driver);
    }

    /*********** login ***************/

    @FindBy(id = "menuUser")
    private WebElementFacade btnLoginIcono;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnSignIn;

    public WebElementFacade getCargaEnMenu() {
        return cargaEnMenu;
    }

    public List<WebElement> getColorArticulo() {
        return colorArticulo;
    }

    public List<WebElementFacade> getCategoriaDeLosProductosEnElHome() {
        return categoriaDeLosProductosEnElHome;
    }

    /****************  agregar articulo *****************/

    @FindBy(className = "loader")
    private WebElementFacade cargaEnMenu;

    @FindBy(xpath = "//div[@id='coverImages']//div[@class='imageAlias ng-scope']")
    private List<WebElement> vistasDelArticulo;

    @FindBy(xpath = "(//div[@ng-show])[2]//span")
    private List<WebElement> colorArticulo;

    @FindBy(xpath = "(//div[contains(@ng-show,'firstImageToShow')])[2]")
    private WebElementFacade primerColorDisponible;

    @FindBy(xpath = "//input[@name='quantity']")
    private WebElementFacade cantidadDeArticulos;

    @FindBy(xpath = "//button[@name='save_to_cart']")
    private WebElementFacade botonAddToCart;

    @FindBy(xpath = "(//label[contains(@class,'attr ng-binding')])")
    private List<WebElementFacade> especificacionesDelProducto;

    @FindBy(xpath = "(//span[@class='cart ng-binding'])[2]")
    private WebElementFacade cantidadDeProductosEnElCarrito;

    @FindBy(xpath = "(//span[contains(@class,'shop_now roboto-bold ng-binding')])")
    private List<WebElementFacade> categoriaDeLosProductosEnElHome;

    @FindBy(xpath = "//button[@name='buy_now']")
    private WebElementFacade botonBuyNow;

    @FindBy(xpath = "(//a[contains(@class,'productName ng-binding')])")
    private List<WebElementFacade> productosEnLaCategoria;


    public List<WebElement> getVistasDelArticulo() {
        return vistasDelArticulo;
    }

    public List<WebElement> getColoresDelArticulo() {
        return colorArticulo;
    }

    public WebElementFacade getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    public WebElementFacade getBotonAddToCart() {
        return botonAddToCart;
    }

    public List<WebElementFacade> getEspecificacionesDelProducto() {
        return especificacionesDelProducto;
    }

    public WebElementFacade getCantidadDeProductosEnElCarrito() {
        return cantidadDeProductosEnElCarrito;
    }

    public WebElementFacade getBtnLoginIcono() {
        return btnLoginIcono;
    }

    public WebElementFacade getUserName() {
        return userName;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnSignIn() {
        return btnSignIn;
    }

    public List<WebElementFacade> getCategoriasDeLosProductosEnElHome() {
        return categoriaDeLosProductosEnElHome;
    }

    public WebElementFacade getBotonBuyNow() {
        return botonBuyNow;
    }

    public List<WebElementFacade> getProductosEnLaCategoria() {
        return productosEnLaCategoria;
    }
}
