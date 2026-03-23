package com.universidad.pedidos.observer;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class InventarioUpdater {

    @EventListener
    @Order(2)
    public void onConfirmado(PedidoConfirmadoEvent e) {
        System.out.println("[INVENTARIO] Reserva de stock aplicada para: " + e.getPedido().getId());
    }

    @EventListener
    @Order(2)
    public void onCancelado(PedidoCanceladoEvent e) {
        System.out.println("[INVENTARIO] Stock liberado para: " + e.getPedido().getId());
    }
}
