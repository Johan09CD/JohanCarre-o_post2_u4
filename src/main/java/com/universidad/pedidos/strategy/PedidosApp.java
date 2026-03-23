package com.universidad.pedidos;

import com.universidad.pedidos.observer.GestorPedidosService;
import com.universidad.pedidos.strategy.CarritoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosApp implements CommandLineRunner {

    private final GestorPedidosService gestorPedidosService;
    private final CarritoService carritoService;

    public PedidosApp(GestorPedidosService gestorPedidosService,
                      CarritoService carritoService) {
        this.gestorPedidosService = gestorPedidosService;
        this.carritoService = carritoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PedidosApp.class, args);
    }

    @Override
    public void run(String... args) {
        Pedido p3 = new Pedido("P-003", "PROD-C", 1, 60000.0, true);
        System.out.println("\n--- Confirmando pedido P-003 (Observer) ---");
        gestorPedidosService.confirmarPedido(p3);

        System.out.println("\n--- Cancelando pedido P-003 (Observer) ---");
        gestorPedidosService.cancelarPedido(p3);

        System.out.println("\n--- Motor de descuentos (Strategy) ---");
        System.out.println("Estrategias disponibles: " + carritoService.listarEstrategias());
        carritoService.activarDescuento("Temporada");
        carritoService.calcularTotal(100000.0);
        carritoService.activarDescuento("VIP");
        carritoService.calcularTotal(100000.0);
        carritoService.activarDescuento("Cupon");
        carritoService.calcularTotal(100000.0);
    }
}
