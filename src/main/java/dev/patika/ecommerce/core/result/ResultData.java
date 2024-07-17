package dev.patika.ecommerce.core.result;


// SONUÇ İÇİN DATA SINIFI OLUŞTURUCAZ AMA GENERİC YAPIDA OLUCAK !

import lombok.Getter;

@Getter
public class ResultData<T> extends Result {
    private T data;


    public ResultData(boolean status, String message, String code,T data) {
        super(status, message, code);
        this.data = data;
    }

}
