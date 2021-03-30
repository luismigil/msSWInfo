package com.info.sw.ms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.info.sw.ms.dto.FilmsDTO;
import com.info.sw.ms.model.Films;

@Mapper(componentModel = "spring")
public interface FilmsMapper extends EntityMapper<FilmsDTO, Films>{
	
	FilmsMapper INSTANCE = Mappers.getMapper(FilmsMapper.class);
	
	@Mapping(target = "starshipsIds", expression = "java(entity.getStarshipsIds())")
	@Mapping(target = "charactersIds", expression = "java(entity.getCharactersIds())")
	public FilmsDTO toDTO(Films entity);

}
