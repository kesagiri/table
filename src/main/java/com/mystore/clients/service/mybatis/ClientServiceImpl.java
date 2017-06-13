package com.mystore.clients.service.mybatis;


import com.mystore.clients.domain.Client;
import com.mystore.clients.persistence.ClientMapper;
import com.mystore.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Transactional(readOnly=true)
    public List<Client> getAllClients() {
        return clientMapper.findAll();
    }

}
