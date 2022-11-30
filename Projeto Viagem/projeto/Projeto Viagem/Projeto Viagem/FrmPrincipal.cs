using System;
using System.Windows.Forms;

namespace Projeto_Viagem
{
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            Viagem viagem = new Viagem();

            viagem.Distancia = int.Parse(txtDistancia.Text);
            viagem.Consumo = float.Parse(txtConsumo.Text);
            viagem.VCombustivel = float.Parse(txtCombustivel.Text);
            viagem.VPedagio = float.Parse(txtPedagio.Text);

            viagem.calculaViagem();

            FrmRelatorio frmRelatorio = new FrmRelatorio(viagem);

        }
    }
}
