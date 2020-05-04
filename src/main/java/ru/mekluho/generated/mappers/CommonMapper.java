package ru.mekluho.generated.mappers;

import org.apache.ibatis.annotations.Mapper;
import ru.mekluho.generated.model.SomeType;

import java.util.List;

/**
 * Created by Andrey Nikulin
 * on 01.05.2020
 * mekluho@gmail.com
 */
@Mapper
public interface CommonMapper {

    List<SomeType> selectAllTypes();

}
