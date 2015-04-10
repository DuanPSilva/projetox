import java.util.Scanner;

class main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String txt;
		Double d;
		int i;
		Double dist;
		Double precototal;
		Double pesot;

		Produto a[]= new Produto[100];
		int x=0;

		for(x=0;x<=3;x++){
			a[x]=new Produto();

			System.out.println("\nNome do produto\n");
			txt = s.nextLine();
			a[x].setNome(txt);

			System.out.println("\nPreco do produto\n");
			d= s.nextDouble();
			a[x].setPreco(d);

			System.out.println("\nid do produto\n");
			i = s.nextInt();
			a[x].setId(i);

			System.out.println("\nPeso do produto\n");
			d= s.nextDouble();
			a[x].setPeso(d);
	
		}

		System.out.println("\nDistancia em KM?\n");
			dist= s.nextDouble();
			
		Carrinho car=new Carrinho();
		int y;
		setCarrinho(a);

		pesot=car.pesototal(a);
		precototal=car.precototal(a);
		System.out.println("Preco total: n"+pesot*20+precototal+dist*2);
		System.out.println("Peso total: n"+pesot*20+precototal+dist*2);


	}
	
}
