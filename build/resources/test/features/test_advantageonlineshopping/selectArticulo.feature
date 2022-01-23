@test
Feature: Selección en línea de productos de tecnología

  Yo como usuario
  Quiero Seleccionar artículos de tecnología en línea para adicionar al canasto y luego realizar el pago.


  Scenario: Debe Seleccionar la categoria de cualquier producto de tecnologia
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    Then se debe visualizar el boton de BUY NOW del producto favorito

  Scenario: Debe vizualizar las diferentes vistas del articulo
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    Then se debe visualizar las vistas del articulo

  Scenario: Debe permitir seleccionar el color del producto
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    Then se puede seleccionar el color del producto

  Scenario: Debe permitir seleccionar la cantidad que se desea comprar
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    Then se puede seleccionar la cantidad que se desea comprar

  Scenario: Debe vizualizar el boton ADD TO CART
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    Then se debe visualizar el boton ADD TO CART

  Scenario: Debe vizualizar las caracteristicas del producto
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    Then se debe visualizar las especificaciones del producto

  Scenario: Debe poder adicionar productos al carrito de compras
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario entra a la categoria MICE
    And el usuario ingresa a el producto HP Z3600 Wireless Mouse
    And adiciona el producto a el carrito
    Then el carrito tiene el producto adicionado




