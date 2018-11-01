package test;

import java.util.ArrayList;
import model.*;

public class Teste {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Minha especie de Banco de Dados sobre os user
        Dados dados = new Dados();
        
        Administrador a1 = new Administrador("Jonas", "jonas", "123455");
        Visitante v1 = new Visitante("Rafaela", "rafa", "3333333");
        
        Administrador a2 = new Administrador("William", "devwil", "1#@800wmr");
        Visitante v2 = new Visitante("João", "biffy", "1234567890");
        
        Artigo ar1 = new Artigo("Como começar com POO em Java", a1);
        ar1.setTexto(" Olá hoje vou falar sobre POO em Java");
        Video vi1 = new Video("Como começar com POO em Java", a1);
        vi1.setUrl("yt.com/defrfergjk");
        
        Artigo ar2 = new Artigo("Como começar com js", a2);
        ar2.setTexto(" Hoje vou compartilhar minhas experiências com Vanilla JS");
        Video vi2 = new Video("Como começar com js", a2);
        vi2.setUrl("vimeo.com/gregi34fvf");
        
        // Administradores
        // Publicar
        a1.publicar(ar1);
        a1.publicar(ar2);
        a1.publicar(vi1);
        a1.publicar(vi2);
        
        a2.publicar(ar1);
        a2.publicar(ar2);
        a2.publicar(vi1);
        a2.publicar(vi2);
        
        // Compartilhar
        a1.compartilhar(ar1);
        a1.compartilhar(ar2);
        a1.compartilhar(vi1);
        a1.compartilhar(vi2);
        
        a2.compartilhar(ar1);
        a2.compartilhar(ar2);
        a2.compartilhar(vi1);
        a2.compartilhar(vi2);
        

        
        // Visitantes
        // Compartilhar
        v1.compartilhar(ar1);
        v1.compartilhar(ar2);
        v1.compartilhar(vi1);
        v1.compartilhar(vi2);
        
        v2.compartilhar(ar2);
        v2.compartilhar(vi2);
        v2.compartilhar(vi1);
        v2.compartilhar(vi2);
        
        //Favoritar
        v1.favoritar(ar1);
        v1.favoritar(ar2);
        v1.favoritar(vi1);
        v1.favoritar(vi2);
        
        v2.favoritar(ar1);
        v2.favoritar(ar2);
        v2.favoritar(vi1);
        v2.favoritar(vi2);
        
        dados.addAdministrador(a1);
        dados.addAdministrador(a2);
        //dados.addVisitante(v1);
        //dados.addVisitante(v2);
        exibeiBlog(dados);
    } 
    
    // Função para exibir o Teste do Blog
    public static void exibeiBlog(Dados dados) {
        System.out.println("Artigos: \n");
        for(int i = 0; i < dados.getAdministradores().size(); i++) {
            ArrayList<Artigo> artigo = dados.getAdministradores().get(i).getArtigosPublicados();
            System.out.println("Autor: " + artigo.get(i).getAutor());
            System.out.println("Data: " + artigo.get(i).getData());
            System.out.println("Título" + artigo.get(i).getTitulo());
            System.out.println("Texto: " + artigo.get(i).getTexto());
        }
    }
    
}
