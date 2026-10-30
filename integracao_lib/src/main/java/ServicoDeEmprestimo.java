public class ServicoDeEmprestimo {
    private RepositorioDeLivros repositorio;

    public ServicoDeEmprestimo(RepositorioDeLivros repositorio) {
        this.repositorio = repositorio;
    }

    public boolean emprestarLivro(String isbn) {
        if(repositorio.livroDisponivel(isbn)) {
            System.out.println("Livro emprestado! " + isbn);
            return true;
        } else {
            System.out.println("Livro não disponivel!");
            return false;
        }
    }
}
