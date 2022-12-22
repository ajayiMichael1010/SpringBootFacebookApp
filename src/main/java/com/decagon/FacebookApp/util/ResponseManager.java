package com.decagon.FacebookApp.util;

import com.decagon.FacebookApp.pojos.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@AllArgsConstructor

@Data
@Service
public class ResponseManager<T> {
    public ApiResponse<T> success(T successMessage){
        return new ApiResponse<T>("Request successful",true,successMessage);
    }
    public ApiResponse<T> error(T errorMessage){
        return new ApiResponse<T>("Request failed",false,errorMessage);
    }
}
