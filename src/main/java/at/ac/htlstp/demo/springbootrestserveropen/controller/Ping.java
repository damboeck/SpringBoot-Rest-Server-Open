package at.ac.htlstp.demo.springbootrestserveropen.controller;

import at.ac.htlstp.demo.springbootrestinterface.endpoints.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static at.ac.htlstp.demo.springbootrestinterface.endpoints.RestEndpoints.ping;

@RestController
@RequestMapping
public class Ping {

    @GetMapping(RestEndpoints.ping)
    public ResponseEntity<String> pingGet()   {
        return ResponseEntity.ok("pong");
    }


}
