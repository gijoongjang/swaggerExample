package com.swagger.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

    @ApiOperation(value = "Swagger Test", notes = "Api Test")
    @GetMapping("/test")
    public ResponseEntity<?> test() {
        Member m = new Member();
        m.setName("장기중");
        m.setAge("26");
        m.setSex("남자");

        return ResponseEntity.ok(m);
    }
}
