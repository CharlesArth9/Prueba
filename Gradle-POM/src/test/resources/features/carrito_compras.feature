#language: es

Característica: Seleccionar un producto y agregarlo al carrito de compras

  Antecedentes:
    Dado que el usuario se encuentra en la pagina web de Alkomprar

  Escenario: Agregar un producto al carrito de compras exitosamente
    Cuando el usuario escribe un producto en la barra de busqueda
    Y escoge un producto aleatorio
    Y lo agrega al carrito de compras
    Entonces valida que el producto esta en el carrito de compras