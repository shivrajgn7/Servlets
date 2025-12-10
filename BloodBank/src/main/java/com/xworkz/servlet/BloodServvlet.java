package com.xworkz.servlet;

import com.xworkz.dto.BloodDto;
import com.xworkz.dto.SearchDto;
import com.xworkz.exception.BloodInvalidException;
import com.xworkz.service.BloodServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

@WebServlet(urlPatterns = "/donar",loadOnStartup = 1)
public class BloodServvlet extends HttpServlet {
    public BloodServvlet(){
        System.out.println("Servlet is created");
    }

    BloodServiceImpl bloodService=new BloodServiceImpl();
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String name1=req.getParameter("name");
        String bGroup1=req.getParameter("bgroup");
        String email1 =req.getParameter("email");
        String age1 =req.getParameter("age");
        String weight1=req.getParameter("weight");
        String  height1=req.getParameter("height");
        String gender1=req.getParameter("gender");
        String address1=req.getParameter("address");
        String number1=req.getParameter("number");
        System.out.println("Values from input field : "+name1+" " +bGroup1+" "+email1+" "+age1+" "+height1+" "+weight1+" "+gender1+" "+address1+" "+number1);

        BloodDto bloodDto=new BloodDto(name1,bGroup1,email1,Integer.parseInt(age1),Integer.parseInt(weight1),Integer.parseInt(height1),gender1,address1,Long.parseLong(number1));
        try {
            bloodService.validSave(bloodDto);
            req.setAttribute("dto",bloodDto);

            req.setAttribute("success","Register Successfull");
            req.getRequestDispatcher("Result.jsp").forward(req,resp);

        } catch (BloodInvalidException e) {
                e.printStackTrace();
                req.setAttribute("error","Invalid Input");
        }

        req.getRequestDispatcher("Result.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String number = request.getParameter("number");

        if (number == null || number.isEmpty()) {
            request.setAttribute("message", "Please enter a number");
            request.getRequestDispatcher("SearchDonor.jsp").forward(request, response);
            return;
        }

        System.out.println("Searching number: " + number);

        SearchDto searchDto = new SearchDto(Long.parseLong(number));
        Optional<BloodDto> optionalBloodDto = this.bloodService.findByPhone(searchDto);

        if (optionalBloodDto.isPresent()) {
            request.setAttribute("dto", optionalBloodDto.get());
        } else {
            request.setAttribute("message", "Search results not found");
        }

        request.getRequestDispatcher("SearchDonor.jsp").forward(request, response);
    }

}
