class Fabrica {

    static class Incandescente implements Lampada{
        @Override
        public void ligar() {
            System.out.println("Lampada Incandescente ligada");

        }

        @Override
        public void desligar() {
            System.out.println("Lampada Incandescente desligada");

        }
    }
    static class Florescente implements Lampada{
        @Override
        public void ligar() {
            System.out.println("Lampada Florescente ligada");

        }

        @Override
        public void desligar() {
            System.out.println("Lampada Florescente desligada");

        }
    }
    public static Lampada contruirLampada(String tipo){
        switch (tipo.toLowerCase()){
            case "incandescente":
                return new Incandescente();
            case "florescente":
                return new Florescente();
            default:
                throw new IllegalArgumentException("Tipo de lâmpada inválido: " + tipo);

        }

    }


}
