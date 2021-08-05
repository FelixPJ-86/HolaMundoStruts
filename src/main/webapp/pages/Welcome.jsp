<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">
<h2>Hola Mundo Struts Inicio</h2>


<html:form action="inicio">
  <table>
  <tr>
  <td><label>nombre</label>
  </td>
  <td><html:text property="nombre" size="40" maxlength="40"/></td>
  </tr>
    <tr>
  <td><label>
apellidos</label>
  </td>
  <td><html:text property="apellidos" size="40" maxlength="40"/></td>
  </tr>
  
      <tr>
  <td >   
      <html:submit property="submit">
     enviar
      </html:submit>
  </td>
 </tr>
  </table>
  
</html:form>
  
  
 <html:link page="/lista.do" >Mostrar Lista</html:link>
  

     
     
     
</body>
</html:html>
