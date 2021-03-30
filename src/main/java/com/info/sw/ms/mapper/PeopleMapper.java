package com.info.sw.ms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.info.sw.ms.dto.PeopleDTO;
import com.info.sw.ms.model.People;

@Mapper(componentModel = "spring")
public interface PeopleMapper extends EntityMapper<PeopleDTO, People>{
	
	PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);
	
	@Mapping(target = "films", expression = "java(entity.getFilmsBean())")
	@Mapping(target ="filmsCount", expression = "java(entity.getFilms().size())")
	@Mapping(target = "starshipsIds", expression = "java(entity.getStarshipsIds())")
	public PeopleDTO toDTO(People entity);

}
