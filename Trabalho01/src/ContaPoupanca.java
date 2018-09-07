
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
public class ContaPoupanca extends Contas 
{
    private double taxa;
    
    public void setTaxa(double taxa)
    {
        this.taxa = taxa;
    }
    
    public double getTaxa()
    {
        return this.taxa;
    }
    
    public void reajustar()// Aqui foi alterado para quando a conta poupança for
                           // criada não realizar o reajuste ao mesmo tempo e somete quando
                           // o usuario realizar o operação de areajustar
    {
        double reajuste = this.getSaldo()*this.taxa;
        this.setSaldo(this.getSaldo() + reajuste);
        JOptionPane.showMessageDialog(null, "Reajuste Realizado com sucesso!!!");
    }
    public void reajusta ()
    {
        double reajuste = this.getSaldo()*0.1;
        this.setSaldo(this.getSaldo() + reajuste);
        JOptionPane.showMessageDialog(null, "Reajuste Realizado com a taxa padão!!!");
    }
    
    @Override
    public void tipoDeConta ()
    {
        JOptionPane.showMessageDialog(null, "Tipo de Conta: Pupança");
    }
}
