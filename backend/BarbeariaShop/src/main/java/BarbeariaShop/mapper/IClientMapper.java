package BarbeariaShop.mapper;

import BarbeariaShop.controller.request.SaveClientRequest;
import BarbeariaShop.controller.request.UpdateClientRequest;
import BarbeariaShop.controller.response.ClientDetailResponse;
import BarbeariaShop.controller.response.ListClientResponse;
import BarbeariaShop.controller.response.SaveClientResponse;
import BarbeariaShop.controller.response.UpdateClientResponse;
import BarbeariaShop.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
