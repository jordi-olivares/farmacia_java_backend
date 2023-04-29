package com.olivares.farmacia.services.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivares.farmacia.commons.ClienteGetRequestVO;
import com.olivares.farmacia.model.ClienteDO;
import com.olivares.farmacia.repositories.ClienteRepository;
import com.olivares.farmacia.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteGetRequestVO getById(Long id) {
        ClienteDO clienteDO=clienteRepository.findById(id).orElse(null);
        if(clienteDO!=null){
            ClienteGetRequestVO response=new ClienteGetRequestVO();
            response.setNombre(clienteDO.getNombre());
            response.setApellidoPATERNO(clienteDO.getApellidoPATERNO());
            response.setApellidoMaterno(clienteDO.getApellidoMaterno());
            response.setCorreo(clienteDO.getCorreo());
            return response;
        }
        
        return null;
    }
    
}
