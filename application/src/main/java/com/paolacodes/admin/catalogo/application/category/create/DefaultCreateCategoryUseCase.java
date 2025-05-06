package com.paolacodes.admin.catalogo.application.category.create;

import com.paolacodes.admin.catalogo.domain.category.Category;
import com.paolacodes.admin.catalogo.domain.category.CategoryGateway;
import com.paolacodes.admin.catalogo.domain.validation.handler.Notification;

import java.util.Objects;

public class DefaultCreateCategoryUseCase extends  CreateCategoryUseCase{

    private final CategoryGateway categoryGateway;

    public DefaultCreateCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public CreateCategoryOutput execute(final CreateCategoryCommand aCommand) {
        final var aName = aCommand.name();
        final var aDescription = aCommand.description();
        final var isActive = aCommand.isActive();

        final var notification = Notification.create();
        final var aCategory = Category.newCategory(aName, aDescription,isActive);
        aCategory.validate(notification);

        if(notification.hasError()){
            //
        }

        return CreateCategoryOutput.from(this.categoryGateway.create(aCategory));
    }
}
