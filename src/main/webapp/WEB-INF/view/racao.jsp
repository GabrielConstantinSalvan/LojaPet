<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DescriÃ§Ã£o</title>
    <link rel="stylesheet" href="css/racao.css">
</head>
<body>
    <nav class="navbar">
        <a href="home"><img src="images/logo.png" alt="Logo da Loja" class="logo"></a>
        <img src="images/simbolo-de-interface-de-lupa-de-pesquisa.png" alt="lupinha" class="lupa-icon">
        <img src="images/carrinho.png" alt="Carrinho" class="cart-icon">
        <img src="images/do-utilizador.png" alt="user" class="user-icon">
    </nav>

    <main class="card-container">
        <a href="racao">
            <div class="card">
                <img src="images/racaoCard.png" alt="RaÃ§Ã£o 1">
                <h2>${racao.nome}</h2>
                <h1>${racao.preco}</h1>
            </div>
        </a>

        <div class="descRacao">
            <p>${racao.descricao}</p>
        </div>
        
         <div class="Button">
         
         
         <a href="form?idRacao=${racao.id}">
              	<button class="buttonInterface">Editar Ração</button>
              </a>
         
         <a href="deletarRacao?idRacao=${racao.id}">
              	<button class="buttonInterface">Deletar Racão</button>
              </a> 
         
            
            
        </div>
        
    </main>

    <div class="socialMedia">
        <h1>Sigam-nos em nossas redes Sociais!</h1>
       <div class="Media" >
        <a class="minecraft" href="#"><img class="imgSocial" src="images/instagramIcon.png" alt="insta">@PetShopConstantin</a>
        <a class="minecraft" href="#"><img class="imgSocial" src="images/whatsappIcon.png" alt="wpp">(11) 94002-8922</a>
        <a class="minecraft" href="#"><img class="imgSocial" src="images/facebookIcon.png" alt="facebook">@PetShopConstantin</a>
       </div>
    </div>
</body>
</html>