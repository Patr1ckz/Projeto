package ecossistema;

import ecossistema.animals.*;
import ecossistema.environment.*;

import java.util.Random;

public class Controlador {
    public void iniciarSimulacao() {
        Animal urso = new Urso("Urso Pardo", 5);
        Animal esquilo = new Esquilo("Esquilo", 2);
        Animal aguia = new Aguia("Águia", 8);
        Animal largato = new Largato("Largato", 4);

        int dias = 2; 
        Random random = new Random();

        Ambiente ambiente = new Sol();

        System.out.println("Simulação do ecossistema iniciada.");

        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("Dia " + dia);

            int eventoAleatorio = random.nextInt(3); 
            switch (eventoAleatorio) {
                case 0:
                    ambiente = new Sol();
                    break;
                case 1:
                    ambiente = new Chuva();
                    break;
                case 2:
                    ambiente = new Tempestade();
                    break;
            }

            // Ações dos animais
            urso.mover();
            esquilo.mover();

            urso.comer(esquilo);
            urso.acaoEspecial(); 

            esquilo.acaoEspecial(); 
            aguia.mover();
            largato.mover();

            if (random.nextBoolean()) {
                aguia.comer(largato);
            } else {
                largato.acaoEspecial();
            }

            aguia.acaoEspecial(); 
            System.out.println("Eventos naturais: " + ambiente.getClass().getSimpleName());
        }

        System.out.println("Simulação do ecossistema concluída após " + dias + " dias.");
    }

    public static void main(String[] args) {
        Controlador simulacao = new Controlador();
        simulacao.iniciarSimulacao();
    }
}
