import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ServicoDeEmprestimoTest {
    
    @Test 
    public void emprestarLivro() {
        RepositorioDeLivros repositorio = new RepositorioDeLivros();
        Livro livro = new Livro("Trono de Vidro", "Sarah J Mass", "123");

        repositorio.adicionarLivro(livro);

        ServicoDeEmprestimo servico = new ServicoDeEmprestimo(repositorio);

        boolean emprestado = servico.emprestarLivro("123");
        assertTrue(emprestado);
    }

    @Test 
    public void naoEmprestarLivro() {
        RepositorioDeLivros repositorio = new RepositorioDeLivros();
        ServicoDeEmprestimo servico = new ServicoDeEmprestimo(repositorio);

        boolean emprestado = servico.emprestarLivro("999");
        assertFalse(emprestado);
    }
}
