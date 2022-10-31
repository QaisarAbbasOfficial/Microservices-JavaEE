package com.websool.orderservice.helpers;

/*
 * @created 28/09/2022 - 5:50 PM
 * @project microservices-project
 * @package com.websool.orderservice.helpers
 * @author Qaisar Abbas
 */

import java.util.UUID;

public class Helper {

    private Helper(){}
    public static String GenerateOrderNumber(){
        return UUID.randomUUID().toString();
    }
}
