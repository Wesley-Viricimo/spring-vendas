package io.github.wesleyviricimo.service;

import io.github.wesleyviricimo.model.Client;
import io.github.wesleyviricimo.repository.ClientsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

    private ClientsRepositories repository;

    @Autowired
    public ClientsService(ClientsRepositories repository){
        this.repository = repository;
    }

    public void salvarCliente(Client cliente){
        validarCliente(cliente);
        this.repository.salvarCliente(cliente);
    }

    public void validarCliente(Client cliente){

    }
}
