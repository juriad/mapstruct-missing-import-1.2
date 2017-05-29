package some.mapper;

import org.mapstruct.Mapper;
import some.dto.EntityDTO;
import some.entity.Entity;

@Mapper // (imports = {Tag.class})
public interface EntityMapper {
    Entity fromDTO(EntityDTO dto);
}
