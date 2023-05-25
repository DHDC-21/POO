package model;

import root.GerenciarAcesso;

public class Fornecedor implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Um fornecedor logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Um fornecedor efetuou logout");
        GerenciarAcesso.adicionarLogado(this);
    }
}
