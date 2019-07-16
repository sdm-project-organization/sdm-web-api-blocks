package com.mo.blocks.controllers;

import com.mo.blocks.models.entities.Server;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/server")
public class ServerController {

    // [GET] /api/server
    @RequestMapping(method = RequestMethod.GET)
    public void getServers() {

    }

    // [POST] /api/server
    @RequestMapping(method = RequestMethod.POST)
    public void createServers() {

    }

    // [GET] /api/server/serverid/{serverId}
    @RequestMapping(path = "/serverid/{serverId}", method = RequestMethod.GET)
    public List<Server> getServer(@PathVariable int serverId) {
        return null;
    }

    // [PUT] /api/server/serverid/{serverId}
    @RequestMapping(path = "/serverid/{serverId}", method = RequestMethod.PUT)
    public List<Server> updateServer(@PathVariable int serverId) {
        return null;
    }

    // [DELETE] /api/server/serverid/{serverId}
    @RequestMapping(path = "/serverid/{serverId}", method = RequestMethod.DELETE)
    public List<Server> deleteServer(@PathVariable int serverId) {
        return null;
    }


}
