package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    void insertBatch(List<DishFlavor> flavors);

    //根據菜品刪除口味數據
    @Delete("delete from dish_flavor where dish_id = #{dish_id}")
    void deleteByDishId(Long dishId);
}
