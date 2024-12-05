<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - PetShop</title>
    <link rel="stylesheet" href="css/user.css">
    
</head>
<body>
    
    <nav class="navbar">
        <a href="home.html"><img src="images/logo.png" alt="Logo da Loja" class="logo"></a>
        <input type="text" placeholder="Pesquise sua ração..." class="search-bar">
        <img src="images/simbolo-de-interface-de-lupa-de-pesquisa.png" alt="lupinha" class="lupa-icon">
        <a href="formUser.html"> 
            <img src="images/adicionar-usuario.png" alt="Carrinho" class="cart-icon">
        </a>
        <img src="images/do-utilizador.png" alt="user" class="user-icon">
    </nav>
    
   

    <main class="card-container">
    	<c:forEach items="${funcionario}" var="funcionario">

            <div class="card">
                <img src="images/user.png" alt="userIMG">
                <h2>${funcionario.nome}</h2>
                <p>${funcionario.idade}</p>
                <h1>${funcionario.cargo}</h1>
                
                <div class="Button">
                    <a href="formUser?idFuncionario=${funcionario.id}">
              	<button class="buttonInterface">Editar Funcionario</button>
              </a>
         
         <a href="deletarFuncionario?idFuncionario=${funcionario.id}">
              	<button class="buttonInterface">Deletar Funcionario</button>
              </a> 
                </div>
                
            </div>
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