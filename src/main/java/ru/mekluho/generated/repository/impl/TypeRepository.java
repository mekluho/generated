package ru.mekluho.generated.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.mekluho.generated.mappers.CommonMapper;
import ru.mekluho.generated.model.SomeType;
import ru.mekluho.generated.repository.ITypeRepository;

import java.util.List;

/**
 * Created by Andrey Nikulin
 * on 01.05.2020
 * mekluho@gmail.com
 */
@Repository
public class TypeRepository implements ITypeRepository {

    private final CommonMapper commonMapper;

    @Autowired
    public TypeRepository(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }

    @Override
    public List<SomeType> getTypes() {
        return commonMapper.selectAllTypes();
    }
}
