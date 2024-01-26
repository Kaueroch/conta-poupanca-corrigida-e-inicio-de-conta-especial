package contaBancaria;

public class ContaEspecial extends ContaBancaria{
    public String sacar1(double saldo) {
    	double valorasacar = 0;
    	if(valorasacar <= 0) {
    	   System.out.println("Erro!Coloque valor maior que zero");
    	}else{
    		System.out.println("Transação concluida!");	
    	}
    	double saldosacado = saldo - valorasacar;
    	System.out.println("Valor sacado: " + valorasacar);
    	return "Atual saldo da conta: " + saldosacado;
    	
    	
    }
}
