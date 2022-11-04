package com.Expense.ExpenseManagement.controller;

import com.Expense.ExpenseManagement.Entity.Login;
import com.Expense.ExpenseManagement.Entity.SignUp;
import com.Expense.ExpenseManagement.service.Signupservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SignUpcontroller {
    @Autowired
    private Signupservice service;
    @PostMapping("/addDetails")
    public SignUp addSignUp(@RequestBody SignUp e){
        return service.saveSignUp(e);
    }

    @GetMapping("/Signup")
    public List<SignUp> getSignUP(){
        return service.getSignUp();
    }

    @GetMapping("/Login")
    public boolean CheckLogin(@RequestBody Login a){
        List <SignUp> findlist  = service.getSignUp();
        for (int i=0; i< findlist.size(); i++){
            if (findlist.get(i).getEmail()==a.getEmailA() && findlist.get(i).getPassword()==a.getPass()) {
                return true;
            }
        }
        return false;
    }

}
