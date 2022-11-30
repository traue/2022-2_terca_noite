using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Projeto_Viagem
{
    public partial class FrmRelatorio : Form
    {
        Viagem viagem;
        public FrmRelatorio(Viagem viagem)
        {
            InitializeComponent();
            this.viagem = viagem;
        }

        private void btFechar_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void FrmRelatorio_Load(object sender, EventArgs e)
        {
            rtbRelatorio.AppendText("Reltório da Viagem" + Environment.NewLine);
            rtbRelatorio.AppendText("-----------------------" + Environment.NewLine);
            rtbRelatorio.AppendText($"Distância Informada: {viagem.Distancia} Km" + Environment.NewLine);
            rtbRelatorio.AppendText("Consumo informado: " + viagem.Consumo + "Km/L" + Environment.NewLine);
            //..
        }
    }
}
