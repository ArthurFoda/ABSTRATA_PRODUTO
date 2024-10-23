public abstract class Produto {
    protected String nome;
    protected double precoCusto;
    protected double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    
    public void salvar() {
        System.out.println("Salvando produto no banco de dados: " + nome);
        
    }

    public void deletar() {
        System.out.println("Deletando produto do banco de dados: " + nome);
        
    }

    public void atualizar() {
        System.out.println("Atualizando produto no banco de dados: " + nome);
        
    }
}


public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private String informacoesNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    
    @Override
    public void salvar() {
        System.out.println("Salvando produto alimentício no banco de dados: " + nome);
    
    }

    @Override
    public void deletar() {
        System.out.println("Deletando produto alimentício do banco de dados: " + nome);
        
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando produto alimentício no banco de dados: " + nome);
        
    }
}


public class ProdutoVestuario extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    
    @Override
    public void salvar() {
        System.out.println("Salvando produto de vestuário no banco de dados: " + nome);
    
    }

    @Override
    public void deletar() {
        System.out.println("Deletando produto de vestuário do banco de dados: " + nome);
        
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando produto de vestuário no banco de dados: " + nome);
        
    }
}


public class Main {
    public static void main(String[] args) {
        
        ProdutoAlimenticio pa = new ProdutoAlimenticio("Leite", 2.50, 3.80, "10/12/2024", "Rico em cálcio");
        ProdutoVestuario pv = new ProdutoVestuario("Camiseta", 20.0, 35.0, "M", "Preta", "Algodão");

        
        System.out.println("Lucro do produto alimentício: R$" + pa.calcularLucro());
        pa.salvar();
        pa.atualizar();
        pa.deletar();

        
        System.out.println("\nLucro do produto de vestuário: R$" + pv.calcularLucro());
        pv.salvar();
        pv.atualizar();
        pv.deletar();
    }
}
