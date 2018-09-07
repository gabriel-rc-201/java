
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class ContaEspecial extends Contas
{
    private int limite;
    private int multa;
    private double aux;
    
    public void setLimite(int limite)
    {
        this.limite = limite;
    }
    
    public int getLimite()
    {
        return this.limite;
    }
    
    public void setMulta(int multa)
    {
        this.multa = multa;
    }
    
    public int getMulta()
    {
        return this.multa;
    }
    
    @Override
    public void sacar(double valor)
    {
        if (valor <= this.getSaldo())
        {
            this.depositar(-valor);
            JOptionPane.showMessageDialog(null, "Sauque realisado com sucesso!!!");
        }
        else
        {
            if(valor <= this.getSaldo() + this.getLimite() && valor > this.getSaldo())
            {
                this.aux = this.getSaldo() - valor;
                descontar((this.getSaldo() - valor) * this.multa/100);
                JOptionPane.showMessageDialog(null,"Saque realizado com sucesso usando cheque especial!!!");
            }
        }
    }
    
    public void descontar(double multa)
    {
        this.setSaldo(multa + this.aux);
    }
    
    @Override
    public void tipoDeConta()
    {
        JOptionPane.showMessageDialog(null, "Tipo de conta: Especial!!!");
    }
}
