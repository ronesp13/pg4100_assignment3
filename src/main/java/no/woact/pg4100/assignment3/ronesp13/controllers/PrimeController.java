package no.woact.pg4100.assignment3.ronesp13.controllers;

import no.woact.pg4100.assignment3.ronesp13.models.PrimeHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/prime-check")
public class PrimeController extends HttpServlet {

    private static final String PRIME_PAGE = "prime";
    private static final String NOT_PRIME_PAGE= "not_a_prime";
    private static final String INVALID_INPUT = "invalid_input";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String address;
        String value = request.getParameter("prime");
        PrimeHandler prime = new PrimeHandler(value);
        if (!prime.isInteger()) {
            address = INVALID_INPUT;
        } else {
            if (prime.isPrime()) {
                address = PRIME_PAGE;
            } else {
                address = NOT_PRIME_PAGE;
            }
        }
        request.setAttribute("value", value);
        request.getRequestDispatcher(address + ".jsp").forward(request, response);
    }
}
