package com.paolacodes.admin.catalogo.application.category.create;

import java.util.Objects;

public record CreateCategoryCommand(String name, String description, boolean isActive) {

    public static CreateCategoryCommand with(final String aName, final String aDescription, final boolean isActive){

        return new CreateCategoryCommand(aName, aDescription, isActive);
    }

}
