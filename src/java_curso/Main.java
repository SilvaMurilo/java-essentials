package java_curso;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        int minhaIdade = 23;
        String meuNome = "";
        minhaIdade = 24;
//        meuNome = "Murilo Silva";
        byte t = 32;
        long testeLong = 23219;
        double teste32 = 32.32;
        boolean bool = false;
        System.out.println(teste32);
        if(bool && t > 20 || meuNome.equals("Murilo"))  System.out.println("Verdadeiro!");
        else if(meuNome.isBlank()) System.out.println("Sem nome!");
        else if(meuNome.isEmpty()) System.out.println("Vazio");
        else System.out.println("Falso!");
        int [] numerosInteiros = {1, 2, 3, 4, 5};
        System.out.println(numerosInteiros[0]);

//        Vetor
        String[] nomeArr = new String[4];
        nomeArr[0] = "Murilo";
        System.out.println(nomeArr[0]);
//        Array List
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Murilo");
        nomes.add("Silva");
        nomes.add("Bianca");
        nomes.add("Vitória");
        System.out.println(nomes);
        System.out.println(nomes.get(0));
        System.out.println(nomes.getLast());
        nomes.remove(0);
        nomes.remove("Vitória");
        System.out.println(nomes);
//        Loops
        for (int iArr = 0; iArr < nomeArr.length; iArr++) System.out.println("Posição do Array " + iArr + " " + nomeArr[iArr]);
        for (int i = 0; i < nomes.size(); i++) System.out.println("Posição do Array List " + i + " " + nomes.get(i));
        for(String nome : nomeArr) System.out.println(nome);
        for(String nome : nomes) System.out.println(nome);

        int contador = 0;
        while (contador < 10){
            System.out.println("Estou no while na posição: " + (contador + 1));
            contador++;
        }
//        Cast
        double resultado = 0.0;
        System.out.println("Resultado antes do cast " + resultado);
        int resultadoInt = (int)resultado;
        System.out.println("Resultado após cast " + resultadoInt);

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
        System.out.println(meuInt2);

        Carro meuCarro1 = new Gol();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();
        System.out.println(meuCarro1);

        SerVivo humano = new Humano();
        humano.respirar();

//        Tratamento de exceções
        Carro meuCarroQuebrado = null;
        try {
        meuCarroQuebrado.acelerar();
        } catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }

//        List
        List<String> list = new ArrayList<>();
        list.add("Murilo Luiz");
        list.add("Binaca Vitória");
        list.add("Murilo Silva");
        list.add("Vitória");
        System.out.println(list);

//        Set NÃO ACEITA DUPLICADO
        Set<String> setStrings = new HashSet<>();
        setStrings.add("Murilo");
        setStrings.add("Murilo");
        setStrings.add("Bianca");
        setStrings.add("Vitória");
        System.out.println(setStrings);
        System.out.println(setStrings.contains("Murilo"));
        System.out.println(setStrings.contains("MuriloSilva"));

//        Map
        Map<String, String> usuario = new HashMap<>(0, 2);
        usuario.put("nome","Murilo");
        usuario.put("sobrenome","Silva");
        usuario.put("sexo","masculino");
        usuario.put("cidade","Taquaritinga");
        System.out.println(usuario);
        System.out.println(usuario.get("nome"));
        System.out.println(usuario.getOrDefault("nomes","Jane Doe"));

//        Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Murilo");
        queue.add("Murilo Luiz");
        queue.add("Bianca");
        queue.add("Bianca Vitória");
        queue.add("Bianca Vitória");
        System.out.println("Queue: " + queue);
        System.out.println("Queue : " + queue.poll());
        System.out.println("Queue: " + queue.remove()); // lança exceção se estiver vazia
        System.out.println("Queue: " + queue);

        //LinkedList
        LinkedList<String> lista = new LinkedList<>();
        lista.addLast("Murilo");
        lista.add("Murilo Luiz"); //insere no final
        lista.addLast("Bianca");
        lista.add("Vitória");
        lista.add("Teste");
        lista.addFirst("Teste First");
        lista.add("Teste2");
        lista.addLast("Teste Last");
        System.out.println("Lista: " + lista);

//        Record (dados não mutáveis)
        Carro2 sandero = new Carro2("Sandero", "Branco", 2020, "ABC-1234");
        System.out.println(sandero);
//        DTOs => data transfer objects RECORDS
//        POJOs => plan old java objects

//        Stream API
//          // realizar operações funcionais
            // filter, map, reduce...
        List<String> murilos = list
                .stream()
                .filter(nome -> nome.startsWith("Mu"))
//                .map(nome -> nome.toUpperCase())
                .map(String::toUpperCase)
                .toList();

        long qtdMurilos = list
                .stream()
                .filter(nome -> nome.startsWith("Mu"))
                .count();
        System.out.println("Murilos: " + murilos);
        System.out.println("Quantia de Murilos: " + qtdMurilos);

        Set<String> murilos2 = list
                .stream()
                .filter(nome -> nome.startsWith("Mu"))
                .map(String::toUpperCase)
                .map(nome -> nome.replaceAll(" ", ""))
                .collect(Collectors.toSet());
        System.out.println(murilos2);
    }
}

/*
    Tipos de variáveis
    numeros
        byte => 8 bits => -128 a 127
            byte testeByte = 25;
        short => 16 bits => -32.768 a 32.767
            short testeShort = 3290;
        int => 32 bits => -2.147.483.648 a 2.147.483.647
            int testeInt = 32912;
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
            long testeLong = 23219L;
        float => numeros decimais (7 casas)
            float salario = 10.29F;
        double => numeros decimais com maior precisao (15 casas)
            double salario = 10.29;
        bigdecimal => numeros decimais bem grandes ideal para dinheiro muito fracionário (cripto)
            bigdecimal salario = 10.29;

    caracteres
        String => cadeia de caracteres
            String frase = "Frase completa";
        char => um caracter apenas
            char letra = 'a';

    boleano
        boolean => true ou false
     */