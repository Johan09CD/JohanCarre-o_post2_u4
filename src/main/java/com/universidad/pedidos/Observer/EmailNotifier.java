package com.universidad.pedidos.observer;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifier {

    @EventListener
    @Order(1)
    public void onConfirmado(PedidoConfirmadoEvent e) {
        System.out.println("[EMAIL] Confirmación enviada para pedido: " + e.getPedido().getId());
    }

    @EventListener
    @Order(1)
    public void onCancelado(PedidoCanceladoEvent e) {
        System.out.println("[EMAIL] Aviso de cancelación enviado para: " + e.getPedido().getId());
    }
}
