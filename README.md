# TaskMasterMongoDB
Proyecto unidad 5

1. Modelado 25%
Partiendo del modelo ER realizado en la UD4 , cada miembro del grupo debe seleccionar alguna(s) de las entidades y relaciones y añadir nuevas entidades y relaciones de forma que se tenga un modelo con al menos la siguientes relaciones:

1 relación 1:1
2 relaciones 1:N
1 relación N:N
Las entidades deben contener suficientes atributos con tipos de datos numéricos y categóricos que permitan realizar consultas de agrupamiento empleando funciones de agregado. 

Readaptad el modelo ER al esquema documental de MongoDB, podéis tomar como base el documento SchemaDesign (contenido dentro de la documentación de MongoBD que tienes en el moodle).  Al menos dos de las relaciones entre documentos debe de establecerse por referencia. 

 Haced un esquema visual como el siguiente:

RDBMS vs MongoDB









2. Codificación en Java 75%
 Desde un proyecto java debéis crear la base de datos y generar las colecciones de vuestro esquema y añadir al menos diez documentos en de cada una de las entidades del modelo ER.

Una vez generada la base de datos se deben realizar al menos:

10 operaciones de consulta empleando filtros y proyecciones.
10 operaciones de actualización.
10 operaciones de agregaciones pipeline de las cuales al menos 3 deben realizar operaciones de agrupamiento empleando funciones de agregado y otras 3 funciones de consultas entre diferentes colecciones (empleando la etapa/stage $lookup). Las consultas deben contener al menos dos etapas.
Exportar cada una de las colecciones a un fichero en formato .json. 
Se debe documentar la funcionalidad de cada una de las consultas realizadas ya sea en el propio código o en fichero de texto.

3. Entrega 
Se pide la entrega en la tarea del aula virtual de todo el código , el fichero que documente las consultas (en caso de que no se haga en el código) y las colecciones resultantes en formato .json.
