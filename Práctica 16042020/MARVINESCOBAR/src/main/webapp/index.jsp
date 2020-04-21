<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<script src="http://code.jquery.com/jquery-latest.js">
	</script>
<script type="text/javascript">
	$(document).ready(function() {
		
         var btn = $('#carga').val();
         $.post('serveletcontroler',{


         },function(respose){
         let datos = JSON.parse(respose);
         //console.log(datos);

         var tabladatos = document.getElementById('tablaDatos');

         for(let item of datos){
         	
         	tabladatos.innerHTML +=`
                <tr>
                <td>${item.Id}</td>
                <td>${item.Nombre}</td>
                <td>${item.Apellido}</td>
                <td>${item.Edad}</td>
                <td>${item.Direccion}</td>
                <td>${item.Dui}</td>
                <td>${item.Nit}</td>
                <td>${item.grupoDeClaseProgramacion3Alquepertenece}</td>
                <td>${item.utimaNotaObtenidaEnProgramacion2}</td>
                <td><a href="serveletcontroler?btn=ELIMINAR&Id=${item.Id}" class="btn btn-warning">ELIMINAR</a>
                <a href="funciones.jsp?idBus=${item.Id}&Ncl=${item.Nombre}&apellidocl=${item.Apellido}&edadcl=${item.Edad}&direccl=${item.Direccion}&duicl=${item.Dui}&nitcl=${item.Nit}&grpcl=${item.grupoDeClaseProgramacion3Alquepertenece}&ntcl=${item.utimaNotaObtenidaEnProgramacion2}" class="btn btn-danger">ACTUALIZAR</a> </td>

                </tr>
         	`
         }
   
		});
	});
</script>

<body>


<a href="funciones.jsp" class="btn btn-info">AGREGAR</a>


<table class=" table table-dark"  id="tablaDatos">
	
	<thead>
		
		<th>Id</th>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>Edad</th>
		<th>Direccion</th>
		<th>Dui</th>
		<th>Nit</th>
		<th>grupoDeClaseProgramacion3Alquepertenece</th>
		<th>utimaNotaObtenidaEnProgramacion2</th>
        <th>OPCIONES</th>
		<tbody></tbody>

	</thead>
</table>

</form>






</body>	
</html>
