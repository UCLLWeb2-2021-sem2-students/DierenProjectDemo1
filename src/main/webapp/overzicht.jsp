<%@page import="domain.model.Dier" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bekijk alle dieren</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div id="container">
    <%@ include file="header.jsp" %>
    <main>
        <h2>Bekijk alle dieren</h2>
        <table>
            <thead>
            <tr>
                <th>Naam</th>
                <th>Soort</th>
                <th>Voedsel</th>
            </thead>
            <tbody>
            <%
                ArrayList<Dier> alleDieren = (ArrayList<Dier>) request.getAttribute("alleDieren");
                for (Dier dier : alleDieren) {
            %>
            <tr>
                <td><%=dier.getNaam()%>
                </td>
                <td><%=dier.getSoort()%>
                </td>
                <td><%=dier.getVoedsel()%>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
        <p>Het meest hongerige dier is <strong
                id="calculatedValue"><%= ((Dier) request.getAttribute("meestHongerige")).getNaam() %>
        </strong>.</p>

    </main>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>