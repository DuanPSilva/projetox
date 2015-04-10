public class carrinho{  
      
    private produto[] compras; 



    public double precototal(carrinho p[]){

          int i=0;
          double total;
        while(p[i]!=null){

            total+=getPreco(p[i]);

        }

        return total;


    }


        public double pesototal(carrinho p[]){

          int i=0;
          double total;
        while(p[i]!=null){

            total+=getPeso(p[i]);

        }

        return total;


    }


    public setcarrinho(produto p[]){
        int i=0
                while(p[i]!=null){


                    p[i]=compras[i];

    }


}







  