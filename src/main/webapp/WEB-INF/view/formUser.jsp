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
        <a href="home.html"><img src="images/logo.png" alt="Logo da Loja" class="logo"></a>
        <img src="images/simbolo-de-interface-de-lupa-de-pesquisa.png" alt="lupinha" class="lupa-icon">
        <img src="images/carrinho.png" alt="Carrinho" class="cart-icon">
        <img src="images/do-utilizador.png" alt="user" class="user-icon">
    </nav>

   

        <form method="POST" action="${funcionario.id != null ? 'atualizarFuncionario' : 'adicionarFuncionario' }?idFuncionario=${funcionario.id}">
        <div class="form">
            <label>Nome completo do funcionário: </label>
            <input name="nome" value="${funcionario.nome}" type="text">
        </div>

        <div class="form">
            <label>Função ou Cargo: </label>
            <input name="cargo" value="${funcionario.cargo}" type="text">
        </div>

        <div class="form">
            <label>Idade do funcionário: </label>
            <input name="idade" value="${funcionario.idade}" type="number">
        </div>

        <div class="Button">
            <button class="buttonInterface">Cadastrar</button>
            <button class="buttonInterface"><a href="home">Voltar</a></button>
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