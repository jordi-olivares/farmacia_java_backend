package com.olivares.farmacia.controllers.controllersImpl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olivares.farmacia.commons.ClienteGetRequestVO;
import com.olivares.farmacia.controllers.ClienteController;
import com.olivares.farmacia.services.ClienteService;



@RestController
@RequestMapping("/cliente")
public class ClienteControllerImpl implements ClienteController{
    private final ClienteService clienteService;

    public ClienteControllerImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    @RequestMapping(path = "get/{id}",method = RequestMethod.GET)
    public ClienteGetRequestVO getCliente(@PathVariable(value = "id") Long id) {
        return clienteService.getById(id);
    }
    
}
