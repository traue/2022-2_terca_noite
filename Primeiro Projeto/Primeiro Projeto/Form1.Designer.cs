namespace Primeiro_Projeto
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.lbNome = new System.Windows.Forms.Label();
            this.lbSobrenome = new System.Windows.Forms.Label();
            this.txtNome = new System.Windows.Forms.TextBox();
            this.txtSobrenome = new System.Windows.Forms.TextBox();
            this.btBoasVindas = new System.Windows.Forms.Button();
            this.lbResultado = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lbNome
            // 
            this.lbNome.AutoSize = true;
            this.lbNome.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbNome.Location = new System.Drawing.Point(45, 41);
            this.lbNome.Name = "lbNome";
            this.lbNome.Size = new System.Drawing.Size(55, 20);
            this.lbNome.TabIndex = 0;
            this.lbNome.Text = "Nome:";
            // 
            // lbSobrenome
            // 
            this.lbSobrenome.AutoSize = true;
            this.lbSobrenome.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbSobrenome.Location = new System.Drawing.Point(4, 89);
            this.lbSobrenome.Name = "lbSobrenome";
            this.lbSobrenome.Size = new System.Drawing.Size(96, 20);
            this.lbSobrenome.TabIndex = 1;
            this.lbSobrenome.Text = "Sobrenome:";
            // 
            // txtNome
            // 
            this.txtNome.Location = new System.Drawing.Point(106, 41);
            this.txtNome.Name = "txtNome";
            this.txtNome.Size = new System.Drawing.Size(100, 20);
            this.txtNome.TabIndex = 2;
            // 
            // txtSobrenome
            // 
            this.txtSobrenome.Location = new System.Drawing.Point(106, 89);
            this.txtSobrenome.Name = "txtSobrenome";
            this.txtSobrenome.Size = new System.Drawing.Size(100, 20);
            this.txtSobrenome.TabIndex = 3;
            // 
            // btBoasVindas
            // 
            this.btBoasVindas.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.btBoasVindas.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btBoasVindas.Location = new System.Drawing.Point(12, 128);
            this.btBoasVindas.Name = "btBoasVindas";
            this.btBoasVindas.Size = new System.Drawing.Size(194, 34);
            this.btBoasVindas.TabIndex = 4;
            this.btBoasVindas.Text = "Dar Boas Vindas";
            this.btBoasVindas.UseVisualStyleBackColor = false;
            this.btBoasVindas.Click += new System.EventHandler(this.btBoasVindas_Click);
            // 
            // lbResultado
            // 
            this.lbResultado.AutoSize = true;
            this.lbResultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbResultado.Location = new System.Drawing.Point(12, 182);
            this.lbResultado.Name = "lbResultado";
            this.lbResultado.Size = new System.Drawing.Size(29, 20);
            this.lbResultado.TabIndex = 5;
            this.lbResultado.Text = "----";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(249)))), ((int)(((byte)(214)))), ((int)(((byte)(254)))));
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(311, 305);
            this.Controls.Add(this.lbResultado);
            this.Controls.Add(this.btBoasVindas);
            this.Controls.Add(this.txtSobrenome);
            this.Controls.Add(this.txtNome);
            this.Controls.Add(this.lbSobrenome);
            this.Controls.Add(this.lbNome);
            this.Name = "Form1";
            this.Text = "Meu Primeiro Projeto";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbNome;
        private System.Windows.Forms.Label lbSobrenome;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.TextBox txtSobrenome;
        private System.Windows.Forms.Button btBoasVindas;
        private System.Windows.Forms.Label lbResultado;
    }
}

