package model;

import root.GerenciarAcesso;

public class Gerente extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Um gerente logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Um gerente efetuou logout");
        GerenciarAcesso.adicionarLogado(this);
    }
}