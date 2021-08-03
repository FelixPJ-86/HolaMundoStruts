
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<style>

table, th, td {
  border: 1px solid black;
}

table {
  width: 100%;
}

fieldset{
width: 60%;
}

</style>
<title>Lista</title>
<html:base/>
</head>
<body bgcolor="white">
<h2>Lista</h2>



 <html:link page="/Welcome.do" >Volver</html:link>
<br>
<br>
<br>


  <fieldset >
                    <legend>
                        <b>Lista de Personas: </b>
                    </legend>
                       <table  >
                                 <thead>
                                    <tr>
                            <th>
                                  <label for="nombre" class="normal">Nombre </label>
                            </th>
                            <th>
                                   <label for="Apellido1" class="normal">Apellido1 </label>
                            </th>
                                   <th>
                                   <label for="Apellido2" class="normal">Apellido2 </label>
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        <logic:notEmpty name="listaPersonasBean">
                        <logic:iterate id="per" name="listaPersonasBean" indexId="index">
                          <tr style="background-color: #FFFFFF; color: #336699;" >
                          <td ><bean:write name="per" property="nombre" />
                          </td>
                          <td><bean:write name="per" property="apellido1" />
                          </td>
                            <td><bean:write name="per" property="apellido2" />
                          </td>
                          </tr>
                        </logic:iterate>
                        </logic:notEmpty >
                        </tbody>
                    </table>
                </fieldset>



</body>
</html:html>
