# Demo-dao-jdbc
Ideia geral do padrão DAO:
* Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta 
entidade.Por exemplo:
o Cliente: ClienteDao
o Produto: ProdutoDao
o Pedido: PedidoDao
* Cada DAO será definido por uma interface.
* A injeção de dependência pode ser feita por meio do padrão de projeto Factory

# Exemplo visual do modelo relacional :

![image](https://github.com/Glauber8289/Demo-dao-jdbc/assets/107453279/24f53bbd-b5d1-4bf9-8b30-5802b407e937)
