package me.dio.sacola.service;

import me.dio.sacola.resource.ItemDto;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;

public interface SacolaService {
    Item incluirItemNaSacola (ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);

}
