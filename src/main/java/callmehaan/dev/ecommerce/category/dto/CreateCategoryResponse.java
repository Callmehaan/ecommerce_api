package callmehaan.dev.ecommerce.category.dto;

import java.util.List;
import java.util.UUID;

public record CreateCategoryResponse(
        String id,
        String name,
        String description,
        String slug,
        List<CreateCategoryResponse> subCategories,
        UUID parentId
) {
}
