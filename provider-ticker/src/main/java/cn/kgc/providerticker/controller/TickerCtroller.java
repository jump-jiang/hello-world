package cn.kgc.providerticker.controller;


import cn.kgc.providerticker.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TickerCtroller {
    @Autowired
    TicketService ticketService;

    @RequestMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }



}
