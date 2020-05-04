package ru.mekluho.generated.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mekluho.generated.model.SomeType;
import ru.mekluho.generated.repository.impl.TypeRepository;
import ru.mekluho.generated.service.ITypeService;

import java.util.List;

/**
 * Created by Andrey Nikulin
 * on 01.05.2020
 * mekluho@gmail.com
 */
@Service
public class TypeService implements ITypeService {

    private final TypeRepository typeRepository;

    @Autowired
    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<SomeType> getTypes() {
        return typeRepository.getTypes();
    }
}
