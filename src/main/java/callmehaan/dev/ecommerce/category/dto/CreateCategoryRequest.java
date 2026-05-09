package callmehaan.dev.ecommerce.category.dto;

import java.util.List;
import java.util.UUID;

public record CreateCategoryRequest(
        String name,
        String description,
        String slug,
        UUID parentId,
        boolean active,
        Integer sortOrder
) {
}
