package org.github.snambi.restauth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping( path = "/getuser")
    @PreAuthorize("hasAuthority('SCOPE_Demo_id/user.read')")
    public String getUser(){
        return "Access granted: reading user";
    }

    @PostMapping( path = "/updateuser")
    @PreAuthorize("hasAuthority('SCOPE_Demo_id/user.update')")
    public String writeUser(){
        return "Access granted: updating user";
    }


}
