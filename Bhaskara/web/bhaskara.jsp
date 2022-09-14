<%@page import="uninove.matematica.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String a, b, c;
    a = request.getParameter("valorA");
    b = request.getParameter("valorB");
    c = request.getParameter("valorC");

    Bhaskara bhaskara = new Bhaskara();

    bhaskara.setA(Double.parseDouble(a));
    bhaskara.setB(Double.parseDouble(b));
    bhaskara.setC(Double.parseDouble(c));

    //chamar o método que realiza todos os calculos:
    bhaskara.calculaBhaskara();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bhaskara</title>
        <style>
            .texto-topo {
                font-size: 24px;
                font-family: fantasy;
                margin-top: 30px;
            }
            .resultados {
                font-size: 20px;
                margin-top: 30px;
                margin-left: 30px;
                font-family: fantasy;
            }
            
            a {
                color: black;
                font-size: 20px;
                font-family: fantasy;
            }
        </style>
    </head>
    <body>
        <h1>Bhaskara</h1>
        <hr>
        <div class="texto-topo">
            Dada a equação <b> <%=a%>x² + <%=b%>x + <%=c%> = 0</b>, temos
        </div>
        <div class="resultados">
            <p><b>Delta:</b> <%=bhaskara.getDelta()%></p>
            
            <% if(bhaskara.getDelta() > 0) { %>
                <p><b>X': </b> <%= bhaskara.getX1() %> </p>
                <p><b>X": </b> <%= bhaskara.getX2() %> </p>
            <% } else { %> 
                <p>Delta é negativo e, portanto, não há raízes reais!</p>
            <% } %>
        </div>
        <a href="./">Calcular novamente</a>
    </body>
</html>
