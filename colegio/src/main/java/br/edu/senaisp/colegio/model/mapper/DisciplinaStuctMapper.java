package br.edu.senaisp.colegio.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.edu.senaisp.colegio.model.Disciplina;
import br.edu.senaisp.colegio.model.dto.DisciplinaClassDTO;

@Mapper
public interface DisciplinaStuctMapper {

	DisciplinaStuctMapper INSTANCE = Mappers.getMapper(DisciplinaStuctMapper.class);

	@Mapping(source = "nomeDisciplina", target = "titulo")
	@Mapping(source = "horas", target = "duracaoH", numberFormat = "###")
	Disciplina toDisciplina(DisciplinaClassDTO dto);

	DisciplinaClassDTO toDTO(Disciplina disciplina);

}
