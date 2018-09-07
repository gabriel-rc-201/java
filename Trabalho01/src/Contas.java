
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
public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void depositar (double valor)
    {
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
    }
    
    public void sacar (double valor)
    {
        if (valor > this.saldo)
        {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!!!");
        }
        else
        {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
        }
    }
    
    public void transferir (Contas conta1, Contas conta2, double valor)
    {
        if(valor > conta1.getSaldo())
        {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!!!");
        }
        else
        {
            conta1.saldo -= valor;
            conta2.saldo += valor;
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso!!!");
        }
    }
    
    public void tipoDeConta ()
    {
        JOptionPane.showMessageDialog(null, "Tipo de conta: Comum");
    }
    
}