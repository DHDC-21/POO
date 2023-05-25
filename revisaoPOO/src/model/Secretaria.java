package model;

import root.GerenciarAcesso;

public class Secretaria  extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Secretaria logou. Acesso negado!");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Uma secretaria efetuou logout");
        GerenciarAcesso.adicionarLogado(this);
    }
}
