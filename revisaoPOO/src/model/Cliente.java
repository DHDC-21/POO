package model;

import root.GerenciarAcesso;

public class Cliente  implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Um cliente logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Um cliente efetuou logout");
        GerenciarAcesso.removerLogado(this);
    }
}
