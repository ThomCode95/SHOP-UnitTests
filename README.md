# SHOP-UnitTests
Proyecto Shop con tests unitarios agregados

Resumen: Subí el coverage del proyecto a 81.3%, pero tuve problemas haciendo los test para la clase controller y services.

###Algunos problemas con los que me topé.
- No logré hacer un test que hiciera de forma correcta el assert de la función que regresa ResponseEntity<>(pricesResponse, HTTP_STATUS.OK) en PricesController.java.
- No logré hacer un test que hiciera de forma correcta el assert de la función convertEntity2DTO en PricesService.java.
- En SonarQube arreglé todos los issues que marcaba el proyecto, pero no estoy muy seguro como obtener el report.
- Tuve problemas al subir el reporte a GitLab, a pesar de haber creado el repo me decía que no tenía permiso para hacer un push, y que 
el administrador o dueño del proyecto debería hacer el primer push.
- No me dio tiempo de crear el dockerfile.
- Cree un archivo yaml para swagger, pero al momento de ingresar a la url: http://localhost:8090/swagger-ui/index.html en lugar de mostrarlo, descargaba el archivo.
Una vez reiniciado el proyecto me marcaba error y no lo mostraba del todo.
