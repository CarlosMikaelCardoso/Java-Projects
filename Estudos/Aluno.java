class Aluno{
    //Atributo
    private String Nome; 

    //Métodos
    public void inserirNome ( ) {
        Nome = System.in.toString ();
    }
    public String recuperarNome ( ) {
        return Nome;
    }
}

