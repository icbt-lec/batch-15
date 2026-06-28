/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.my.web.resources;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import libs.Student;
import libs.Utils;

/**
 *
 * @author ICBT
 */
@Path("students")
public class StudentResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){
        
        List<Student> students = Utils.getStudents();    
        Gson gson = new Gson();
        return Response
                .status(Response.Status.OK)
                .entity(gson.toJson(students))
                .build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") int id){
        
        Student student = Utils.getStudent(id);    
        Gson gson = new Gson();
        return Response
                .status(Response.Status.OK)
                .entity(gson.toJson(student))
                .build();
    }
}
