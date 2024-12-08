package br.edu.utfpr.componenteprodutos.utils;

import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericService<
        TEntity extends IEntity<TPk>,
        TPk,
        TRepo extends JpaRepository<TEntity, TPk>,
        TDto extends IEntity<TPk>,
        TCreateDTO extends IEntity<TPk>,
        TUpdateDTO extends IEntity<TPk>
        > {

    protected final TRepo repository;
    protected final ModelMapper modelMapper;
    protected final Class<TEntity> entityClass;
    protected final Class<TDto> dtoClass;
    protected final Class<TCreateDTO> createDtoClass;
    protected final Class<TUpdateDTO> updateDtoClass;

    protected GenericService(TRepo repository, Class<TEntity> entityClass, Class<TDto> dtoClass, Class<TCreateDTO> createDtoClass, Class<TUpdateDTO> updateDtoClass) {
        this.repository = repository;
        this.modelMapper = new ModelMapper();
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
        this.createDtoClass = createDtoClass;
        this.updateDtoClass = updateDtoClass;
    }


    public TDto create(TCreateDTO entity) {

//        if(repository.existsById(entity.getId())) {
//            throw new RuntimeException("Id already exists");
//        }

        TEntity result = repository.save(modelMapper.map(entity, entityClass));
        var dto = modelMapper.map(result, dtoClass);
        return dto;
    }

    public void delete(TPk id) {
        repository.deleteById(id);
    }

    public TDto findById(TPk id) {
        TEntity result = repository.findById(id).orElse(null);
        return result != null ? modelMapper.map(result, dtoClass) : null;
    }

    public List<TDto> findAll() {
        List<TEntity> result = repository.findAll();
        return result.stream()
                .map(entity -> modelMapper.map(entity, dtoClass))
                .toList();
    }

    public TDto update(TPk id, TUpdateDTO dto) {
        var entity = repository.save(modelMapper.map(dto, entityClass));
        return modelMapper.map(entity, dtoClass);
    }

}
