<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
    </head>
    <body>
        <h1>Calculadora IMC</h1>
        <hr>
        <%
            float peso, altura, imc;
            String classificacao = "";
            peso = Float.parseFloat(request.getParameter("peso"));
            altura = Float.parseFloat(request.getParameter("altura"));
            
            imc = peso / (altura * altura);
            
            if (imc < 16) {
                classificacao = "Magreza grau III";
            } else if (imc >= 16 && imc <= 16.9) {
                classificacao = "Magreza grau II";
            } else if (imc >= 17 && imc <= 18.4) {
                classificacao = "Magreza grau I";
            } else if (imc >= 18.5 && imc <= 24.9) {
                classificacao = "Adequado";
            } else if (imc >= 25 && imc <= 29.9) {
                classificacao = "Pré-obeso";
            } else if (imc >= 30 && imc <= 34.9) {
                classificacao = "Obesidade grau I";
            } else if (imc >= 35 && imc <= 39.9) {
                classificacao = "Obesidade grau II";
            } else {
                classificacao = "Obesidade grau III";
            }
        %>
        
        <h2>Resultados</h2>
        
        <p><b>Peso: </b><%= peso %></p>
        <p><b>Altura: </b><%= altura %></p>
        <p><b>IMC: </b> <%= imc %></p>
        <p><b>Classificação: </b><%= classificacao %></p>
        <br><br>
        <a href="./">Calcular novamente</a>
    </body>
</html>
