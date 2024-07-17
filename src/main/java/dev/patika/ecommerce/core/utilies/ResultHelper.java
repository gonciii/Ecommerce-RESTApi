package dev.patika.ecommerce.core.utilies;

import dev.patika.ecommerce.core.result.Result;
import dev.patika.ecommerce.core.result.ResultData;
import dev.patika.ecommerce.dto.response.CursorResponse;
import org.springframework.data.domain.Page;

public class ResultHelper {
    // her veri eklediğinde geriye dönen mesaj için oluşturuldu

    public static <T> ResultData<T> created(T data) {
        return new ResultData<>(true,Msg.CREATED,"201",data);
    }

    public static <T> ResultData<T> validateError(T data) {
        return new ResultData<>(false, Msg.VALIDATE_ERROR,"400",data);
    }

    public static <T> ResultData<T> success(T data) {
        return new ResultData<>(true,Msg.OK,"200",data);
    }


    // geriye result döndürüyor dataya gerek yok
    public static Result notFoundError(String msg) {
        return new Result(true,msg,"404");
    }

    // page
    public static Result pageError(String msg) {
        return new Result(false,Msg.NOT_PAGE_ERROR,"404");

    }
    public static  Result ok() {
        return new Result(true,Msg.OK,"200");
    }

}
