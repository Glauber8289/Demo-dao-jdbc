# Demo-dao-jdbc
Ideia geral do padrão DAO:
* Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta 
entidade. Por exemplo:
o Cliente: ClienteDao
o Produto: ProdutoDao
o Pedido: PedidoDao
* Cada DAO será definido por uma interface.
* A injeção de dependência pode ser feita por meio do padrão de projeto Factory
