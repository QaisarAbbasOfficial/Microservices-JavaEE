package com.websool.productservice.models.response;

/*
 * @created 28/09/2022 - 4:38 PM
 * @project microservices-project
 * @package com.websool.orderservice.models.response
 * @author Qaisar Abbas
 */

public class ResponseApi {
    public int code = 200;
    public String message = "Success!";
    public Object data;

    public ResponseApi(Object data){
        this.data = data;
    }

    public ResponseApi(int code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseApi(int code, Object data){
        this.code = code;
        this.data = data;
    }

}
