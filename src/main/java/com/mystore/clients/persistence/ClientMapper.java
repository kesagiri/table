package com.mystore.clients.persistence;

import com.mystore.clients.domain.Client;

import java.util.List;

public interface ClientMapper {

    List<Client> findAll();
}
