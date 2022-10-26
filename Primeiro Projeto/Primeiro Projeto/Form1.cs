using System;
using System.Windows.Forms;

namespace Primeiro_Projeto
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btBoasVindas_Click(object sender, EventArgs e)
        {
            lbResultado.Text = "Olá " + txtNome.Text + " " + txtSobrenome.Text + ", seja bem-vindo(a)!";
        }
    }
}
