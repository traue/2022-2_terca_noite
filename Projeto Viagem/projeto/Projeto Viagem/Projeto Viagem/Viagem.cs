using System;

namespace Projeto_Viagem
{
    public class Viagem
    {
        //int representa um número inteiro(Ex: 3)
        //o float representa números fracionados (Ex: 1.5)

        private int distancia; //representará a distância a percorrer
        private float consumo; //representará o consumo médio do veículo
        private float vCombustivel; //representará o valor médio do combustível
        private float vPedagio; //representará o valor gasto com pedágios

        private float qtdLitros; //representará q qtd. de litros usados na viagem
        private float vGasto; //representará o valor gasto apenas com combustível
        private float vTotal; //representará o valor total gasto na viagem
        
        public int Distancia { get => distancia; set => distancia = value; }
        public float Consumo { get => consumo; set => consumo = value; }
        public float VCombustivel { get => vCombustivel; set => vCombustivel = value; }
        public float VPedagio { get => vPedagio; set => vPedagio = value; }
        public float QtdLitros { get => qtdLitros; set => qtdLitros = value; }
        public float VGasto { get => vGasto; set => vGasto = value; }
        public float VTotal { get => vTotal; set => vTotal = value; }

        //método que será "acionado" para realização dos cálculos
        public void calculaViagem()
        {
            qtdLitros = distancia / consumo;
            vGasto = qtdLitros * vCombustivel;
            vTotal = vGasto + vPedagio;
        }
    }
}
