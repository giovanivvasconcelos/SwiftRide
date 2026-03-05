package br.com.swiftride.servlet;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carName = req.getParameter("car-name");

        Map<String, String> carData = new HashMap<>();
        carData.put("car-name", carName);

        Gson gson = new Gson();
        String jsonOutput = gson.toJson(carData);

        System.out.println(carName);
        System.out.println(jsonOutput);

        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
