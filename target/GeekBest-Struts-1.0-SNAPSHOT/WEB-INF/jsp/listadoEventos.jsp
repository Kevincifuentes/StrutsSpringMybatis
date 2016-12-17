<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicación de Eventos</title>
    </head>
    <body>
        <h1>Listado de eventos</h1>
        <c:choose>
            <c:when test="${empty listadoEventos}">
                No hay eventos del tipo seleccionado (${param.tipo})
            </c:when>
            <c:otherwise>
            <table>
                <tr>
                <th>Nombre Evento</th>
                <th>Descripcion Evento</th>
                <th>Tipo Evento</th>
                <th>Fecha Evento</th>
                </tr>
            <c:forEach items="${listadoEventos}" var="item1">
                <tr>
                    <td>${item1.nombreEvento}</td>
                    <td>${item1.descripcionEvento}</td>
                    <td>${item1.tipo}</td>
                    <td><fmt:formatDate pattern="dd/MM/yyyy hh:mm" value="${item1.fecha}" /></td>
                </tr>
            </c:forEach>
            </c:otherwise>
        </c:choose>
        </table>
                <ul>
                    <li><a href="listadoEventos.action?tipo=IT"> Eventos IT</a></li>
        <li><a href="listadoEventos.action?tipo=BigData"> Eventos Big Data</a></li>
        <li><a href="listadoEventos.action?tipo=Otros"> Otros eventos</a></li>
                </ul>

    </body>
</html>