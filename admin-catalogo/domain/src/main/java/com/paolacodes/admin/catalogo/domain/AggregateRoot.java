package com.paolacodes.admin.catalogo.domain;

import com.paolacodes.admin.catalogo.domain.validation.ValidationHandler;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    protected AggregateRoot(final ID id){
        super(id);
    }

}
