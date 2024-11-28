package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import ru.appline.logic.Information;
import ru.appline.logic.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculator")

public class ServletCalculator extends HttpServlet {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");

        StringBuffer sb = new StringBuffer();
        PrintWriter pw = response.getWriter();
        Information information = new Information();
        Result result = new Result();
        String line;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }

        JsonObject jObj = gson.fromJson(String.valueOf(sb), JsonObject.class);

        double a = jObj.get("a").getAsDouble();
        double b = jObj.get("b").getAsDouble();
        char math = jObj.get("math").getAsCharacter();

        if (math =='+')
        {
            result.result = a + b;
            pw.print(gson.toJson(result));
        }
        if (math =='-')
        {
            result.result = a - b;
            pw.print(gson.toJson(result));
        }
        if (math =='*')
        {
            result.result = a * b;
            pw.print(gson.toJson(result));
        }
        if (math =='/')
        {
            result.result = a / b;
            pw.print(gson.toJson(result));
        }
        if ((math !='/')||(math !='*')||(math !='+')||(math !='-'))
        {
            information.info = "Некорректное значение";
            pw.print(gson.toJson(information));
        }
    }
}