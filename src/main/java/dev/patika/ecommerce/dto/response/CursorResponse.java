package dev.patika.ecommerce.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// PAGE İŞLEMİNDE DÖNEN RESPONSE İÇİN KENDİMİZE GÖRE UYARLMAK İÇİN OLUŞTURALAN BİR CLASS

@Data
@NoArgsConstructor
@AllArgsConstructor



public class CursorResponse<T> {
    private  int pageNumber;
    private int pageSize;
    private long totalElement;
    private List<T> items;


}
