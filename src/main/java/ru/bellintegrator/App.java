package ru.bellintegrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class App extends HttpServlet {
    @Autowired
    LocationsDao locationsDao;

    @Override
    @Transactional
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Locations locations = new Locations();
        locations.setLoc("Moscow");
        try {
            locationsDao.saveLocations(locations);
        }catch (Exception e) {
            System.out.println("Error!!!!!!!!!!!!");
        }

        resp.getWriter().println("Hello from servlet");
    }
}
