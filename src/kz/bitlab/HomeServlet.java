package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home")

    public class HomeServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ArrayList<Student>studentArrayList=DBmanager2.getallstudents();
            System.out.println(studentArrayList);
            request.setAttribute("studentter",studentArrayList);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }

    }

