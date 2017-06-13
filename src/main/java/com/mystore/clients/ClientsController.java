package com.mystore.clients;

import com.mystore.clients.domain.Client;
import com.mystore.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ClientsController {


    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/clients/grid", method = RequestMethod.GET)
    public ModelAndView grid() {

        ModelAndView model = new ModelAndView();
        model.setViewName("clients");
        return model;

    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public @ResponseBody List<Client> clients(){
        return clientService.getAllClients();
    }


}
