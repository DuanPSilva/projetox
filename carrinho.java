public class carrinho{  
      
    public produto[] compras; 



    public double preçototal(produto p[]){

          int i=0;
          double total;
        while(p[i]!=null){

            total+=getPreco(p[i]);

        }

        return total;


    }


        public double pesototal(produto p[]){

          int i=0;
          double total;
        while(p[i]!=null){

            total+=getPeso(p[i]);

        }

        return total;


    }





  