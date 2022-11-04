package com.Expense.ExpenseManagement.service;


import com.Expense.ExpenseManagement.Entity.SignUp;
import com.Expense.ExpenseManagement.repository.SignUprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Signupservice {
    @Autowired
    private SignUprepository repository;

    public SignUp saveSignUp(SignUp e){
        return repository.save(e);
    }
    public List<SignUp> getSignUp(){
        return repository.findAll();
    }

    public SignUp getSignUpId(int id){
        return repository.findById(id).orElse(null);
    }


}
