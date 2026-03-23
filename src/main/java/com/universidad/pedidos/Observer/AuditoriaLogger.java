package com.universidad.pedidos.observer;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AuditoriaLogger {

    @EventListener
    @Order(3)
    public void onConfirmado(PedidoConfirmadoEvent e) {
        System.out.println("[AUDITORIA] Pedido " + e.getPedido().getId() + " -> CONFIRMADO");
    }

    @EventListener
    @Order(3)
    public void onCancelado(PedidoCanceladoEvent e) {
        System.out.println("[AUDITORIA] Pedido " + e.getPedido().getId() + " -> CANCELADO");
    }
}
