package root;

import model.*;

import java.net.spi.InetAddressResolver;
import java.util.ArrayList;

public class GerenciarAcesso {

    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        // definindo os objetos
        Cliente cliente1, cliente2;
        Gerente gerente1;
        Secretaria secretaria1;
        Operador operador1;
        Fornecedor fornecedor1, fornecedor2;

        imprimirListaDeLogados();

        // instranciano os objetos
        cliente1 = new Cliente();
        cliente2 = new Cliente();
        gerente1 = new Gerente();
        secretaria1 = new Secretaria();
        operador1 = new Operador();
        fornecedor1 = new Fornecedor();
        fornecedor2 =  new Fornecedor();

        // tesntando o programa
        // polimorfismo tratar todos os objetos pela generalização, nesse caso não hexiste hierarquia, ou seja são dispares.
    }

    public static void imprimirListaDeLogados(){
        // código
        System.out.println("Total de pessoas no sistema: " +
                logados.size() + " estao logados");
        for(Object objeto : logados){
            System.out.println("Logado: " + objeto.getClass());
        }
    }

    public static void adicionarLogado(Logavel objeto){
        // ccódigo
        logados.add(objeto);
    }

    public static void removerLogado(Logavel objeto){
        // código
        logados.remove(objeto);
    }
}