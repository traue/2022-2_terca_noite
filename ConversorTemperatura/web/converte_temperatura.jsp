<%@page import="uninove.temperatura.Temperatura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    float tempOrigem = Float.parseFloat(request.getParameter("temperatura"));
    String origem = request.getParameter("origem");
    float tempConvertida = 0;

    if (origem.equals("celcius")) {
        //vamos converteer para ºF
        tempConvertida = Temperatura.celciusParaFahrenheit(tempOrigem);
    } else {
        //vamos converter para ºC
        tempConvertida = Temperatura.fahrenheitParaCelcius(tempOrigem);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de Temperatura</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Conversor de Temperatura</h1>    
        <hr>
        <br><br>
        
        <% if (origem.equals("celcius")) {%>
            <p><b>Temperatura de origem: </b><%= tempOrigem%>ºC</p>
            <p><b>Convertida para Fahrenheit: </b><%= tempConvertida%>ºF</p>
        <% } else {%>
            <p><b>Temperatura de origem: </b><%= tempOrigem%>ºF</p>
            <p><b>Convertida para Celcius: </b><%= tempConvertida%>ºC</p>
        <% }%>
        
        <br><br>
        
        <a href="./">Calcular novamente</a>
    </body>
</html>
