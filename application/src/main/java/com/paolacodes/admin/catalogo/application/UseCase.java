package com.paolacodes.admin.catalogo.application;

import com.paolacodes.admin.catalogo.domain.category.Category;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anIn);

}