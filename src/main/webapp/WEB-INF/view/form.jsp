<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form - PetShop</title>
    <link rel="stylesheet" href="css/form.css">
</head>
<body>

    <nav class="navbar">
        <a href="home"><img src="images/logo.png" alt="Logo da Loja" class="logo"></a>
        <img src="images/simbolo-de-interface-de-lupa-de-pesquisa.png" alt="lupinha" class="lupa-icon">
        <img src="images/carrinho.png" alt="Carrinho" class="cart-icon">
        <img src="images/do-utilizador.png" alt="user" class="user-icon">
    </nav>

    
    <header class="header">
        <div class="carousel">
            <img src="images/04153_banner_site_magnus_1920x684px_v2.png" alt="RaÃ§Ã£o 1">
        </div>
    </header>

    <form method="POST" action="${Racao.id != null ? 'atualizarRacao' : 'adicionarRacao' }?idRacao=${Racao.id}">
        <div class="form">
            <label >Foto da Ração: </label>
            <input type="file">
        </div>

        <div class="form">
            <p>Nome</p>
            <input value="${racao.nome}" name="name" type="text" placeholder="Ex: Racao Magnus Adulto Carne">
        </div>

        <div class="form">
            <p>Preço</p>
            <input value="${racao.preco}" name="preco" type="text" placeholder="Ex: R$127.00">
        </div>

        <div class="form">
            <p>Descrição</p>
            <textarea value="${racao.descricao}" name="descricao"  class="msg" cols="35" rows="8" placeholder="Ex: Racao Magnus Adulto Carne 15k para cães de grande porte feita com as melhores matérias primas especiais para o seu cão."></textarea>
        </div>

        <div class="Button">
            <button class="cadastrar"><a href="">Cadastrar</a></button>
            <button class="cadastrar"><a href="home">Voltar</a></button>
        </div>
    </form>

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