
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title>inicio</title>
<html:base/>
</head>
<body bgcolor="white">
<h2>página de inicio</h2>


 <logic:equal name="falloNombre" value="false" scope="request">
   <p>nombre: <bean:write name="inicioBean" property="nombre" /></p> 
 </logic:equal>
 <logic:equal name="falloNombre" value="true" scope="request">
   <p style="color:red">Tiene que insertar un nombre</p> 
 </logic:equal>



 <logic:equal name="falloApellidos" value="false" scope="request">
  <p>apellidos: <bean:write name="inicioBean" property="apellidos" /></p>  
 </logic:equal>  
 <logic:equal name="falloApellidos" value="true" scope="request">
  <p style="color:red">Tiene que insertar un apellido</p>  
 </logic:equal>


 <html:link page="/Welcome.do" >Volver</html:link>


</body>
</html:html>
