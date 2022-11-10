import java.util.Calendar;
public class Pessoa{
    private String nome;
    private int anonasc;

    //toString
    @override
    public String toString(){
        return "Pessoa [nome= " + nome + ", idade= " + calculaIdade() + "]"
    }

    //Construtor
    public Pessoa (String nome, int anonasc){
        super();
        this.nome = nome;
        this.anonasc = anonasc;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnonasc(){
        return anonasc;
    }
    public void setAnonasc(int anonasc){
        this.anonasc = anonasc;
    }
    //calculo da idade para não retornar ano de nascimento
    public int calculaIdade(){
        int idade;
        int anoatual = Calendar. getInstance(). get(Calendar.YEAR);
        idade = anoatual - anonasc;
        return idade;
    } 

    public static void main(String[] args){
        Pessoa p = new Pessoa("Maria ", 1980);
        Pessoa x = new Pessoa("Pedro ", 1990);
        System.out.println(p.toString());
        System.out.println(x.toString());
    }

}