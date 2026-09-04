public class pessoa {
    private String cpf;
    private String telefone;
    private String endereco;
    private String nome;    

    public pessoa(nome: String, cpf: String,telefone: String, endereco: String)
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;

public String getnome(){
    return nome;

}

public void setnome(Stringnome){
    this.nome;

}

public String getcpf(){
    return cpf;

}

public void setcpf(Stringcpf){
    this.cpf = cpf;

}

public String gettelefone(){
    return telefone;
}

public void settelefone(Stringtelefone){
    this.telefone = telefone;

}

public String getendereco(){
    return endereco;

}

public void setendereco(Stringendereco){
    this.endereco = endereco;

}

public void exibirdados(){

    System.out.println("nome:" +nome);
    System.out.println("cpf:" +cpf);
    System.out.println("telefone:"+ telefone);
    System.out.println("endereco:"+endereco);
}
}