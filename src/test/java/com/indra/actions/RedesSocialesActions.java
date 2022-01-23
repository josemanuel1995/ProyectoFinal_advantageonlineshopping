package com.indra.actions;

import com.indra.models.RedesSocialesModels;
import com.indra.pages.RedesSocialesPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


@DefaultUrl("/#/")

public class RedesSocialesActions extends RedesSocialesPage {

    public RedesSocialesActions(WebDriver driver) {
        super(driver);
    }

    public void procesoRedesSociales(){
        getVistaDeLasRedesSociales().waitUntilPresent();
    }

    public void verificarConteoRedesSociales(RedesSocialesModels redesSocialesList){

        List<String> listRedSocial = new ArrayList<>();
        listRedSocial.add(redesSocialesList.getRed1());
        listRedSocial.add(redesSocialesList.getRed2());
        listRedSocial.add(redesSocialesList.getRed3());

        int contRedSocial=0;

        for (WebElement redes : getListadodelasRedesSociales()){
            for (int i = 0; i<listRedSocial.size();i ++){
                if(redes.getAttribute("name").split("_")[1].equals(listRedSocial.get(i).toLowerCase())){
                    contRedSocial++;
                }
            }
        }
        MatcherAssert.assertThat("Se debe visualizar 3 coincidencias",contRedSocial, Matchers.is(listRedSocial.size()));
    }
}
