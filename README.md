# Respostas desafio Target Sistemas

Desafio técnico do processo seletivo da Target Sistemas.

### Questão 1:
Observer o trecho de código abaixo:
````
int INDICE = 13, SOMA = 0, K=0;
enquanto K < INDICE faça 
{
    K = K + 1;
    SOMA = SOMA + K;
}
imprimir(SOMA);
````
Ao final do processamento, qual será o valor da variável SOMA? 

**Resposta:** O valor final da variável soma é: 91

---
### Questão 2:
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência \

**Resposta:** [Fibonacci.java](/Fibonacci.java)
```java
import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args) {
    int n1=1, n2=1, n3=0,num;
    boolean fibNum = false;
    System.out.print("Insira um número ");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    System.out.println(n1+"\n"+n2);
    while (n3 <=num) {
      n3 = n1+n2;
      n1 = n2;
      n2 = n3;
      System.out.println(n3);
      if (n3==num||n1==num) {
        fibNum = true;
      }
    }
    if (fibNum) System.out.println("O número " + num + " está presente na sequencia de Fibonacci!");
    else System.out.println("O número " + num + " NÃO está presente na sequencia de Fibonacci!");
    sc.close();
  }
}
```

----
### Questão 3:
Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, **9** \
b) 2, 4, 8, 16, 32, 64, **128** \
c) 0, 1, 4, 9, 16, 25, 36, **49** \
d) 4, 16, 36, 64, **100** \
e) 1, 1, 2, 3, 5, 8, **13** \
f) 2,10, 12, 16, 17, 18, 19, **20**

---
### Questão 4:
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

**Resposta:** O texto leva a crer que cada lâmpada está em uma sala separada e existe uma sala com 3 interruptores, tendo em vista que lâmpadas emitem calor, para descobrir qual o interruptor correto de cada lâmpada eu tomaria o seguinte rumo:\
Ligaria o primeiro interruptor por alguns minutos, após o tempo desligaria esse interruptor e manteria o segundo interruptor ligado e o terceiro desligado, então iria para duas salas, caso a lâmpada da sala esteja quente, porém desligada, eu saberia que aquela lâmpada está conectada ao primeiro interruptor, caso esteja ligada, eu saberia que ela está conectada ao segundo interruptor, e se estivesse desligada, estaria conectada ao terceiro interruptor



---
### Questão 5:
Escreva um programa que inverta os caracteres de um string.

**Resposta:** [ReverseString.java](/ReverseString.java) 
```Java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma String a ser invertida ");
        String base = sc.nextLine();
        String out = "";
        for (int i=base.length()-1;i>=0;i--){
            out = out.concat(Character.toString(base.charAt(i)));
        }
        System.out.print("String invertida: \n"+out);
        sc.close();
    }
}
```