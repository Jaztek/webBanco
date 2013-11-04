<%@page import="com.fpmislata.datos.EntidadBancariaDAOImplhibernate"%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAO"%>
<%@page import="java.util.Scanner"%>
<%@page import="com.fpmislata.banco.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.banco.EntidadBancaria"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <link href="css/bootstrap.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
     <!-- Custom styles for this template -->
    <link href="theme.css" rel="stylesheet">
        <style>
            .cabecera{ font-size: 80xp ;padding: 12em;}
           
            table{ clear:left; clear:right;   background-color:green; color:greenyellow;}
            
        </style>
    </head>
     <body>
         <% EntidadBancariaDAOImplhibernate entidadJDBC= new EntidadBancariaDAOImplhibernate();
             EntidadBancaria entidadBancaria= new EntidadBancaria();
    
    String nombre=request.getParameter("nombre");
   
    List <EntidadBancaria> entidadesBancarias = entidadJDBC.encontrarNombre(nombre);
    %>
        
        <div class="navbar-header">
          <h3>Entidades</h3>
        
              
        </div>
    <div class="btn btn-primary">
       
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Casa</a></li>
            <li><a href="#about">Sobre</a></li>
            <li><a href="#contact">Contacto</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pestañas <b class="caret"></b></a>
              
            </li>
          </ul>
          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
        <a href="http://localhost:8084/ejemplo05/?nombre=%B%" >Enviar</a>
     <div class="tabla">
        
        <table  class="btn btn-primary" border="1" align="center"  >
            <% 
   for(EntidadBancaria entidad: entidadesBancarias){
      %>
    <tr> 
        <td> <%= entidadBancaria.getNombreEntidad() %>
        <td> <%= entidadBancaria.getCif() %>
        <td> <%= entidadBancaria.getTipoEntidadBancaria()%>
         <td> <%=nombre%>
        
      
         <%}%>
        
        
       </table>
       </div>
        <button type="button" class="btn">Cancel</button>
        <button type="button" class="btn-info" data-toggle="collapse" data-target=".navbar-collapse">Algo</button>
       
       <a class="btn btn-primary">Cras  </a>
       <a class="btn btn-danger" href="#" style="color: rgb(255, 255, 255); background-image: -webkit-linear-gradient(top, rgb(238, 95, 91), rgb(189, 54, 47)); background-color: rgb(189, 54, 47);">Danger</a>
       <a class="btn btn-danger dropdown-toggle" ><span class="caret"></span></a> 
       
    </body>
</html>
