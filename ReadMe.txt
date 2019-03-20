Proyecto manejo de timer y quartz
=================================

La ruta con timer escribe en el log cada minuto.

La ruta con Quartz escribe en el log cada 10 segundos, pero solo se ejecuta 6 veces

Para correr el proyecto, desde consola ejecutar:

    mvn celan camel:run

Desde JBoss developer studio, crear un perfil de ejecuciÃ³n:

	clean camel:run