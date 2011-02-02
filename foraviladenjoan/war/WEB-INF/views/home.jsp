<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Foravila den Joan - Agricultura ecológica en Palma Mallorca</title>
    <link rel="stylesheet" href="resources/yui/3.3.0/cssreset/reset-min.css" type="text/css">
    <link rel="stylesheet" href="resources/yui/3.3.0/cssfonts/fonts-min.css" type="text/css">
    <link rel="stylesheet" href="resources/yui/3.3.0/cssgrids/grids-min.css" type="text/css">
 	<link rel="stylesheet" href="resources/css/global.css" type="text/css">
<style>
</style>

</head>
<body id="doc">
    <div id="hd">
        <img alt="Foravila den Joan" src="resources/images/banner.jpg">
        <h1>Bienvenido a la Foravila de´n Joan</h1>
        <hr/>
    </div>
    <p>Los productos disponibles para esta temporada son los siguientes:</p>
	<div id="main">
		<h2>Verduras</h2>
		<table border="0" width="100%" class="vegetables">
			<c:forEach var="row" items="${vegetables}">
				<tr>
					<c:forEach var="product" items="${row}" varStatus="status">
						<td>
						<c:if test="${product['name'] != null}">
						<img alt="" src="${product['imagePath']}"><br/>
						<span class="title">${product['name']}</span><br/>
						<span class="cost">
						<c:choose>
							<c:when test="${product['cost'] == 0}">
								Precio no disponible
							</c:when>
							<c:otherwise>
								${product['cost']} ${product['unit']}
							</c:otherwise>
						</c:choose>
						</span>
						</c:if>
						</td>
					</c:forEach>				
				</tr>
			</c:forEach>
		</table>
		
		<h2>Frutas</h2>
		<table border="0" width="100%" class="vegetables">
			<c:forEach var="row" items="${fruits}">
				<tr>
					<c:forEach var="product" items="${row}" varStatus="status">
						<td>
						<c:if test="${product['name'] != null}">
						<img alt="" src="${product['imagePath']}"><br/>
						<span class="title">${product['name']}</span><br/>
						<span class="cost">
						<c:choose>
							<c:when test="${product['cost'] == 0}">
								Precio no disponible
							</c:when>
							<c:otherwise>
								${product['cost']} ${product['unit']}
							</c:otherwise>
						</c:choose>
						</span>
						</c:if>
						</td>
					</c:forEach>				
				</tr>
			</c:forEach>
		</table>
		
		<h2>Varios</h2>
		<table border="0" width="100%" class="vegetables">
			<c:forEach var="row" items="${miscellaneus}">
				<tr>
					<c:forEach var="product" items="${row}" varStatus="status">
						<td>
						<c:if test="${product['name'] != null}">
						<img alt="" src="${product['imagePath']}"><br/>
						<span class="title">${product['name']}</span><br/>
						<span class="cost">
						<c:choose>
							<c:when test="${product['cost'] == 0}">
								Precio no disponible
							</c:when>
							<c:otherwise>
								${product['cost']} ${product['unit']}
							</c:otherwise>
						</c:choose>
						</span>
						</c:if>
						</td>
					</c:forEach>				
				</tr>
			</c:forEach>
		</table>
	</div>

    <div id="ft">
        <p>Para pedidos contactar con Joan Roselló - Email joanrossellom@gmail.com</p>
    </div>
</body>
</html>
