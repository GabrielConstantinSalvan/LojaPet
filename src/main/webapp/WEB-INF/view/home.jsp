<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - PetShop</title>
    <link rel="stylesheet" href="css/home.css">
    
</head>
<body>
    
    <nav class="navbar">
        <a href="home"><img src="images/logo.png" alt="Logo da Loja" class="logo"></a>
        <input type="text" placeholder="Pesquise sua ração'..." class="search-bar">
        <img src="images/simbolo-de-interface-de-lupa-de-pesquisa.png" alt="lupinha" class="lupa-icon">
        <a href="formUser">
            <img src="images/adicionar-usuario.png" alt="Carrinho" class="cart-icon">
        </a>
        <a href="user">
        <img src="images/do-utilizador.png" alt="user" class="user-icon">
        </a>
    </nav>

    
    <header class="header">
        <div class="carousel">
            <img src="images/04153_banner_site_magnus_1920x684px_v2.png" alt="RaÃ§Ã£o 1">
        </div>
    </header>
    
    
    <div class="forms">
        <button class="cadastrar"><a href="form">Adicione aqui a sua Ração!</a></button>
    </div>
		
    <main class="card-container">
	<c:forEach items="${racoes}" var="racao">
        <a href="racao?idRacao=${racao.id}">
            <div class="card">
                <img src="images/racaoCard.png" alt="racao 1">
                <h2>${racao.nome}</h2>
                <p>${racao.descricao}</p>
                <h1>${racao.preco}</h1>
            </div>
        </a>
    </c:forEach>
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