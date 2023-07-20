package org.lessons.java.shop;
public class Main {
        public static void main(String[] args) {
            Prodotto prodotto1 = new Prodotto("Prodotto 1", "Descrizione Prodotto 1", 50.0, 22.0);

            System.out.println("Codice prodotto: " + prodotto1.getCodice());
            System.out.println("Nome prodotto: " + prodotto1.getNome());
            System.out.println("Descrizione prodotto: " + prodotto1.getDescrizione());
            System.out.println("Prezzo base: " + prodotto1.getPrezzo());
            System.out.println("Prezzo con IVA: " + prodotto1.getPrezzoConIva());
            System.out.println("Nome ext: " + prodotto1.toString());

            prodotto1.setNome("Anello");
            prodotto1.setDescrizione("Nuova descrizione");
            prodotto1.setIva(33.0);
            prodotto1.setPrezzo(70);
            System.out.println("Nuovo nome prodotto: " + prodotto1.getNome());
        }
    }

