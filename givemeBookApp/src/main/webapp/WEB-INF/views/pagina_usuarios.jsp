<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css"> 
<script src="./js/ajax-utils.js"
        type="text/javascript"></script>
<script src="./js/ajax-data.js"
        type="text/javascript"></script>
</head>
<body>
	 <jsp:include page="header.jsp" flush="true" />
        <div id="contenedor">    
			<section>
				<article>
					<hgroup>
						<h3>Todos los Usuarios</h3>
					</hgroup>
					<p>
						   <form action="#">
						  
						   </form>
						   <p/>
						   <table>
								<tr>
									<td><label>Codigo</label></td><td><input type="text" name="codigoLibro" value=""></td>
									<td><input type="submit" name="buscarLibrp" value="Buscar"></td>
									<td>  <input type="submit" value="Ver todos los usuarios"
						         		 onclick='infoTabla("tabla-usuario")'/> </td>
								</tr>
							</table>	
						   <div id="tabla-usuario"></div>
					</p>   
				</article>    
			</section>
        </div>
		
       
</body>
</html>