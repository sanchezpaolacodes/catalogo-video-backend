package com.paolacodes.admin.catalogo.application;

import com.paolacodes.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute(){
        return new Category();
    }
}