package com.paolacodes.admin.catalogo.domain;

import com.paolacodes.admin.catalogo.domain.validation.ValidationHandler;


import java.util.Objects;

public abstract class Entity<ID extends Identifier> {
    protected final ID id;

    protected Entity(ID id) {
        Objects.requireNonNull(id, "'id'should not be null");
        this.id = id;
    }

    public abstract void validate(ValidationHandler haldler);

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
