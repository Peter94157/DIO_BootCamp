package edu.Pedro.tema.Enums;

public enum EstadosBrasileiros {
            SAO_PAULO ("SP", "São paulo"),
            PARANA  ("PR","Paraná"),
            RIO_DE_JANEIRO("RJ","Rio de Janeiro");
    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

        public String getNome(){
            return nome;
        }
        public String getSiglas(){
            return sigla;
        }
        public String getNomeMaiusculo(){
            return nome.toUpperCase();
        }


    }


