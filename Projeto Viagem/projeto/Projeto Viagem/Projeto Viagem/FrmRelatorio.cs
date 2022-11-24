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

        
    }
}
