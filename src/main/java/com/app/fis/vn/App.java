package com.app.fis.vn;

import com.app.fis.vn.route.ContactRoute;
import com.app.fis.vn.route.UserRoute;
import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        Gson gson = new Gson();
        UserRoute.configureRoutes(gson);
        ContactRoute.configureRoutes(gson);
    }

}