package facade;

    class SubsistemaDeFaturamento {
        public void faturar() {
            System.out.println("Faturando pedido...");
        }
    }
    
    class SubsistemaDeEstoque {
        public void verificarEstoque() {
            System.out.println("Verificando estoque...");
        }
    }
    
    class SubsistemaDeEnvio {
        public void enviarPedido() {
            System.out.println("Enviando pedido...");
        }
    }
    
    class PedidoFacade {
        private SubsistemaDeFaturamento faturamento;
        private SubsistemaDeEstoque estoque;
        private SubsistemaDeEnvio envio;
    
        public PedidoFacade() {
            this.faturamento = new SubsistemaDeFaturamento();
            this.estoque = new SubsistemaDeEstoque();
            this.envio = new SubsistemaDeEnvio();
        }
    
        public void processarPedido() {
            faturamento.faturar();
            estoque.verificarEstoque();
            envio.enviarPedido();
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            PedidoFacade facade = new PedidoFacade();
            facade.processarPedido();
        }
    }
    

