package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    void save(Item item);

    //! 파라미터가 하나인 경우엔 @Param을 넣지 않아도 되는데, 2개 이상인 경우는 @Param을 넣어줘야 한다.
    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto itemUpdateDto);

    List<Item> findAll(ItemSearchCond itemSearchCond);

    Optional<Item> findById(Long id);
}
