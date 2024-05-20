namespace ConsumirServicio
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            cbOperacion = new ComboBox();
            label3 = new Label();
            button1 = new Button();
            panel1 = new Panel();
            LbResultado = new Label();
            txtA = new TextBox();
            txtB = new TextBox();
            panel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(44, 55);
            label1.Name = "label1";
            label1.Size = new Size(15, 15);
            label1.TabIndex = 0;
            label1.Text = "A";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(43, 128);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 1;
            label2.Text = "B";
            // 
            // cbOperacion
            // 
            cbOperacion.FormattingEnabled = true;
            cbOperacion.Items.AddRange(new object[] { "Sumar", "Restar", "Multiplicar", "Dividir" });
            cbOperacion.Location = new Point(152, 191);
            cbOperacion.Name = "cbOperacion";
            cbOperacion.Size = new Size(148, 23);
            cbOperacion.TabIndex = 2;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(38, 191);
            label3.Name = "label3";
            label3.Size = new Size(62, 15);
            label3.TabIndex = 3;
            label3.Text = "Operación";
            // 
            // button1
            // 
            button1.Location = new Point(152, 234);
            button1.Name = "button1";
            button1.Size = new Size(115, 41);
            button1.TabIndex = 4;
            button1.Text = "Calcular";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // panel1
            // 
            panel1.Controls.Add(LbResultado);
            panel1.Location = new Point(124, 311);
            panel1.Name = "panel1";
            panel1.Size = new Size(205, 85);
            panel1.TabIndex = 5;
            // 
            // LbResultado
            // 
            LbResultado.AutoSize = true;
            LbResultado.Font = new Font("Segoe UI", 18F, FontStyle.Bold, GraphicsUnit.Point);
            LbResultado.Location = new Point(28, 28);
            LbResultado.Name = "LbResultado";
            LbResultado.Size = new Size(0, 32);
            LbResultado.TabIndex = 0;
            // 
            // txtA
            // 
            txtA.Location = new Point(153, 52);
            txtA.Name = "txtA";
            txtA.Size = new Size(129, 23);
            txtA.TabIndex = 6;
            // 
            // txtB
            // 
            txtB.Location = new Point(152, 120);
            txtB.Name = "txtB";
            txtB.Size = new Size(130, 23);
            txtB.TabIndex = 7;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(txtB);
            Controls.Add(txtA);
            Controls.Add(panel1);
            Controls.Add(button1);
            Controls.Add(label3);
            Controls.Add(cbOperacion);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private ComboBox cbOperacion;
        private Label label3;
        private Button button1;
        private Panel panel1;
        private TextBox txtA;
        private TextBox txtB;
        private Label LbResultado;
    }
}